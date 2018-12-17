package com.flightnetwork.flightnetwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

	@Autowired(required=true)
	private PremiumEntity pEntity;
	
	@Autowired(required=true)
	private StandardEntity sEntity;

	public Integer statndardDiscount(Integer amount) {
		Integer dist=0;
		
	
		if (amount==0 || amount<500) {
			return dist;
		}
		if(amount>=5000)
		{
			dist = (amount-4999)*sEntity.getSlab3()/100;
			amount=4999;
		}			
		if(amount>=3000) {
				dist = dist+((amount-3000)*sEntity.getSlab2()/100);
			    amount=1000;
			}
		if(amount>500) {
				dist = dist+(amount-500)*sEntity.getSlab1()/100;
			}
			
	
	return dist;
}
	
public Integer premiumDiscount(Integer amount) {
	
		
	Integer dist=0;
	
	
	if (amount==0 || amount<500) {
		return dist;
	}
	if(amount>=5000)
	{
		dist = (amount-4999)*pEntity.getSlab4()/100;
		amount=4999;
	}			
	if(amount>=3000) {
			dist = dist+((amount-3000)*pEntity.getSlab3()/100);
		    amount=3000;
		}
	if(amount>=1000) {
		dist = dist+(amount-1000)*pEntity.getSlab2()/100;
		amount=1000;
	}
	if(amount>500) {
			dist = dist+(amount-500)*pEntity.getSlab1()/100;
		}
		

return dist;

}

}
