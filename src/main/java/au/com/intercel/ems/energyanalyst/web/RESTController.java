package au.com.intercel.ems.energyanalyst.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import au.com.intercel.ems.energyanalyst.domain.Customer;
import au.com.intercel.ems.energyanalyst.domain.DailyRecord;
import au.com.intercel.ems.energyanalyst.service.EnergyAnalyticService;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// TODO: Auto-generated Javadoc
/**
 * The Class RESTController.
 */
@RestController
public class RESTController {
	
	/** The analytic service. */
	@Autowired
	private EnergyAnalyticService analyticService;
    
    /**
     * Gets the energy data.
     *
     * @param UserId the user id
     * @return the energy data
     */
    @RequestMapping("/api/energy/{name}")
    @ResponseBody
    public Collection<DailyRecord> getEnergyData(@PathVariable("name") String UserId) {
    	return this.analyticService.getEnergyData(UserId);
    }
    
    /**
     * Import energy data.
     *
     * @param file the file
     * @return the string
     */
    @RequestMapping(value="/api/energy", method=RequestMethod.POST)
    @ResponseBody
    public String importEnergyData(final MultipartFile file){
    	// http://stackoverflow.com/questions/28908229/how-to-implement-an-asynchronous-rest-request-to-a-controller-using-springboot
    	
    	// https://www.youtube.com/watch?v=106WWFvgNW0
    	
		return this.analyticService.importEnergyData(file);
    }
    

	/**
	 * Gets the customer data.
	 *
	 * @param UserId the user id
	 * @param startDate optional, the start date of the billing cycle
	 * @param endDate optional, the end date of the billing cycle
	 * @return the customer data with energy usage prediction
	 */
	@RequestMapping(value="/api/customer/{UserId}", method=RequestMethod.GET)
	@ResponseBody
	@Transactional(readOnly = true)
	public Customer getCustomerData(@PathVariable("UserId") String UserId,
			@RequestParam(value = "start", required = false) String startDate, 
			@RequestParam(value = "end", required = false) String endDate) {
		
		if((startDate ==null) && (endDate == null))
			return this.analyticService.getCustomerData(UserId);
		else
			return this.analyticService.getCustomerData(UserId, startDate, endDate);
	}	
}