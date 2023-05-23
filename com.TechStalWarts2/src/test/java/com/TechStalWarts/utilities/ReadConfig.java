package com.TechStalWarts.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.TechStalWarts.constants.FrameWorkConstants;

public  class ReadConfig {

	Properties prop;


	public ReadConfig() {
		File src=new File(FrameWorkConstants.getConfigfilepath());

		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		}catch(Exception e){
			System.out.println("Exception is "+ e.getMessage());
		}
	}

	public String getApplicationURl() {
		String url=prop.getProperty("baseURL");
		return url;
	}

	public String getUserName() {
		String username=prop.getProperty("userName");
		return username;
	}

	public String getPassWord() {
		String paSS=prop.getProperty("pass");
		return paSS;
	}
	
	public String getPIMURL() {
		String pimURL=prop.getProperty("pimURL");
		return pimURL;
	}


}
