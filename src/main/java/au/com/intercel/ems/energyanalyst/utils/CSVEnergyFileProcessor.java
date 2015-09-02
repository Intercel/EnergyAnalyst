package au.com.intercel.ems.energyanalyst.utils;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.zip.GZIPInputStream;

import org.springframework.web.multipart.MultipartFile;

import au.com.bytecode.opencsv.CSVReader;
import au.com.intercel.ems.energyanalyst.domain.Customer;
import au.com.intercel.ems.energyanalyst.domain.CustomerRepository;
import au.com.intercel.ems.energyanalyst.domain.DailyRecord;
import au.com.intercel.ems.energyanalyst.domain.DailyRecordRepository;
import au.com.intercel.ems.energyanalyst.domain.IntervalRecord;

/**
 * The Class CSVEnergyFileProcessor.
 * 
 * this class process CSV files.
 */
public class CSVEnergyFileProcessor {
	
	/** The Constant RECEIVED_DIR. */
	public final static File RECEIVED_DIR = new File("Received");

	/**
	 * Save.
	 * 
	 * It receives file from remote and stored on local disk.
	 *
	 * @param file the csv file
	 * @return the file handler
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static File save(MultipartFile file) throws IOException {
		File savedFile = new File(
				RECEIVED_DIR.toString() + System.getProperty("file.separator") + file.getOriginalFilename());

		if (!RECEIVED_DIR.exists()) {
			RECEIVED_DIR.mkdir();
		}

		if (!file.isEmpty()) {
			byte[] bytes = file.getBytes();
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(savedFile));
			stream.write(bytes);
			stream.close();
		}

		return savedFile;
	}

	/**
	 * Creates the interval record.
	 *
	 * @param string the CSV string
	 * @return the interval record
	 */
	private static IntervalRecord createIntervalRecord(String string) {
		return new IntervalRecord(Double.valueOf(string));
	}

	/**
	 * Verify.
	 *
	 * It verifies the uploaded package.
	 *
	 * @param savedFile the saved file
	 * @return the file
	 */
	public static File verify(File savedFile) {
		// TODO Auto-generated method stub
		return savedFile;
	}

	/**
	 * Load CSV to database
	 *
	 * @param verifiedFile the verified CSV file
	 * @param customerRepository the customer repository
	 * @param dailyRecordRepository the daily record repository
	 * @throws Exception the exception
	 */
	public static void load2Db(File verifiedFile, CustomerRepository customerRepository, DailyRecordRepository dailyRecordRepository) throws Exception {
		FileInputStream fis = new FileInputStream(verifiedFile);
		GZIPInputStream gis = new GZIPInputStream(fis);
		InputStreamReader isr = new InputStreamReader(gis);
		BufferedReader br = new BufferedReader(isr);
		CSVReader reader = new CSVReader(br);
		String [] nextLine;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
		
		while ((nextLine = reader.readNext()) != null) {
			
			String id = nextLine[0];
			
			Date date = sdf.parse(nextLine[1]);
			
			List<IntervalRecord> records = new ArrayList<IntervalRecord>();
			for(int i=2; i<nextLine.length; i++){
				IntervalRecord record = CSVEnergyFileProcessor.createIntervalRecord(nextLine[i]);
				
				records.add(record);
			}
			
			DailyRecord dailyRecord = new DailyRecord(id, date, records);
			
			dailyRecordRepository.save(dailyRecord);
			
			if(customerRepository.findById(id) == null){
				customerRepository.save(new Customer(id));
			}
		}
		
		reader.close();
		br.close();
		isr.close();
		gis.close();
		fis.close();
		
	}

}
