package au.com.intercel.ems.energyanalyst.service;

import java.io.File;
import java.io.IOException;
import java.util.TimerTask;

import org.springframework.web.multipart.MultipartFile;

import au.com.intercel.ems.energyanalyst.domain.CustomerRepository;
import au.com.intercel.ems.energyanalyst.domain.DailyRecordRepository;
import au.com.intercel.ems.energyanalyst.utils.CSVEnergyFileProcessor;

// TODO: Auto-generated Javadoc
/**
 * The Class EnergyAnalyticCSVFileProcessor.
 */
public class EnergyAnalyticCSVFileProcessor extends TimerTask{
	
	/** The saved file. */
	private File savedFile;
	
	/** The verified file. */
	private File verifiedFile;
	
	/** The customer repository. */
	private CustomerRepository customerRepository;
	
	/** The daily record repository. */
	private DailyRecordRepository dailyRecordRepository;
	
	/**
	 * Instantiates a new energy analytic csv file processor.
	 *
	 * @param file the file
	 * @param customerRepository the customer repository
	 * @param dailyRecordRepository the daily record repository
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public EnergyAnalyticCSVFileProcessor(MultipartFile file, CustomerRepository customerRepository, DailyRecordRepository dailyRecordRepository) throws IOException {
		this.savedFile = CSVEnergyFileProcessor.save(file);
		this.customerRepository = customerRepository;
		this.dailyRecordRepository = dailyRecordRepository;
	}

	/* (non-Javadoc)
	 * @see java.util.TimerTask#run()
	 */
	@Override
	public void run() {
		
		// verify file
		this.verifiedFile = CSVEnergyFileProcessor.verify(savedFile);
		
		//read file and load into db
		try {
			CSVEnergyFileProcessor.load2Db(verifiedFile, customerRepository, dailyRecordRepository);
			
			System.out.println("File " + verifiedFile.getName() + " saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
