package com.flightnetwork.flightnetwork;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix = "standard")
public class StandardEntity {

	private Integer slab1;
	private Integer slab2;
	private Integer slab3;
	
	
	
	public StandardEntity() {
		super();
	}
	public StandardEntity(Integer slab1, Integer slab2, Integer slab3) {
		super();
		this.slab1 = slab1;
		this.slab2 = slab2;
		this.slab3 = slab3;
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


}
