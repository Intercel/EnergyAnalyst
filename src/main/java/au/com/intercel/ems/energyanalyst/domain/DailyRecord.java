package au.com.intercel.ems.energyanalyst.domain;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import au.com.intercel.ems.energyanalyst.domain.IntervalRecord;

/**
 * The Class DailyRecord.
 */
@Entity
public class DailyRecord implements Serializable{	

	/** 
	 * The Constant STANDBYPOWER_WINDOW_SIZE.
	 * 
	 * It is the 3 hours window of 12 records.
	 */
	private final static int STANDBYPOWER_WINDOW_SIZE = 12;
	
	/** 
	 * The Constant NUM_OF_INTERVALS. 
	 * 
	 * It is 96 records per day.
	 */
	private final static int NUM_OF_INTERVALS = 96;
	
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -822101732396013441L;
	
	/** The id. */
	@Id
	@GeneratedValue
	private Long id;
	
	/** 
	 * The uid. 
	 * 
	 * It is the user id.
	 * */
	private String uid;
    
	/** 
	 * The date. 
	 * 
	 * It is the date of this daily record.
	 */
	private Date date;
	
	/** The Json string of interval at 00:15. */
	private String record_0015;
	
	/** The Json string of interval at 00:30. */
	private String record_0030;
	
	/** The Json string of interval at 00:45. */
	private String record_0045;
	
	/** The Json string of interval at 01:00. */
	private String record_0100;
	
	/** The Json string of interval at 01:15. */
	private String record_0115;
	
	/** The Json string of interval at 01:30. */
	private String record_0130;
	
	/** The Json string of interval at 01:45. */
	private String record_0145;
	
	/** The Json string of interval at 02:00. */
	private String record_0200;
	
	/** The Json string of interval at 02:15. */
	private String record_0215;
	
	/** The Json string of interval at 02:30. */
	private String record_0230;
	
	/** The Json string of interval at 02:45. */
	private String record_0245;
	
	/** The Json string of interval at 03:00. */
	private String record_0300;
	
	/** The Json string of interval at 03:15. */
	private String record_0315;
	
	/** The Json string of interval at 03:30. */
	private String record_0330;
	
	/** The Json string of interval at 01:45. */
	private String record_0345;
	
	/** The Json string of interval at 04:00. */
	private String record_0400;
	
	/** The Json string of interval at 04:15. */
	private String record_0415;
	
	/** The Json string of interval at 04:30. */
	private String record_0430;
	
	/** The Json string of interval at 04:45. */
	private String record_0445;
	
	/** The Json string of interval at 05:00. */
	private String record_0500;
	
	/** The Json string of interval at 05:15. */
	private String record_0515;
	
	/** The Json string of interval at 05:30. */
	private String record_0530;
	
	/** The Json string of interval at 05:45. */
	private String record_0545;
	
	/** The Json string of interval at 06:00. */
	private String record_0600;
	
	/** The Json string of interval at 06:15. */
	private String record_0615;
	
	/** The Json string of interval at 06:30. */
	private String record_0630;
	
	/** The Json string of interval at 06:45. */
	private String record_0645;
	
	/** The Json string of interval at 07:00. */
	private String record_0700;
	
	/** The Json string of interval at 07:15. */
	private String record_0715;
	
	/** The Json string of interval at 07:30. */
	private String record_0730;
	
	/** The Json string of interval at 07:45. */
	private String record_0745;
	
	/** The Json string of interval at 08:00. */
	private String record_0800;
	
	/** The Json string of interval at 08:15. */
	private String record_0815;
	
	/** The Json string of interval at 08:30. */
	private String record_0830;
	
	/** The Json string of interval at 08:45. */
	private String record_0845;
	
	/** The Json string of interval at 09:00. */
	private String record_0900;
	
	/** The Json string of interval at 09:15. */
	private String record_0915;
	
	/** The Json string of interval at 09:30. */
	private String record_0930;
	
	/** The Json string of interval at 09:45. */
	private String record_0945;
	
	/** The Json string of interval at 10:00. */
	private String record_1000;
	
	/** The Json string of interval at 10:15. */
	private String record_1015;
	
	/** The Json string of interval at 10:30. */
	private String record_1030;
	
	/** The Json string of interval at 10:45. */
	private String record_1045;
	
	/** The Json string of interval at 11:00. */
	private String record_1100;
	
	/** The Json string of interval at 11:15. */
	private String record_1115;
	
	/** The Json string of interval at 11:30. */
	private String record_1130;
	
	/** The Json string of interval at 11:45. */
	private String record_1145;
	
	/** The Json string of interval at 12:00. */
	private String record_1200;
	
	/** The Json string of interval at 12:15. */
	private String record_1215;
	
	/** The Json string of interval at 12:30. */
	private String record_1230;
	
	/** The Json string of interval at 12:45. */
	private String record_1245;
	
	/** The Json string of interval at 13:00. */
	private String record_1300;
	
	/** The Json string of interval at 13:15. */
	private String record_1315;
	
	/** The Json string of interval at 13:30. */
	private String record_1330;
	
	/** The Json string of interval at 13:45. */
	private String record_1345;
	
	/** The Json string of interval at 14:00. */
	private String record_1400;
	
	/** The Json string of interval at 14:15. */
	private String record_1415;
	
	/** The Json string of interval at 14:30. */
	private String record_1430;
	
	/** The Json string of interval at 14:45. */
	private String record_1445;
	
	/** The Json string of interval at 15:00. */
	private String record_1500;
	
	/** The Json string of interval at 15:15. */
	private String record_1515;
	
	/** The Json string of interval at 15:30. */
	private String record_1530;
	
	/** The Json string of interval at 14:45. */
	private String record_1545;
	
	/** The Json string of interval at 16:00. */
	private String record_1600;
	
	/** The Json string of interval at 16:15. */
	private String record_1615;
	
	/** The Json string of interval at 16:30. */
	private String record_1630;
	
	/** The Json string of interval at 16:45. */
	private String record_1645;
	
	/** The Json string of interval at 17:00. */
	private String record_1700;
	
	/** The Json string of interval at 17:15. */
	private String record_1715;
	
	/** The Json string of interval at 17:30. */
	private String record_1730;
	
	/** The Json string of interval at 17:45. */
	private String record_1745;
	
	/** The Json string of interval at 18:00. */
	private String record_1800;
	
	/** The Json string of interval at 18:15. */
	private String record_1815;
	
	/** The Json string of interval at 18:30. */
	private String record_1830;
	
	/** The Json string of interval at 18:45. */
	private String record_1845;
	
	/** The Json string of interval at 19:00. */
	private String record_1900;
	
	/** The Json string of interval at 19:15. */
	private String record_1915;
	
	/** The Json string of interval at 19:30. */
	private String record_1930;
	
	/** The Json string of interval at 19:45. */
	private String record_1945;
	
	/** The Json string of interval at 20:00. */
	private String record_2000;
	
	/** The Json string of interval at 20:15. */
	private String record_2015;
	
	/** The Json string of interval at 20:30. */
	private String record_2030;
	
	/** The Json string of interval at 20:45. */
	private String record_2045;
	
	/** The Json string of interval at 21:00. */
	private String record_2100;
	
	/** The Json string of interval at 21:15. */
	private String record_2115;
	
	/** The Json string of interval at 21:30. */
	private String record_2130;
	
	/** The Json string of interval at 21:45. */
	private String record_2145;
	
	/** The Json string of interval at 22:00. */
	private String record_2200;
	
	/** The Json string of interval at 22:15. */
	private String record_2215;
	
	/** The Json string of interval at 22:30. */
	private String record_2230;
	
