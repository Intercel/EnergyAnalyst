package au.com.intercel.ems.energyanalyst.service;

import java.util.Collection;

import org.springframework.web.multipart.MultipartFile;

import au.com.intercel.ems.energyanalyst.domain.Customer;
import au.com.intercel.ems.energyanalyst.domain.DailyRecord;

/**
 * The Interface EnergyAnalyticService.
 */
public interface EnergyAnalyticService {

	/**
	 * Gets the customer data.
	 *
	 * @param userId the user id
	 * @return the customer data
	 */
	Customer getCustomerData(String userId);
	
	/**
	 * Gets the customer data.
	 *
	 * @param userId the user id
	 * @param startDate the start date of the billing cycle
	 * @param endDate the end date of the billing cycle
	 * @return the customer data with energy usage prediction
	 */
	Customer getCustomerData(String userId, String startDate, String endDate);

	/**
	 * Import energy data with blocking operation.
	 *
	 * @param file the file
	 * @return the string
	 */
	String importEnergyDataBlocking(MultipartFile file);

	/**
	 * Gets the energy data.
	 *
	 * @param UserId the user id
	 * @return the energy data
	 */
	Collection<DailyRecord> getEnergyData(String UserId);

	
	
	/**
	 * Import energy data with non blocking operation.
	 *
	 * @param file the file
	 * @return the string
	 */
	String importEnergyDataNonBlocking(MultipartFile file);
}
