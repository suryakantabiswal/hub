package com.nt.beans;

import java.util.Date;

public class WishmessageGenerater {
	private Date date;

	public WishmessageGenerater(Date date1) {
		System.out.println("0-param constructor");
		this.date = date1;
	}
	public void setDate(Date date) {
		System.out.println("setter method");
		this.date=date;
		
	}
	public String GenerateWishMsg(String name) {
		System.out.println("DAte:"+date);
		int hour=0;
		//get cuurrent hour
		hour=date.getHours();
		if(hour<=12)
		return "GM:"+name;
		else if(hour<=16)
			return "GA:"+name;
		else if(hour<=20)
			return "GE:"+name;
		else
			return "GN:"+name;
	}
	
}