	/** The Json string of interval at 22:45. */
	private String record_2245;
	
	/** The Json string of interval at 23:00. */
	private String record_2300;
	
	/** The Json string of interval at 23:15. */
	private String record_2315;
	
	/** The Json string of interval at 23:30. */
	private String record_2330;
	
	/** The Json string of interval at 23:45. */
	private String record_2345;
	
	/** The Json string of interval at 24:00. */
	private String record_2400;

	/**
	 * Instantiates a new daily record.
	 * 
	 * This dummy constructor is used by Hibernate.
	 */
	protected DailyRecord(){}
	
	/**
	 * Instantiates a new daily record.
	 *
	 * @param uid the user id
	 * @param date the date of this record
	 * @param records the interval records
	 * @throws JsonProcessingException the json processing exception
	 */
	public DailyRecord(
			String uid, 
			Date date,
			List<IntervalRecord> records
			) throws JsonProcessingException{
		
		this.uid = uid;
		this.date = date;
		
		ObjectMapper mapper = new ObjectMapper();
		
		this.record_0015 = mapper.writeValueAsString(records.get(0));
		this.record_0030 = mapper.writeValueAsString(records.get(1));
		this.record_0045 = mapper.writeValueAsString(records.get(2));
		this.record_0100 = mapper.writeValueAsString(records.get(3));
		
		this.record_0115 = mapper.writeValueAsString(records.get(4));
		this.record_0130 = mapper.writeValueAsString(records.get(5));
		this.record_0145 = mapper.writeValueAsString(records.get(6));
		this.record_0200 = mapper.writeValueAsString(records.get(7));
		
		this.record_0215 = mapper.writeValueAsString(records.get(8));
		this.record_0230 = mapper.writeValueAsString(records.get(9));
		this.record_0245 = mapper.writeValueAsString(records.get(10));
		this.record_0300 = mapper.writeValueAsString(records.get(11));
		
		this.record_0315 = mapper.writeValueAsString(records.get(12));
		this.record_0330 = mapper.writeValueAsString(records.get(13));
		this.record_0345 = mapper.writeValueAsString(records.get(14));
		this.record_0400 = mapper.writeValueAsString(records.get(15));
		
		this.record_0415 = mapper.writeValueAsString(records.get(16));
		this.record_0430 = mapper.writeValueAsString(records.get(17));
		this.record_0445 = mapper.writeValueAsString(records.get(18));
		this.record_0500 = mapper.writeValueAsString(records.get(19));
		
		this.record_0515 = mapper.writeValueAsString(records.get(20));
		this.record_0530 = mapper.writeValueAsString(records.get(21));
		this.record_0545 = mapper.writeValueAsString(records.get(22));
		this.record_0600 = mapper.writeValueAsString(records.get(23));
	
		this.record_0615 = mapper.writeValueAsString(records.get(24));
		this.record_0630 = mapper.writeValueAsString(records.get(25));
		this.record_0645 = mapper.writeValueAsString(records.get(26));
		this.record_0700 = mapper.writeValueAsString(records.get(27));
	
		this.record_0715 = mapper.writeValueAsString(records.get(28));
		this.record_0730 = mapper.writeValueAsString(records.get(29));
		this.record_0745 = mapper.writeValueAsString(records.get(30));
		this.record_0800 = mapper.writeValueAsString(records.get(31));
		
		this.record_0815 = mapper.writeValueAsString(records.get(32));
		this.record_0830 = mapper.writeValueAsString(records.get(33));
		this.record_0845 = mapper.writeValueAsString(records.get(34));
		this.record_0900 = mapper.writeValueAsString(records.get(35));
	
		this.record_0915 = mapper.writeValueAsString(records.get(36));
		this.record_0930 = mapper.writeValueAsString(records.get(37));
		this.record_0945 = mapper.writeValueAsString(records.get(38));
		this.record_1000 = mapper.writeValueAsString(records.get(39));
		
		this.record_1015 = mapper.writeValueAsString(records.get(40));
		this.record_1030 = mapper.writeValueAsString(records.get(41));
		this.record_1045 = mapper.writeValueAsString(records.get(42));
		this.record_1100 = mapper.writeValueAsString(records.get(43));
	
		this.record_1115 = mapper.writeValueAsString(records.get(44));
		this.record_1130 = mapper.writeValueAsString(records.get(45));
		this.record_1145 = mapper.writeValueAsString(records.get(46));
		this.record_1200 = mapper.writeValueAsString(records.get(47));
		
		this.record_1215 = mapper.writeValueAsString(records.get(48));
		this.record_1230 = mapper.writeValueAsString(records.get(49));
		this.record_1245 = mapper.writeValueAsString(records.get(50));
		this.record_1300 = mapper.writeValueAsString(records.get(51));
		
		this.record_1315 = mapper.writeValueAsString(records.get(52));
		this.record_1330 = mapper.writeValueAsString(records.get(53));
		this.record_1345 = mapper.writeValueAsString(records.get(54));
		this.record_1400 = mapper.writeValueAsString(records.get(55));
		
		this.record_1415 = mapper.writeValueAsString(records.get(56));
		this.record_1430 = mapper.writeValueAsString(records.get(57));
		this.record_1445 = mapper.writeValueAsString(records.get(58));
		this.record_1500 = mapper.writeValueAsString(records.get(59));
	
		this.record_1515 = mapper.writeValueAsString(records.get(60));
		this.record_1530 = mapper.writeValueAsString(records.get(61));
		this.record_1545 = mapper.writeValueAsString(records.get(62));
		this.record_1600 = mapper.writeValueAsString(records.get(63));
		
		this.record_1615 = mapper.writeValueAsString(records.get(64));
		this.record_1630 = mapper.writeValueAsString(records.get(64));
		this.record_1645 = mapper.writeValueAsString(records.get(66));
		this.record_1700 = mapper.writeValueAsString(records.get(67));
		
		this.record_1715 = mapper.writeValueAsString(records.get(68));
		this.record_1730 = mapper.writeValueAsString(records.get(69));
		this.record_1745 = mapper.writeValueAsString(records.get(70));
		this.record_1800 = mapper.writeValueAsString(records.get(71));
		
		this.record_1815 = mapper.writeValueAsString(records.get(72));
		this.record_1830 = mapper.writeValueAsString(records.get(73));
		this.record_1845 = mapper.writeValueAsString(records.get(74));
		this.record_1900 = mapper.writeValueAsString(records.get(75));
		
		this.record_1915 = mapper.writeValueAsString(records.get(76));
		this.record_1930 = mapper.writeValueAsString(records.get(77));
		this.record_1945 = mapper.writeValueAsString(records.get(78));
		this.record_2000 = mapper.writeValueAsString(records.get(79));
		
		this.record_2015 = mapper.writeValueAsString(records.get(80));
		this.record_2030 = mapper.writeValueAsString(records.get(81));
		this.record_2045 = mapper.writeValueAsString(records.get(82));
		this.record_2100 = mapper.writeValueAsString(records.get(83));
		
		this.record_2115 = mapper.writeValueAsString(records.get(84));
		this.record_2130 = mapper.writeValueAsString(records.get(85));
		this.record_2145 = mapper.writeValueAsString(records.get(86));
		this.record_2200 = mapper.writeValueAsString(records.get(87));
		
		this.record_2215 = mapper.writeValueAsString(records.get(88));
		this.record_2230 = mapper.writeValueAsString(records.get(89));
		this.record_2245 = mapper.writeValueAsString(records.get(90));
		this.record_2300 = mapper.writeValueAsString(records.get(91));
		
		this.record_2315 = mapper.writeValueAsString(records.get(92));
		this.record_2330 = mapper.writeValueAsString(records.get(93));
		this.record_2345 = mapper.writeValueAsString(records.get(94));
		this.record_2400 = mapper.writeValueAsString(records.get(95));
	}
	

