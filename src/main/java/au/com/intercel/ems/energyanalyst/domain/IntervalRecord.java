package au.com.intercel.ems.energyanalyst.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class IntervalRecord.
 * 
 * it represents the interval data.
 */
public class IntervalRecord {
	
	/** The Constant CONSUMED_ENERGY_KEY. */
	public final static String CONSUMED_ENERGY_KEY = "kWh";
	
	/** The Constant CONSUMED_VOLTAGE_KEY. */
	public final static String CONSUMED_VOLTAGE_KEY = "volt";
	
	/** The Constant TEMPERATURE_KEY. */
	public final static String TEMPERATURE_KEY = "celsius";
	
	/** 
	 * The interval data. 
	 * 
	 * The interval data could contains any parameters, including:
	 * kWh(mandatory), voltage, celsius or any future value.
	 */
	private Map<String, Double> values;
	
	/**
	 * Instantiates a new interval record.
	 * 
	 * The dummy default construct is required for the Json to object conversion.
	 */
	public IntervalRecord(){}
	
	/**
	 * Instantiates a new interval record.
	 *
	 * @param energy the interval energy in the unit of kWh
	 */
	public IntervalRecord(double energy){
		values = new HashMap<String, Double>();
		
		this.values.put(CONSUMED_ENERGY_KEY, energy);
	}
	
	/**
	 * Instantiates a new interval record.
	 *
	 * @param energy the interval energy in the unit of kWh
	 * @param volt the interval voltage in the unit of volt
	 */
	public IntervalRecord(double energy, double volt){
		values = new HashMap<String, Double>();
		
		this.values.put(CONSUMED_ENERGY_KEY, energy);
		this.values.put(CONSUMED_VOLTAGE_KEY, volt);
	}
	
	/**
	 * Instantiates a new interval record.
	 *
	 * @param energy the interval energy in the unit of kWh
	 * @param volt the interval voltage in the unit of volt
	 * @param temp the temperature in the unit of C
	 */
	public IntervalRecord(double energy, double volt, double temp){
		values = new HashMap<String, Double>();
		
		this.values.put(CONSUMED_ENERGY_KEY, energy);
		this.values.put(CONSUMED_VOLTAGE_KEY, volt);
		this.values.put(TEMPERATURE_KEY, temp);
	}
	
	/**
	 * Gets the interval energy data.
	 *
	 * @return the values
	 */
	public Map<String, Double> getValues(){
		return this.values;
	}
	
	/**
	 * Set the interval energy data.
	 *
	 * @param values the values
	 */
	public void setValues(Map<String, Double> values){
		this.values = values;
	}
}
