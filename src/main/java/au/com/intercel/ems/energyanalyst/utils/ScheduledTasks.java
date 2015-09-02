package au.com.intercel.ems.energyanalyst.utils;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import au.com.intercel.ems.energyanalyst.domain.Customer;
import au.com.intercel.ems.energyanalyst.domain.CustomerRepository;
import au.com.intercel.ems.energyanalyst.domain.DailyRecord;
import au.com.intercel.ems.energyanalyst.domain.DailyRecordRepository;

/**
 * The Class ScheduledTasks.
 */
@Component
public class ScheduledTasks {
	
	/** The Constant TEN_SEC. */
	private final static int TEN_SEC= 10000;
	
	/** The Constant THIRTY_SEC. */
	private final static int THIRTY_SEC= 30000;
	
	/** The customer repository. */
	CustomerRepository customerRepository;
	
	/** The daily record repository. */
	DailyRecordRepository dailyRecordRepository;
	
	/**
	 * Instantiates a new scheduled tasks.
	 *
	 * @param customerRepository the customer repository
	 * @param dailyRecordRepository the daily record repository
	 */
	@Autowired
	public ScheduledTasks(CustomerRepository customerRepository, DailyRecordRepository dailyRecordRepository) {
		this.customerRepository = customerRepository;
		this.dailyRecordRepository = dailyRecordRepository;
	}

    /** The Constant dateFormat. */
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * Report current time.
     */
    @Scheduled(initialDelay=THIRTY_SEC, fixedRate=TEN_SEC)
    public void reportCurrentTime() {
        System.out.println("The time is now " + dateFormat.format(new Date()));
    }
    
    /**
     * Analyse.
     * 
     * This function scans database and updates customers' parameters
     */
    @Scheduled(initialDelay=THIRTY_SEC, fixedRate=TEN_SEC)
    public void analyse() {
    	
    	// scan database for the 1 time to calculate standby, daily consumption and type
    	try{
    		Map<String, Double> unsortCustomerMap = new HashMap<String, Double>();
    		
        	for(Customer customer : customerRepository.findAll()){
        		String uid = customer.getId();
        		
        		Collection<DailyRecord> records = dailyRecordRepository.findByUid(uid);
        		
        		double standbyPower = EnergyAnalyst.getDailyStandbyEnergy(records);
        		
        		double averageDailyEnergyConsumption = EnergyAnalyst.getDailyAverageEnergyConsumption(records);
        		
        		double averageDailyCarbonEmission = EnergyAnalyst.getAverageDailyCarbonEmissions(averageDailyEnergyConsumption);
        		
        		String type = EnergyAnalyst.getCustomerType(records);
        		
        		unsortCustomerMap.put(uid, averageDailyEnergyConsumption);
        		
        		customerRepository.save(new Customer(uid, standbyPower, averageDailyEnergyConsumption, averageDailyCarbonEmission, type));
        	}
        	
        	// sort the customers based on their daily consumption
        	Map<String, Double> sortedCustomerMap = EnergyAnalyst.sortByComparator(unsortCustomerMap);
        	
        	String[] sortedRankings = Arrays.copyOf(sortedCustomerMap.keySet().toArray(), sortedCustomerMap.keySet().toArray().length, String[].class);
    		
        	List<String> sorted = Arrays.asList(sortedRankings);
        	
        	// find the rank and write it back to database
        	for(Customer customer : customerRepository.findAll()){
        		double index = (double)sorted.indexOf(customer.getId()) + 1;
        		customer.setRank(index/customerRepository.count());
        		customerRepository.save(customer);
        	}
        	
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}

    }
}
