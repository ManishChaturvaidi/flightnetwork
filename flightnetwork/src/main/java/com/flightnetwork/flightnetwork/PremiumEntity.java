package com.flightnetwork.flightnetwork;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "premium")
public class PremiumEntity {

	private Integer slab1;
	private Integer slab2;
	private Integer slab3;
	private Integer slab4;

	
	public PremiumEntity() {
		super();
	}


	public PremiumEntity(Integer slab1, Integer slab2, Integer slab3, Integer slab4) {
		super();
		this.slab1 = slab1;
		this.slab2 = slab2;
		this.slab3 = slab3;
		this.slab4 = slab4;
	}


	public Integer getSlab1() {
		return slab1;
	}


	public void setSlab1(Integer slab1) {
		this.slab1 = slab1;
	}


	public Integer getSlab2() {
		return slab2;
	}


	public void setSlab2(Integer slab2) {
		this.slab2 = slab2;
	}


	public Integer getSlab3() {
		return slab3;
	}


	public void setSlab3(Integer slab3) {
		this.slab3 = slab3;
	}


	public Integer getSlab4() {
		return slab4;
	}


	public void setSlab4(Integer slab4) {
		this.slab4 = slab4;
	}
	
	
	
}
