package au.com.intercel.ems.energyanalyst.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The Class Customer.
 * 
 * This class defines customer object and it is be mapped to DB.
 */
@Entity
public class Customer implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2592027251455960157L;
	
	/** The id.
	 * 
	 *  It is the primary key when mapped to DB.
	 */
	@Id
	private String id;
	
	/** 
	 * The standby power. 
	 * 
	 * It is the averaged daily standby power consumed energy in the unit of kWh.
	 */
	private double standbyPower;
	
	/**
	 * The average daily consumption. 
	 * 
	 * It is the averaged daily total consumption in the unit of kWh.
	 */
	private double averageDailyConsumption;
	
	/** 
	 * The carbon emission.
	 * 
	 * It is the averaged daily CO2 emission in the unit of kg.
	 */
	private double carbonEmission;
	
	/** 
	 * The rank. 
	 * 
	 * It is user rank of averageDailyConsumption among all users.
	 * Lower consumption gets higher rank. It is represented in the 
	 * percentage format, e.g. 0.2 means this customer is at top 20% 
	 * energy efficiency.
	 */
	private double rank;
	
	/** 
	 * The customer type. 
	 * 
	 * It is the customer life style, e.g. night shift or normal day worker
	 */
	private String type;
	
	/**
	 * Instantiates a new customer.
	 * 
	 * This dummy constructor is used by Hibernate.
	 */
	protected Customer(){}
	
	/**
	 * Instantiates a new customer.
	 *
	 * @param id the user id
	 */
	public Customer(String id){
		this.id = id;
		
		this.standbyPower = Double.NaN;
		this.averageDailyConsumption = Double.NaN;
		this.carbonEmission = Double.NaN;
		this.rank = Double.NaN;
	}
	
	/**
	 * Instantiates a new customer.
	 *
	 * @param id the user id
	 * @param standbyPower It is the averaged daily standby power consumed energy in the unit of kWh.
	 * @param averageDailyConsumption It is the averaged daily total consumption in the unit of kWh.
	 * @param carbonEmission It is the averaged daily CO2 emission in the unit of kg.
	 * @param type It is the customer life style, e.g. night shift or normal day worker
	 */
	public Customer(String id, double standbyPower, double averageDailyConsumption, double carbonEmission, String type){
		this.id = id;
		
		this.standbyPower = standbyPower;
		this.averageDailyConsumption = averageDailyConsumption;
		this.carbonEmission = carbonEmission;
		this.type = type;
	}

	/**
	 * Gets the standby power.
	 *
	 * @return the standby power
	 */
	public double getStandbyPower() {
		return standbyPower;
	}


	/**
	 * Sets the standby power.
	 *
	 * @param standbyPower the new standby power
	 */
	public void setStandbyPower(double standbyPower) {
		this.standbyPower = standbyPower;
	}


	/**
	 * Gets the average daily consumption.
	 *
	 * @return the average daily consumption
	 */
	public double getAverageDailyConsumption() {
		return averageDailyConsumption;
	}


	/**
	 * Sets the average daily consumption.
	 *
	 * @param averageDailyConsumption the new average daily consumption
	 */
	public void setAverageDailyConsumption(double averageDailyConsumption) {
		this.averageDailyConsumption = averageDailyConsumption;
	}


	/**
	 * Gets the carbon emission.
	 *
	 * @return the carbon emission
	 */
	public double getCarbonEmission() {
		return carbonEmission;
	}


	/**
	 * Sets the carbon emission.
	 *
	 * @param carbonEmission the new carbon emission
	 */
	public void setCarbonEmission(double carbonEmission) {
		this.carbonEmission = carbonEmission;
	}


	/**
	 * Gets the rank.
	 *
	 * @return the rank
	 */
	public double getRank() {
		return rank;
	}


	/**
	 * Sets the rank.
	 *
	 * @param rank the new rank
	 */
	public void setRank(double rank) {
		this.rank = rank;
	}


	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}
}
