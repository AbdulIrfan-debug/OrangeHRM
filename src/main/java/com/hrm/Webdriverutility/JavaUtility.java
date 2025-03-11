package com.hrm.Webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int namgetRandomNumber() {

		Random ran = new Random(); 
		int ranDom = ran.nextInt(5000);
		return ranDom;
	}

	public String getSystemDateYYYYDDMM() {
 
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = sdf.format(date);
		
		return date1;

	}
}
