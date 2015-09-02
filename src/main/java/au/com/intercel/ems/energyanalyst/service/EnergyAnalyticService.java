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
	 * Import energy data.
	 *
	 * @param file the file
	 * @return the string
	 */
	String importEnergyData(MultipartFile file);

	/**
	 * Gets the energy data.
	 *
	 * @param UserId the user id
	 * @return the energy data
	 */
	Collection<DailyRecord> getEnergyData(String UserId);

}