	/**
	 * Gets the record_0015.
	 *
	 * @return the record_0015
	 */
	public String getRecord_0015() {
		return record_0015;
	}

	/**
	 * Sets the record_0015.
	 *
	 * @param record_0015 the new record_0015
	 */
	public void setRecord_0015(String record_0015) {
		this.record_0015 = record_0015;
	}

	/**
	 * Gets the record_0030.
	 *
	 * @return the record_0030
	 */
	public String getRecord_0030() {
		return record_0030;
	}

	/**
	 * Sets the record_0030.
	 *
	 * @param record_0030 the new record_0030
	 */
	public void setRecord_0030(String record_0030) {
		this.record_0030 = record_0030;
	}

	/**
	 * Gets the record_0045.
	 *
	 * @return the record_0045
	 */
	public String getRecord_0045() {
		return record_0045;
	}

	/**
	 * Sets the record_0045.
	 *
	 * @param record_0045 the new record_0045
	 */
	public void setRecord_0045(String record_0045) {
		this.record_0045 = record_0045;
	}

	/**
	 * Gets the record_0100.
	 *
	 * @return the record_0100
	 */
	public String getRecord_0100() {
		return record_0100;
	}

	/**
	 * Sets the record_0100.
	 *
	 * @param record_0100 the new record_0100
	 */
	public void setRecord_0100(String record_0100) {
		this.record_0100 = record_0100;
	}

	/**
	 * Gets the record_0115.
	 *
	 * @return the record_0115
	 */
	public String getRecord_0115() {
		return record_0115;
	}

	/**
	 * Sets the record_0115.
	 *
	 * @param record_0115 the new record_0115
	 */
	public void setRecord_0115(String record_0115) {
		this.record_0115 = record_0115;
	}

	/**
	 * Gets the record_0130.
	 *
	 * @return the record_0130
	 */
	public String getRecord_0130() {
		return record_0130;
	}

	/**
	 * Sets the record_0130.
	 *
	 * @param record_0130 the new record_0130
	 */
	public void setRecord_0130(String record_0130) {
		this.record_0130 = record_0130;
	}

	/**
	 * Gets the record_0145.
	 *
	 * @return the record_0145
	 */
	public String getRecord_0145() {
		return record_0145;
	}

	/**
	 * Sets the record_0145.
	 *
	 * @param record_0145 the new record_0145
	 */
	public void setRecord_0145(String record_0145) {
		this.record_0145 = record_0145;
	}

	/**
	 * Gets the record_0200.
	 *
	 * @return the record_0200
	 */
	public String getRecord_0200() {
		return record_0200;
	}

	/**
	 * Sets the record_0200.
	 *
	 * @param record_0200 the new record_0200
	 */
	public void setRecord_0200(String record_0200) {
		this.record_0200 = record_0200;
	}

	/**
	 * Gets the record_0215.
	 *
	 * @return the record_0215
	 */
	public String getRecord_0215() {
		return record_0215;
	}

	/**
	 * Sets the record_0215.
	 *
	 * @param record_0215 the new record_0215
	 */
	public void setRecord_0215(String record_0215) {
		this.record_0215 = record_0215;
	}

	/**
	 * Gets the record_0230.
	 *
	 * @return the record_0230
	 */
	public String getRecord_0230() {
		return record_0230;
	}

	/**
	 * Sets the record_0230.
	 *
	 * @param record_0230 the new record_0230
	 */
	public void setRecord_0230(String record_0230) {
		this.record_0230 = record_0230;
	}

	/**
	 * Gets the record_0245.
	 *
	 * @return the record_0245
	 */
	public String getRecord_0245() {
		return record_0245;
	}

	/**
	 * Sets the record_0245.
	 *
	 * @param record_0245 the new record_0245
	 */
	public void setRecord_0245(String record_0245) {
		this.record_0245 = record_0245;
	}

	/**
	 * Gets the record_0300.
	 *
	 * @return the record_0300
	 */
	public String getRecord_0300() {
		return record_0300;
	}

	/**
	 * Sets the record_0300.
	 *
	 * @param record_0300 the new record_0300
	 */
	public void setRecord_0300(String record_0300) {
		this.record_0300 = record_0300;
	}

	/**
	 * Gets the record_0315.
	 *
	 * @return the record_0315
	 */
	public String getRecord_0315() {
		return record_0315;
	}

	/**
	 * Sets the record_0315.
	 *
	 * @param record_0315 the new record_0315
	 */
	public void setRecord_0315(String record_0315) {
		this.record_0315 = record_0315;
	}

	/**
	 * Gets the record_0330.
	 *
	 * @return the record_0330
	 */
	public String getRecord_0330() {
		return record_0330;
	}

	/**
	 * Sets the record_0330.
	 *
	 * @param record_0330 the new record_0330
	 */
	public void setRecord_0330(String record_0330) {
		this.record_0330 = record_0330;
	}

	/**
	 * Gets the record_0345.
	 *
	 * @return the record_0345
	 */
	public String getRecord_0345() {
		return record_0345;
	}

	/**
	 * Sets the record_0345.
	 *
	 * @param record_0345 the new record_0345
	 */
	public void setRecord_0345(String record_0345) {
		this.record_0345 = record_0345;
	}

	/**
	 * Gets the record_0400.
	 *
	 * @return the record_0400
	 */
	public String getRecord_0400() {
		return record_0400;
	}

	/**
	 * Sets the record_0400.
	 *
	 * @param record_0400 the new record_0400
	 */
	public void setRecord_0400(String record_0400) {
		this.record_0400 = record_0400;
	}

	/**
	 * Gets the record_0415.
	 *
	 * @return the record_0415
	 */
	public String getRecord_0415() {
		return record_0415;
	}

	/**
	 * Sets the record_0415.
	 *
	 * @param record_0415 the new record_0415
	 */
	public void setRecord_0415(String record_0415) {
		this.record_0415 = record_0415;
	}

	/**
	 * Gets the record_0430.
	 *
	 * @return the record_0430
	 */
	public String getRecord_0430() {
		return record_0430;
	}

	/**
	 * Sets the record_0430.
	 *
	 * @param record_0430 the new record_0430
	 */
	public void setRecord_0430(String record_0430) {
		this.record_0430 = record_0430;
	}

	/**
	 * Gets the record_0445.
	 *
	 * @return the record_0445
	 */
	public String getRecord_0445() {
		return record_0445;
	}

	/**
	 * Sets the record_0445.
	 *
	 * @param record_0445 the new record_0445
	 */
	public void setRecord_0445(String record_0445) {
		this.record_0445 = record_0445;
	}

	/**
	 * Gets the record_0500.
	 *
	 * @return the record_0500
	 */
	public String getRecord_0500() {
		return record_0500;
	}

	/**
	 * Sets the record_0500.
	 *
	 * @param record_0500 the new record_0500
	 */
	public void setRecord_0500(String record_0500) {
		this.record_0500 = record_0500;
	}

	/**
	 * Gets the record_0515.
	 *
	 * @return the record_0515
	 */
	public String getRecord_0515() {
		return record_0515;
	}

	/**
	 * Sets the record_0515.
	 *
	 * @param record_0515 the new record_0515
	 */
	public void setRecord_0515(String record_0515) {
		this.record_0515 = record_0515;
	}

