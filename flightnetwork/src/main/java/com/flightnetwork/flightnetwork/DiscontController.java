package com.flightnetwork.flightnetwork;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/Discount/")
public class DiscontController {
	
	@Autowired
	private DiscountService dService;
	
	@GetMapping()
	public ResponseEntity<Integer> calculateDiscount(@QueryParam("userType") String userType, @QueryParam("amount") int amount)
	{
		Integer result=0;
		if(userType.equalsIgnoreCase("standard")) {
			result=dService.statndardDiscount(amount);
		}
		else if(userType.equalsIgnoreCase("premium")) {
			result=dService.premiumDiscount(amount);
		}
		else {
			return new ResponseEntity("User type not exist",HttpStatus.NOT_FOUND);
		}
		ResponseEntity<Integer> response = new ResponseEntity<>(result,HttpStatus.ACCEPTED);	
	return response;	
	}

}
