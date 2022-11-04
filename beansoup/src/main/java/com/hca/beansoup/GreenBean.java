package com.hca.beansoup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreenBean {
	private boolean soupBean;
	
	@Autowired
	public GreenBean(boolean soupBean) {
		this.soupBean = soupBean;
	}

	public boolean isSoupBean() {
		return soupBean;
	}

	public void setSoupBean(boolean soupBean) {
		this.soupBean = soupBean;
	}
	
	

}
