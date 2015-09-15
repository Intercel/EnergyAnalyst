package au.com.intercel.ems.energyanalyst.domain;

import java.util.Collection;
import java.util.Date;

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
	
	Collection<DailyRecord> findByUidOrderByDateDesc(String uId);
	
	Collection<DailyRecord> findFirst7ByUidOrderByDateDesc(String uId);
	
	Collection<DailyRecord> findByDateBetweenAndUidIs(Date start, Date end, String Uid);
}
