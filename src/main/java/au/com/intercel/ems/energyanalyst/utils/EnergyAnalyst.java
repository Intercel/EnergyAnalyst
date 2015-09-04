package au.com.intercel.ems.energyanalyst.utils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.Days;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import au.com.intercel.ems.energyanalyst.domain.Customer;
import au.com.intercel.ems.energyanalyst.domain.DailyRecord;
import au.com.intercel.ems.energyanalyst.domain.DailyRecordRepository;

/**
 * The Class EnergyAnalyst.
 * 
 * This class provide analytic computation service.
 */
public class EnergyAnalyst {
	
	/** The Constant WINDOW_SIZE. */
	private final static int WINDOW_SIZE = 7;
	
	
	/** The Constant of Shanghai kgCO2/kWh coefficient. 
	 * Value extracted from 2010 年中国区域及省级电网平均二氧化碳排放因子*/
	private final static double SH_CO2_KWH_COEFFICIENT = 0.7934;

	/**
	 * Gets the daily standby energy.
	 * 
	 * It calculates the daily standby energy in the unit of kWh.
	 *
	 * @param records the collection of daily records
	 * @return the average daily standby energy in the unit of kWh
	 * @throws JsonParseException the json parse exception
	 * @throws JsonMappingException the json mapping exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static double getDailyStandbyEnergy(Collection<DailyRecord> records) throws JsonParseException, JsonMappingException, IOException {

		DailyRecord[] recordsArray = records.toArray(new DailyRecord[records.size()]);
		
		double sumOfStandby = 0;
		for(int i=0; i<WINDOW_SIZE; i++){
			sumOfStandby += recordsArray[recordsArray.length - 1 - i].getStandbyPower();
		}
		
		return sumOfStandby/WINDOW_SIZE;
	}

	/**
	 * Gets the daily average energy consumption.
	 * 
	 * It calculates the daily energy consumed in the unit of kWh.
	 *
	 * @param records the collection of daily records
	 * @return the daily average energy consumption in the unit of kWh
	 * @throws JsonParseException the json parse exception
	 * @throws JsonMappingException the json mapping exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static double getDailyAverageEnergyConsumption(Collection<DailyRecord> records) throws JsonParseException, JsonMappingException, IOException {
		DailyRecord[] recordsArray = records.toArray(new DailyRecord[records.size()]);
		
		double sumOfConsumedEnergy = 0;
		for(int i=0; i<WINDOW_SIZE; i++){
			sumOfConsumedEnergy += recordsArray[recordsArray.length - 1 - i].getTotalConsumedEnergy();
		}
		return sumOfConsumedEnergy/WINDOW_SIZE;
	}

	
	/**
	 * Gets the average daily CO2 emission.
	 *
	 * @param averageDailyConsumption the average daily consumption in the unit of kWh
	 * @return the average daily carbon emissions in the unit of kg
	 */
	public static double getAverageDailyCarbonEmissions(double averageDailyConsumption) {
		return averageDailyConsumption * SH_CO2_KWH_COEFFICIENT;
	}

	/**
	 * Gets the customer type.
	 *
	 * @param records the records
	 * @return the customer type
	 */
	public static String getCustomerType(Collection<DailyRecord> records) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Sort the map
	 *
	 * @param unsortCustomerMap the unsorted customer map
	 * @return the sorted customer map
	 */
	public static Map<String, Double> sortByComparator(Map<String, Double> unsortCustomerMap) {
		// Convert Map to List
		List<Map.Entry<String, Double>> list = 
			new LinkedList<Map.Entry<String, Double>>(unsortCustomerMap.entrySet());
 
		// Sort list with comparator, to compare the Map values
		Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
			public int compare(Map.Entry<String, Double> o1,
                                           Map.Entry<String, Double> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
 
		// Convert sorted map back to a Map
		Map<String, Double> sortedMap = new LinkedHashMap<String, Double>();
		for (Iterator<Map.Entry<String, Double>> it = list.iterator(); it.hasNext();) {
			Map.Entry<String, Double> entry = it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	/**
	 * Gets the energy usage prediction.
	 * 
	 * Predicts the energy usage of specified user for specified dates
	 *
	 * @param customer the customer
	 * @param dailyRecordRepository the daily record repository
	 * @param startDate the start date specified
	 * @param endDate the end date specified
	 * @return the energy usage prediction in the unit of kWh
	 */
	public static double getEnergyUsagePrediction(Customer customer, DailyRecordRepository dailyRecordRepository, String startDate, String endDate) {
		double energyUsagePrediction = Double.NaN;
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date start = dateFormat.parse(startDate);
			Date end = dateFormat.parse(endDate);
			
			if (start.compareTo(end)<0){
				System.out.println("start is older");
				
				Map<Date, Double> historicalEnergyUsage = getHistoricalEnergyUsage(customer, dailyRecordRepository, start, end);
				
				int numberOfRecords = historicalEnergyUsage.size();
				double historicalEnergyUsageSummation = 0;
				
				for(double record : historicalEnergyUsage.values()){
					historicalEnergyUsageSummation += record;
				}
				
				int totalNumberOfDays = Days.daysBetween(new DateTime(start), new DateTime(end)).getDays() + 1;
				
				energyUsagePrediction = historicalEnergyUsageSummation + ( customer.getAverageDailyConsumption() * (totalNumberOfDays - numberOfRecords ) );
				
			}else if(start.compareTo(end)>0){
				System.out.println("end is older");
			}
			else if (start.compareTo(end)==0){
				energyUsagePrediction = customer.getAverageDailyConsumption();
			}
		} catch (ParseException | IOException e) {
			e.printStackTrace();
		}
		
		return energyUsagePrediction;
	}

	/**
	 * Gets the historical energy usage records.
	 * 
	 * Read the database and returns all recored energy usage between the specified dates.
	 *
	 * @param customer the customer
	 * @param dailyRecordRepository the daily record repository
	 * @param start the start date specified
	 * @param end the end date specified
	 * @return the historical energy usage records
	 * @throws JsonParseException the json parse exception
	 * @throws JsonMappingException the json mapping exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private static Map<Date, Double> getHistoricalEnergyUsage(Customer customer, DailyRecordRepository dailyRecordRepository, Date start, Date end) throws JsonParseException, JsonMappingException, IOException {
		Map<Date, Double> historicalEnergyUsage = new HashMap<Date, Double>();
		
		Collection<DailyRecord> historicalDailyRecords = dailyRecordRepository.findByDateBetweenAndUidIs(start, end, customer.getId());
		
		for(DailyRecord record : historicalDailyRecords){
			
			historicalEnergyUsage.put(record.getDate(), record.getTotalConsumedEnergy());
		}
		
		return historicalEnergyUsage;
	}

}
