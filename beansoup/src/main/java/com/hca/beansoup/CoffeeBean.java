package com.hca.beansoup;

import org.springframework.stereotype.Component;

@Component
public class CoffeeBean {
	private boolean soupBean;

	public boolean isSoupBean() {
		return soupBean;
	}

	public void setSoupBean(boolean soupBean) {
		this.soupBean = soupBean;
	}
}
