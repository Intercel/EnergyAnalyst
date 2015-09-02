package au.com.intercel.ems.energyanalyst.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * The Interface CustomerRepository.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	/**
	 * Find customer by id.
	 *
	 * @param Id the user id
	 * @return the customer object
	 */
	Customer findById(String Id);
}