	/**
	 * Gets the record_0530.
	 *
	 * @return the record_0530
	 */
	public String getRecord_0530() {
		return record_0530;
	}

	/**
	 * Sets the record_0530.
	 *
	 * @param record_0530 the new record_0530
	 */
	public void setRecord_0530(String record_0530) {
		this.record_0530 = record_0530;
	}

	/**
	 * Gets the record_0545.
	 *
	 * @return the record_0545
	 */
	public String getRecord_0545() {
		return record_0545;
	}

	/**
	 * Sets the record_0545.
	 *
	 * @param record_0545 the new record_0545
	 */
	public void setRecord_0545(String record_0545) {
		this.record_0545 = record_0545;
	}

	/**
	 * Gets the record_0600.
	 *
	 * @return the record_0600
	 */
	public String getRecord_0600() {
		return record_0600;
	}

	/**
	 * Sets the record_0600.
	 *
	 * @param record_0600 the new record_0600
	 */
	public void setRecord_0600(String record_0600) {
		this.record_0600 = record_0600;
	}

	/**
	 * Gets the record_0615.
	 *
	 * @return the record_0615
	 */
	public String getRecord_0615() {
		return record_0615;
	}

	/**
	 * Sets the record_0615.
	 *
	 * @param record_0615 the new record_0615
	 */
	public void setRecord_0615(String record_0615) {
		this.record_0615 = record_0615;
	}

	/**
	 * Gets the record_0630.
	 *
	 * @return the record_0630
	 */
	public String getRecord_0630() {
		return record_0630;
	}

	/**
	 * Sets the record_0630.
	 *
	 * @param record_0630 the new record_0630
	 */
	public void setRecord_0630(String record_0630) {
		this.record_0630 = record_0630;
	}

	/**
	 * Gets the record_0645.
	 *
	 * @return the record_0645
	 */
	public String getRecord_0645() {
		return record_0645;
	}

	/**
	 * Sets the record_0645.
	 *
	 * @param record_0645 the new record_0645
	 */
	public void setRecord_0645(String record_0645) {
		this.record_0645 = record_0645;
	}

	/**
	 * Gets the record_0700.
	 *
	 * @return the record_0700
	 */
	public String getRecord_0700() {
		return record_0700;
	}

	/**
	 * Sets the record_0700.
	 *
	 * @param record_0700 the new record_0700
	 */
	public void setRecord_0700(String record_0700) {
		this.record_0700 = record_0700;
	}

	/**
	 * Gets the record_0715.
	 *
	 * @return the record_0715
	 */
	public String getRecord_0715() {
		return record_0715;
	}

	/**
	 * Sets the record_0715.
	 *
	 * @param record_0715 the new record_0715
	 */
	public void setRecord_0715(String record_0715) {
		this.record_0715 = record_0715;
	}

	/**
	 * Gets the record_0730.
	 *
	 * @return the record_0730
	 */
	public String getRecord_0730() {
		return record_0730;
	}

	/**
	 * Sets the record_0730.
	 *
	 * @param record_0730 the new record_0730
	 */
	public void setRecord_0730(String record_0730) {
		this.record_0730 = record_0730;
	}

	/**
	 * Gets the record_0745.
	 *
	 * @return the record_0745
	 */
	public String getRecord_0745() {
		return record_0745;
	}

	/**
	 * Sets the record_0745.
	 *
	 * @param record_0745 the new record_0745
	 */
	public void setRecord_0745(String record_0745) {
		this.record_0745 = record_0745;
	}

	/**
	 * Gets the record_0800.
	 *
	 * @return the record_0800
	 */
	public String getRecord_0800() {
		return record_0800;
	}

	/**
	 * Sets the record_0800.
	 *
	 * @param record_0800 the new record_0800
	 */
	public void setRecord_0800(String record_0800) {
		this.record_0800 = record_0800;
	}

	/**
	 * Gets the record_0815.
	 *
	 * @return the record_0815
	 */
	public String getRecord_0815() {
		return record_0815;
	}

	/**
	 * Sets the record_0815.
	 *
	 * @param record_0815 the new record_0815
	 */
	public void setRecord_0815(String record_0815) {
		this.record_0815 = record_0815;
	}

	/**
	 * Gets the record_0830.
	 *
	 * @return the record_0830
	 */
	public String getRecord_0830() {
		return record_0830;
	}

	/**
	 * Sets the record_0830.
	 *
	 * @param record_0830 the new record_0830
	 */
	public void setRecord_0830(String record_0830) {
		this.record_0830 = record_0830;
	}

	/**
	 * Gets the record_0845.
	 *
	 * @return the record_0845
	 */
	public String getRecord_0845() {
		return record_0845;
	}

	/**
	 * Sets the record_0845.
	 *
	 * @param record_0845 the new record_0845
	 */
	public void setRecord_0845(String record_0845) {
		this.record_0845 = record_0845;
	}

	/**
	 * Gets the record_0900.
	 *
	 * @return the record_0900
	 */
	public String getRecord_0900() {
		return record_0900;
	}

	/**
	 * Sets the record_0900.
	 *
	 * @param record_0900 the new record_0900
	 */
	public void setRecord_0900(String record_0900) {
		this.record_0900 = record_0900;
	}

	/**
	 * Gets the record_0915.
	 *
	 * @return the record_0915
	 */
	public String getRecord_0915() {
		return record_0915;
	}

	/**
	 * Sets the record_0915.
	 *
	 * @param record_0915 the new record_0915
	 */
	public void setRecord_0915(String record_0915) {
		this.record_0915 = record_0915;
	}

	/**
	 * Gets the record_0930.
	 *
	 * @return the record_0930
	 */
	public String getRecord_0930() {
		return record_0930;
	}

	/**
	 * Sets the record_0930.
	 *
	 * @param record_0930 the new record_0930
	 */
	public void setRecord_0930(String record_0930) {
		this.record_0930 = record_0930;
	}

	/**
	 * Gets the record_0945.
	 *
	 * @return the record_0945
	 */
	public String getRecord_0945() {
		return record_0945;
	}

	/**
	 * Sets the record_0945.
	 *
	 * @param record_0945 the new record_0945
	 */
	public void setRecord_0945(String record_0945) {
		this.record_0945 = record_0945;
	}

	/**
	 * Gets the record_1000.
	 *
	 * @return the record_1000
	 */
	public String getRecord_1000() {
		return record_1000;
	}

	/**
	 * Sets the record_1000.
	 *
	 * @param record_1000 the new record_1000
	 */
	public void setRecord_1000(String record_1000) {
		this.record_1000 = record_1000;
	}

	/**
	 * Gets the record_1015.
	 *
	 * @return the record_1015
	 */
	public String getRecord_1015() {
		return record_1015;
	}

	/**
	 * Sets the record_1015.
	 *
	 * @param record_1015 the new record_1015
	 */
	public void setRecord_1015(String record_1015) {
		this.record_1015 = record_1015;
	}

	/**
	 * Gets the record_1030.
	 *
	 * @return the record_1030
	 */
	public String getRecord_1030() {
		return record_1030;
	}

	/**
	 * Sets the record_1030.
	 *
	 * @param record_1030 the new record_1030
	 */
	public void setRecord_1030(String record_1030) {
		this.record_1030 = record_1030;
	}

	/**
	 * Gets the record_1045.
	 *
	 * @return the record_1045
	 */
	public String getRecord_1045() {
		return record_1045;
	}

	/**
	 * Sets the record_1045.
	 *
	 * @param record_1045 the new record_1045
	 */
	public void setRecord_1045(String record_1045) {
		this.record_1045 = record_1045;
	}

