package au.com.intercel.ems.energyanalyst.domain;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

/**
 * The Interface DailyRecordRepository.
 */
public interface DailyRecordRepository extends CrudRepository<DailyRecord, Long>{
	
	/**
	 * Find daily records by user id.
	 *
	 * @param uId the user id
	 * @return the collection of daily record
	 */
	Collection<DailyRecord> findByUid(String uId);
}
