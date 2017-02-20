package org.simple.angularjs.contact.util;

import java.util.Calendar;

public class DateUtil{
	
	public static String getBuildDateTime(){
		return Calendar.getInstance().getTime().toString().substring(10);
	}

}