	/**
	 * Gets the record_1100.
	 *
	 * @return the record_1100
	 */
	public String getRecord_1100() {
		return record_1100;
	}

	/**
	 * Sets the record_1100.
	 *
	 * @param record_1100 the new record_1100
	 */
	public void setRecord_1100(String record_1100) {
		this.record_1100 = record_1100;
	}

	/**
	 * Gets the record_1115.
	 *
	 * @return the record_1115
	 */
	public String getRecord_1115() {
		return record_1115;
	}

	/**
	 * Sets the record_1115.
	 *
	 * @param record_1115 the new record_1115
	 */
	public void setRecord_1115(String record_1115) {
		this.record_1115 = record_1115;
	}

	/**
	 * Gets the record_1130.
	 *
	 * @return the record_1130
	 */
	public String getRecord_1130() {
		return record_1130;
	}

	/**
	 * Sets the record_1130.
	 *
	 * @param record_1130 the new record_1130
	 */
	public void setRecord_1130(String record_1130) {
		this.record_1130 = record_1130;
	}

	/**
	 * Gets the record_1145.
	 *
	 * @return the record_1145
	 */
	public String getRecord_1145() {
		return record_1145;
	}

	/**
	 * Sets the record_1145.
	 *
	 * @param record_1145 the new record_1145
	 */
	public void setRecord_1145(String record_1145) {
		this.record_1145 = record_1145;
	}

	/**
	 * Gets the record_1200.
	 *
	 * @return the record_1200
	 */
	public String getRecord_1200() {
		return record_1200;
	}

	/**
	 * Sets the record_1200.
	 *
	 * @param record_1200 the new record_1200
	 */
	public void setRecord_1200(String record_1200) {
		this.record_1200 = record_1200;
	}

	/**
	 * Gets the record_1215.
	 *
	 * @return the record_1215
	 */
	public String getRecord_1215() {
		return record_1215;
	}

	/**
	 * Sets the record_1215.
	 *
	 * @param record_1215 the new record_1215
	 */
	public void setRecord_1215(String record_1215) {
		this.record_1215 = record_1215;
	}

	/**
	 * Gets the record_1230.
	 *
	 * @return the record_1230
	 */
	public String getRecord_1230() {
		return record_1230;
	}

	/**
	 * Sets the record_1230.
	 *
	 * @param record_1230 the new record_1230
	 */
	public void setRecord_1230(String record_1230) {
		this.record_1230 = record_1230;
	}

	/**
	 * Gets the record_1245.
	 *
	 * @return the record_1245
	 */
	public String getRecord_1245() {
		return record_1245;
	}

	/**
	 * Sets the record_1245.
	 *
	 * @param record_1245 the new record_1245
	 */
	public void setRecord_1245(String record_1245) {
		this.record_1245 = record_1245;
	}

	/**
	 * Gets the record_1300.
	 *
	 * @return the record_1300
	 */
	public String getRecord_1300() {
		return record_1300;
	}

	/**
	 * Sets the record_1300.
	 *
	 * @param record_1300 the new record_1300
	 */
	public void setRecord_1300(String record_1300) {
		this.record_1300 = record_1300;
	}

	/**
	 * Gets the record_1315.
	 *
	 * @return the record_1315
	 */
	public String getRecord_1315() {
		return record_1315;
	}

	/**
	 * Sets the record_1315.
	 *
	 * @param record_1315 the new record_1315
	 */
	public void setRecord_1315(String record_1315) {
		this.record_1315 = record_1315;
	}

	/**
	 * Gets the record_1330.
	 *
	 * @return the record_1330
	 */
	public String getRecord_1330() {
		return record_1330;
	}

	/**
	 * Sets the record_1330.
	 *
	 * @param record_1330 the new record_1330
	 */
	public void setRecord_1330(String record_1330) {
		this.record_1330 = record_1330;
	}

	/**
	 * Gets the record_1345.
	 *
	 * @return the record_1345
	 */
	public String getRecord_1345() {
		return record_1345;
	}

	/**
	 * Sets the record_1345.
	 *
	 * @param record_1345 the new record_1345
	 */
	public void setRecord_1345(String record_1345) {
		this.record_1345 = record_1345;
	}

	/**
	 * Gets the record_1400.
	 *
	 * @return the record_1400
	 */
	public String getRecord_1400() {
		return record_1400;
	}

	/**
	 * Sets the record_1400.
	 *
	 * @param record_1400 the new record_1400
	 */
	public void setRecord_1400(String record_1400) {
		this.record_1400 = record_1400;
	}

	/**
	 * Gets the record_1415.
	 *
	 * @return the record_1415
	 */
	public String getRecord_1415() {
		return record_1415;
	}

	/**
	 * Sets the record_1415.
	 *
	 * @param record_1415 the new record_1415
	 */
	public void setRecord_1415(String record_1415) {
		this.record_1415 = record_1415;
	}

	/**
	 * Gets the record_1430.
	 *
	 * @return the record_1430
	 */
	public String getRecord_1430() {
		return record_1430;
	}

	/**
	 * Sets the record_1430.
	 *
	 * @param record_1430 the new record_1430
	 */
	public void setRecord_1430(String record_1430) {
		this.record_1430 = record_1430;
	}

	/**
	 * Gets the record_1445.
	 *
	 * @return the record_1445
	 */
	public String getRecord_1445() {
		return record_1445;
	}

	/**
	 * Sets the record_1445.
	 *
	 * @param record_1445 the new record_1445
	 */
	public void setRecord_1445(String record_1445) {
		this.record_1445 = record_1445;
	}

	/**
	 * Gets the record_1500.
	 *
	 * @return the record_1500
	 */
	public String getRecord_1500() {
		return record_1500;
	}

	/**
	 * Sets the record_1500.
	 *
	 * @param record_1500 the new record_1500
	 */
	public void setRecord_1500(String record_1500) {
		this.record_1500 = record_1500;
	}

	/**
	 * Gets the record_1515.
	 *
	 * @return the record_1515
	 */
	public String getRecord_1515() {
		return record_1515;
	}

	/**
	 * Sets the record_1515.
	 *
	 * @param record_1515 the new record_1515
	 */
	public void setRecord_1515(String record_1515) {
		this.record_1515 = record_1515;
	}

	/**
	 * Gets the record_1530.
	 *
	 * @return the record_1530
	 */
	public String getRecord_1530() {
		return record_1530;
	}

	/**
	 * Sets the record_1530.
	 *
	 * @param record_1530 the new record_1530
	 */
	public void setRecord_1530(String record_1530) {
		this.record_1530 = record_1530;
	}

	/**
	 * Gets the record_1545.
	 *
	 * @return the record_1545
	 */
	public String getRecord_1545() {
		return record_1545;
	}

	/**
	 * Sets the record_1545.
	 *
	 * @param record_1545 the new record_1545
	 */
	public void setRecord_1545(String record_1545) {
		this.record_1545 = record_1545;
	}

	/**
	 * Gets the record_1600.
	 *
	 * @return the record_1600
	 */
	public String getRecord_1600() {
		return record_1600;
	}

	/**
	 * Sets the record_1600.
	 *
	 * @param record_1600 the new record_1600
	 */
	public void setRecord_1600(String record_1600) {
		this.record_1600 = record_1600;
	}

	/**
	 * Gets the record_1615.
	 *
	 * @return the record_1615
	 */
	public String getRecord_1615() {
		return record_1615;
	}

	/**
	 * Sets the record_1615.
	 *
	 * @param record_1615 the new record_1615
	 */
	public void setRecord_1615(String record_1615) {
		this.record_1615 = record_1615;
	}

