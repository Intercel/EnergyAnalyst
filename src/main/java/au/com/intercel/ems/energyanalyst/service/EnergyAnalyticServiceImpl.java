package au.com.intercel.ems.energyanalyst.service;

import java.io.File;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import au.com.intercel.ems.energyanalyst.domain.Customer;
import au.com.intercel.ems.energyanalyst.domain.CustomerRepository;
import au.com.intercel.ems.energyanalyst.domain.DailyRecord;
import au.com.intercel.ems.energyanalyst.domain.DailyRecordRepository;
import au.com.intercel.ems.energyanalyst.utils.CSVEnergyFileProcessor;
import au.com.intercel.ems.energyanalyst.utils.EnergyAnalyst;


/**
 * The Class EnergyAnalyticServiceImpl.
 * 
 * This class implements EnergyAnalyticService interface
 */
@Component("analyticService")
@Transactional
public class EnergyAnalyticServiceImpl implements EnergyAnalyticService {
	
	/** The customer repository. */
	CustomerRepository customerRepository;
	
	/** The daily record repository. */
	DailyRecordRepository dailyRecordRepository;
	
	/**
	 * Instantiates a new energy analytic service interface.
	 *
	 * @param customerRepository the customer repository
	 * @param dailyRecordRepository the daily record repository
	 */
	@Autowired
	public EnergyAnalyticServiceImpl(CustomerRepository customerRepository, DailyRecordRepository dailyRecordRepository) {
		this.customerRepository = customerRepository;
		this.dailyRecordRepository = dailyRecordRepository;
	}

	/* (non-Javadoc)
	 * @see au.com.intercel.ems.energyanalyst.service.EnergyAnalyticService#getCustomerData(java.lang.String)
	 */
	@Override
	public Customer getCustomerData(String userId) {
		return customerRepository.findById(userId);
	}
	
	/* (non-Javadoc)
	 * @see au.com.intercel.ems.energyanalyst.service.EnergyAnalyticService#getCustomerData(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Customer getCustomerData(String userId, String startDate, String endDate) {		
		Customer customer = customerRepository.findById(userId);
		
		double energyUsagePrediction = EnergyAnalyst.getEnergyUsagePrediction(customer, dailyRecordRepository, startDate, endDate);
		
		customer.setEnergyUsagePrediction(energyUsagePrediction);
		
		return customer;
	}

	/* (non-Javadoc)
	 * @see au.com.intercel.ems.energyanalyst.service.EnergyAnalyticService#importEnergyData(org.springframework.web.multipart.MultipartFile)
	 */
	@Override
	public String importEnergyData(MultipartFile file) {
		String status = "";
		try{
			// save file
			File savedFile = CSVEnergyFileProcessor.save(file);
			
			// verify file
			File verifiedFile = CSVEnergyFileProcessor.verify(savedFile);
			
			//read file and load into db
			CSVEnergyFileProcessor.load2Db(verifiedFile, customerRepository, dailyRecordRepository);
			
			status = "File " + file.getOriginalFilename() + " saved";
		} catch (Exception ex){
			ex.printStackTrace();
			status = ex.toString();
		}
		
		return status;
	}

	/* (non-Javadoc)
	 * @see au.com.intercel.ems.energyanalyst.service.EnergyAnalyticService#getEnergyData(java.lang.String)
	 */
	@Override
	public Collection<DailyRecord> getEnergyData(String userId) {		
		return dailyRecordRepository.findByUid(userId);
	}
}