	/**
	 * Gets the record_1630.
	 *
	 * @return the record_1630
	 */
	public String getRecord_1630() {
		return record_1630;
	}

	/**
	 * Sets the record_1630.
	 *
	 * @param record_1630 the new record_1630
	 */
	public void setRecord_1630(String record_1630) {
		this.record_1630 = record_1630;
	}

	/**
	 * Gets the record_1645.
	 *
	 * @return the record_1645
	 */
	public String getRecord_1645() {
		return record_1645;
	}

	/**
	 * Sets the record_1645.
	 *
	 * @param record_1645 the new record_1645
	 */
	public void setRecord_1645(String record_1645) {
		this.record_1645 = record_1645;
	}

	/**
	 * Gets the record_1700.
	 *
	 * @return the record_1700
	 */
	public String getRecord_1700() {
		return record_1700;
	}

	/**
	 * Sets the record_1700.
	 *
	 * @param record_1700 the new record_1700
	 */
	public void setRecord_1700(String record_1700) {
		this.record_1700 = record_1700;
	}

	/**
	 * Gets the record_1715.
	 *
	 * @return the record_1715
	 */
	public String getRecord_1715() {
		return record_1715;
	}

	/**
	 * Sets the record_1715.
	 *
	 * @param record_1715 the new record_1715
	 */
	public void setRecord_1715(String record_1715) {
		this.record_1715 = record_1715;
	}

	/**
	 * Gets the record_1730.
	 *
	 * @return the record_1730
	 */
	public String getRecord_1730() {
		return record_1730;
	}

	/**
	 * Sets the record_1730.
	 *
	 * @param record_1730 the new record_1730
	 */
	public void setRecord_1730(String record_1730) {
		this.record_1730 = record_1730;
	}

	/**
	 * Gets the record_1745.
	 *
	 * @return the record_1745
	 */
	public String getRecord_1745() {
		return record_1745;
	}

	/**
	 * Sets the record_1745.
	 *
	 * @param record_1745 the new record_1745
	 */
	public void setRecord_1745(String record_1745) {
		this.record_1745 = record_1745;
	}

	/**
	 * Gets the record_1800.
	 *
	 * @return the record_1800
	 */
	public String getRecord_1800() {
		return record_1800;
	}

	/**
	 * Sets the record_1800.
	 *
	 * @param record_1800 the new record_1800
	 */
	public void setRecord_1800(String record_1800) {
		this.record_1800 = record_1800;
	}

	/**
	 * Gets the record_1815.
	 *
	 * @return the record_1815
	 */
	public String getRecord_1815() {
		return record_1815;
	}

	/**
	 * Sets the record_1815.
	 *
	 * @param record_1815 the new record_1815
	 */
	public void setRecord_1815(String record_1815) {
		this.record_1815 = record_1815;
	}

	/**
	 * Gets the record_1830.
	 *
	 * @return the record_1830
	 */
	public String getRecord_1830() {
		return record_1830;
	}

	/**
	 * Sets the record_1830.
	 *
	 * @param record_1830 the new record_1830
	 */
	public void setRecord_1830(String record_1830) {
		this.record_1830 = record_1830;
	}

	/**
	 * Gets the record_1845.
	 *
	 * @return the record_1845
	 */
	public String getRecord_1845() {
		return record_1845;
	}

	/**
	 * Sets the record_1845.
	 *
	 * @param record_1845 the new record_1845
	 */
	public void setRecord_1845(String record_1845) {
		this.record_1845 = record_1845;
	}

	/**
	 * Gets the record_1900.
	 *
	 * @return the record_1900
	 */
	public String getRecord_1900() {
		return record_1900;
	}

	/**
	 * Sets the record_1900.
	 *
	 * @param record_1900 the new record_1900
	 */
	public void setRecord_1900(String record_1900) {
		this.record_1900 = record_1900;
	}

	/**
	 * Gets the record_1915.
	 *
	 * @return the record_1915
	 */
	public String getRecord_1915() {
		return record_1915;
	}

	/**
	 * Sets the record_1915.
	 *
	 * @param record_1915 the new record_1915
	 */
	public void setRecord_1915(String record_1915) {
		this.record_1915 = record_1915;
	}

	/**
	 * Gets the record_1930.
	 *
	 * @return the record_1930
	 */
	public String getRecord_1930() {
		return record_1930;
	}

	/**
	 * Sets the record_1930.
	 *
	 * @param record_1930 the new record_1930
	 */
	public void setRecord_1930(String record_1930) {
		this.record_1930 = record_1930;
	}

	/**
	 * Gets the record_1945.
	 *
	 * @return the record_1945
	 */
	public String getRecord_1945() {
		return record_1945;
	}

	/**
	 * Sets the record_1945.
	 *
	 * @param record_1945 the new record_1945
	 */
	public void setRecord_1945(String record_1945) {
		this.record_1945 = record_1945;
	}

	/**
	 * Gets the record_2000.
	 *
	 * @return the record_2000
	 */
	public String getRecord_2000() {
		return record_2000;
	}

	/**
	 * Sets the record_2000.
	 *
	 * @param record_2000 the new record_2000
	 */
	public void setRecord_2000(String record_2000) {
		this.record_2000 = record_2000;
	}

	/**
	 * Gets the record_2015.
	 *
	 * @return the record_2015
	 */
	public String getRecord_2015() {
		return record_2015;
	}

	/**
	 * Sets the record_2015.
	 *
	 * @param record_2015 the new record_2015
	 */
	public void setRecord_2015(String record_2015) {
		this.record_2015 = record_2015;
	}

	/**
	 * Gets the record_2030.
	 *
	 * @return the record_2030
	 */
	public String getRecord_2030() {
		return record_2030;
	}

	/**
	 * Sets the record_2030.
	 *
	 * @param record_2030 the new record_2030
	 */
	public void setRecord_2030(String record_2030) {
		this.record_2030 = record_2030;
	}

	/**
	 * Gets the record_2045.
	 *
	 * @return the record_2045
	 */
	public String getRecord_2045() {
		return record_2045;
	}

	/**
	 * Sets the record_2045.
	 *
	 * @param record_2045 the new record_2045
	 */
	public void setRecord_2045(String record_2045) {
		this.record_2045 = record_2045;
	}

	/**
	 * Gets the record_2100.
	 *
	 * @return the record_2100
	 */
	public String getRecord_2100() {
		return record_2100;
	}

	/**
	 * Sets the record_2100.
	 *
	 * @param record_2100 the new record_2100
	 */
	public void setRecord_2100(String record_2100) {
		this.record_2100 = record_2100;
	}

	/**
	 * Gets the record_2115.
	 *
	 * @return the record_2115
	 */
	public String getRecord_2115() {
		return record_2115;
	}

	/**
	 * Sets the record_2115.
	 *
	 * @param record_2115 the new record_2115
	 */
	public void setRecord_2115(String record_2115) {
		this.record_2115 = record_2115;
	}

	/**
	 * Gets the record_2130.
	 *
	 * @return the record_2130
	 */
	public String getRecord_2130() {
		return record_2130;
	}

	/**
	 * Sets the record_2130.
	 *
	 * @param record_2130 the new record_2130
	 */
	public void setRecord_2130(String record_2130) {
		this.record_2130 = record_2130;
	}

	/**
	 * Gets the record_2145.
	 *
	 * @return the record_2145
	 */
	public String getRecord_2145() {
		return record_2145;
	}

	/**
	 * Sets the record_2145.
	 *
	 * @param record_2145 the new record_2145
	 */
	public void setRecord_2145(String record_2145) {
		this.record_2145 = record_2145;
	}

	/**
	 * Gets the record_2200.
	 *
	 * @return the record_2200
	 */
	public String getRecord_2200() {
		return record_2200;
	}

	/**
	 * Sets the record_2200.
	 *
	 * @param record_2200 the new record_2200
	 */
	public void setRecord_2200(String record_2200) {
		this.record_2200 = record_2200;
	}

	/**
	 * Gets the record_2215.
	 *
	 * @return the record_2215
	 */
	public String getRecord_2215() {
		return record_2215;
	}

	/**
	 * Sets the record_2215.
	 *
	 * @param record_2215 the new record_2215
	 */
	public void setRecord_2215(String record_2215) {
		this.record_2215 = record_2215;
	}

	/**
	 * Gets the record_2230.
	 *
	 * @return the record_2230
	 */
	public String getRecord_2230() {
		return record_2230;
	}

	/**
	 * Sets the record_2230.
	 *
	 * @param record_2230 the new record_2230
	 */
	public void setRecord_2230(String record_2230) {
		this.record_2230 = record_2230;
	}

	/**
	 * Gets the record_2245.
	 *
	 * @return the record_2245
	 */
	public String getRecord_2245() {
		return record_2245;
	}

	/**
	 * Sets the record_2245.
	 *
	 * @param record_2245 the new record_2245
	 */
	public void setRecord_2245(String record_2245) {
		this.record_2245 = record_2245;
	}

	/**
	 * Gets the record_2300.
	 *
	 * @return the record_2300
	 */
	public String getRecord_2300() {
		return record_2300;
	}

	/**
	 * Sets the record_2300.
	 *
	 * @param record_2300 the new record_2300
	 */
	public void setRecord_2300(String record_2300) {
		this.record_2300 = record_2300;
	}

	/**
	 * Gets the record_2315.
	 *
	 * @return the record_2315
	 */
	public String getRecord_2315() {
		return record_2315;
	}

	/**
	 * Sets the record_2315.
	 *
	 * @param record_2315 the new record_2315
	 */
	public void setRecord_2315(String record_2315) {
		this.record_2315 = record_2315;
	}

	/**
	 * Gets the record_2330.
	 *
	 * @return the record_2330
	 */
	public String getRecord_2330() {
		return record_2330;
	}

	/**
	 * Sets the record_2330.
	 *
	 * @param record_2330 the new record_2330
	 */
	public void setRecord_2330(String record_2330) {
		this.record_2330 = record_2330;
	}

	/**
	 * Gets the record_2345.
	 *
	 * @return the record_2345
	 */
	public String getRecord_2345() {
		return record_2345;
	}

	/**
	 * Sets the record_2345.
	 *
	 * @param record_2345 the new record_2345
	 */
	public void setRecord_2345(String record_2345) {
		this.record_2345 = record_2345;
	}

	/**
	 * Gets the record_2400.
	 *
	 * @return the record_2400
	 */
	public String getRecord_2400() {
		return record_2400;
	}

	/**
	 * Sets the record_2400.
	 *
	 * @param record_2400 the new record_2400
	 */
	public void setRecord_2400(String record_2400) {
		this.record_2400 = record_2400;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUid() {
		return uid;
	}
	
	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 * Gets the standby power.
	 * 
	 * It calculates the energy usage baseline.
	 *
	 * @return the standby appliances consumed energy on this date in the unit of kWh
	 * @throws JsonParseException the json parse exception
	 * @throws JsonMappingException the json mapping exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public double getStandbyPower() throws JsonParseException, JsonMappingException, IOException {		
		
		List<Double> consumedEnergy = getIntervalRecords();
		
		Collections.sort(consumedEnergy);
		
		double standbyPower = 0;
		
		for(int i=0; i<STANDBYPOWER_WINDOW_SIZE; i++){
			standbyPower += consumedEnergy.get(i);
		}
		
		return standbyPower / STANDBYPOWER_WINDOW_SIZE * NUM_OF_INTERVALS;
	}
	
	/**
	 * Gets the total consumed energy.
	 * 
	 * It sums all the energy interval together.
	 *
	 * @return the total consumed energy on this date in the unit of kWh
	 * @throws JsonParseException the json parse exception
	 * @throws JsonMappingException the json mapping exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public double getTotalConsumedEnergy() throws JsonParseException, JsonMappingException, IOException {
		
		List<Double> consumedEnergy = getIntervalRecords();
		
		double sum = 0;
		
		for(double interval : consumedEnergy){
			sum += interval;
		}
		
		return sum;
	}
	
	/**
	 * Gets the interval records.
	 * 
	 * It returns list of interval energy consumed.
	 *
	 * @return the interval energy records
	 * @throws JsonParseException the json parse exception
	 * @throws JsonMappingException the json mapping exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private List<Double> getIntervalRecords() throws JsonParseException, JsonMappingException, IOException {
		List<Double> consumedEnergy = new ArrayList<Double>();
		
		ObjectMapper mapper = new ObjectMapper();
		
		IntervalRecord ir_01 = mapper.readValue(record_0015, IntervalRecord.class);
		IntervalRecord ir_02 = mapper.readValue(record_0030, IntervalRecord.class);
		IntervalRecord ir_03 = mapper.readValue(record_0045, IntervalRecord.class);
		IntervalRecord ir_04 = mapper.readValue(record_0100, IntervalRecord.class);
		IntervalRecord ir_05 = mapper.readValue(record_0115, IntervalRecord.class);
		IntervalRecord ir_06 = mapper.readValue(record_0130, IntervalRecord.class);
		IntervalRecord ir_07 = mapper.readValue(record_0145, IntervalRecord.class);
		IntervalRecord ir_08 = mapper.readValue(record_0200, IntervalRecord.class);
		IntervalRecord ir_09 = mapper.readValue(record_0215, IntervalRecord.class);
		IntervalRecord ir_10 = mapper.readValue(record_0230, IntervalRecord.class);
		IntervalRecord ir_11 = mapper.readValue(record_0245, IntervalRecord.class);
		IntervalRecord ir_12 = mapper.readValue(record_0300, IntervalRecord.class);
		IntervalRecord ir_13 = mapper.readValue(record_0315, IntervalRecord.class);
		IntervalRecord ir_14 = mapper.readValue(record_0330, IntervalRecord.class);
		IntervalRecord ir_15 = mapper.readValue(record_0345, IntervalRecord.class);
		IntervalRecord ir_16 = mapper.readValue(record_0400, IntervalRecord.class);
		IntervalRecord ir_17 = mapper.readValue(record_0415, IntervalRecord.class);
		IntervalRecord ir_18 = mapper.readValue(record_0430, IntervalRecord.class);
		IntervalRecord ir_19 = mapper.readValue(record_0445, IntervalRecord.class);
		IntervalRecord ir_20 = mapper.readValue(record_0500, IntervalRecord.class);
		IntervalRecord ir_21 = mapper.readValue(record_0515, IntervalRecord.class);
		IntervalRecord ir_22 = mapper.readValue(record_0530, IntervalRecord.class);
		IntervalRecord ir_23 = mapper.readValue(record_0545, IntervalRecord.class);
		IntervalRecord ir_24 = mapper.readValue(record_0600, IntervalRecord.class);
		IntervalRecord ir_25 = mapper.readValue(record_0615, IntervalRecord.class);
		IntervalRecord ir_26 = mapper.readValue(record_0630, IntervalRecord.class);
		IntervalRecord ir_27 = mapper.readValue(record_0645, IntervalRecord.class);
		IntervalRecord ir_28 = mapper.readValue(record_0700, IntervalRecord.class);
		IntervalRecord ir_29 = mapper.readValue(record_0715, IntervalRecord.class);
		IntervalRecord ir_30 = mapper.readValue(record_0730, IntervalRecord.class);
		IntervalRecord ir_31 = mapper.readValue(record_0745, IntervalRecord.class);
		IntervalRecord ir_32 = mapper.readValue(record_0800, IntervalRecord.class);
		IntervalRecord ir_33 = mapper.readValue(record_0815, IntervalRecord.class);
		IntervalRecord ir_34 = mapper.readValue(record_0830, IntervalRecord.class);
		IntervalRecord ir_35 = mapper.readValue(record_0845, IntervalRecord.class);
		IntervalRecord ir_36 = mapper.readValue(record_0900, IntervalRecord.class);
		IntervalRecord ir_37 = mapper.readValue(record_0915, IntervalRecord.class);
		IntervalRecord ir_38 = mapper.readValue(record_0930, IntervalRecord.class);
		IntervalRecord ir_39 = mapper.readValue(record_0945, IntervalRecord.class);
		IntervalRecord ir_40 = mapper.readValue(record_1000, IntervalRecord.class);
		IntervalRecord ir_41 = mapper.readValue(record_1015, IntervalRecord.class);
		IntervalRecord ir_42 = mapper.readValue(record_1030, IntervalRecord.class);
		IntervalRecord ir_43 = mapper.readValue(record_1045, IntervalRecord.class);
		IntervalRecord ir_44 = mapper.readValue(record_1100, IntervalRecord.class);
		IntervalRecord ir_45 = mapper.readValue(record_1115, IntervalRecord.class);
		IntervalRecord ir_46 = mapper.readValue(record_1130, IntervalRecord.class);
		IntervalRecord ir_47 = mapper.readValue(record_1145, IntervalRecord.class);
		IntervalRecord ir_48 = mapper.readValue(record_1200, IntervalRecord.class);
		IntervalRecord ir_49 = mapper.readValue(record_1215, IntervalRecord.class);
		IntervalRecord ir_50 = mapper.readValue(record_1230, IntervalRecord.class);
		IntervalRecord ir_51 = mapper.readValue(record_1245, IntervalRecord.class);
		IntervalRecord ir_52 = mapper.readValue(record_1300, IntervalRecord.class);
		IntervalRecord ir_53 = mapper.readValue(record_1315, IntervalRecord.class);
		IntervalRecord ir_54 = mapper.readValue(record_1330, IntervalRecord.class);
		IntervalRecord ir_55 = mapper.readValue(record_1345, IntervalRecord.class);
		IntervalRecord ir_56 = mapper.readValue(record_1400, IntervalRecord.class);
		IntervalRecord ir_57 = mapper.readValue(record_1415, IntervalRecord.class);
		IntervalRecord ir_58 = mapper.readValue(record_1430, IntervalRecord.class);
		IntervalRecord ir_59 = mapper.readValue(record_1445, IntervalRecord.class);
		IntervalRecord ir_60 = mapper.readValue(record_1500, IntervalRecord.class);
		IntervalRecord ir_61 = mapper.readValue(record_1515, IntervalRecord.class);
		IntervalRecord ir_62 = mapper.readValue(record_1530, IntervalRecord.class);
		IntervalRecord ir_63 = mapper.readValue(record_1545, IntervalRecord.class);
		IntervalRecord ir_64 = mapper.readValue(record_1600, IntervalRecord.class);
		IntervalRecord ir_65 = mapper.readValue(record_1615, IntervalRecord.class);
		IntervalRecord ir_66 = mapper.readValue(record_1630, IntervalRecord.class);
		IntervalRecord ir_67 = mapper.readValue(record_1645, IntervalRecord.class);
		IntervalRecord ir_68 = mapper.readValue(record_1700, IntervalRecord.class);
		IntervalRecord ir_69 = mapper.readValue(record_1715, IntervalRecord.class);
		IntervalRecord ir_70 = mapper.readValue(record_1730, IntervalRecord.class);
		IntervalRecord ir_71 = mapper.readValue(record_1745, IntervalRecord.class);
		IntervalRecord ir_72 = mapper.readValue(record_1800, IntervalRecord.class);
		IntervalRecord ir_73 = mapper.readValue(record_1815, IntervalRecord.class);
		IntervalRecord ir_74 = mapper.readValue(record_1830, IntervalRecord.class);
		IntervalRecord ir_75 = mapper.readValue(record_1845, IntervalRecord.class);
		IntervalRecord ir_76 = mapper.readValue(record_1900, IntervalRecord.class);
		IntervalRecord ir_77 = mapper.readValue(record_1915, IntervalRecord.class);
		IntervalRecord ir_78 = mapper.readValue(record_1930, IntervalRecord.class);
		IntervalRecord ir_79 = mapper.readValue(record_1945, IntervalRecord.class);
		IntervalRecord ir_80 = mapper.readValue(record_2000, IntervalRecord.class);
		IntervalRecord ir_81 = mapper.readValue(record_2015, IntervalRecord.class);
		IntervalRecord ir_82 = mapper.readValue(record_2030, IntervalRecord.class);
		IntervalRecord ir_83 = mapper.readValue(record_2045, IntervalRecord.class);
		IntervalRecord ir_84 = mapper.readValue(record_2100, IntervalRecord.class);
		IntervalRecord ir_85 = mapper.readValue(record_2115, IntervalRecord.class);
		IntervalRecord ir_86 = mapper.readValue(record_2130, IntervalRecord.class);
		IntervalRecord ir_87 = mapper.readValue(record_2145, IntervalRecord.class);
		IntervalRecord ir_88 = mapper.readValue(record_2200, IntervalRecord.class);
		IntervalRecord ir_89 = mapper.readValue(record_2215, IntervalRecord.class);
		IntervalRecord ir_90 = mapper.readValue(record_2230, IntervalRecord.class);
		IntervalRecord ir_91 = mapper.readValue(record_2245, IntervalRecord.class);
		IntervalRecord ir_92 = mapper.readValue(record_2300, IntervalRecord.class);
		IntervalRecord ir_93 = mapper.readValue(record_2315, IntervalRecord.class);
		IntervalRecord ir_94 = mapper.readValue(record_2330, IntervalRecord.class);
		IntervalRecord ir_95 = mapper.readValue(record_2345, IntervalRecord.class);
		IntervalRecord ir_96 = mapper.readValue(record_2400, IntervalRecord.class);
		
		consumedEnergy.add(ir_01.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_02.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_03.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_04.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_05.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_06.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_07.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_08.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_09.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_10.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_11.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_12.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_13.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_14.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_15.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_16.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_17.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_18.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_19.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_20.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_21.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_22.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_23.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_24.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_25.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_26.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_27.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_28.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_29.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_30.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_31.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_32.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_33.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_34.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_35.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_36.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_37.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_38.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_39.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_40.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_41.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_42.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_43.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_44.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_45.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_46.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_47.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_48.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		
		consumedEnergy.add(ir_49.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_50.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_51.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_52.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_53.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_54.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_55.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_56.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_57.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_58.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_59.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_60.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_61.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_62.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_63.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_64.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_65.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_66.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_67.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_68.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_69.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_70.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_71.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_72.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_73.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_74.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_75.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_76.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_77.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_78.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_79.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_80.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_81.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_82.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_83.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_84.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_85.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_86.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_87.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_88.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_89.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_90.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_91.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_92.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_93.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_94.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_95.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		consumedEnergy.add(ir_96.getValues().get(IntervalRecord.CONSUMED_ENERGY_KEY));
		
		return consumedEnergy;
	}
}
