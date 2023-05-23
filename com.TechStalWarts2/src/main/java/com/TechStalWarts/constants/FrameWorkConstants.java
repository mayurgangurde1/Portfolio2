package com.TechStalWarts.constants;

public class FrameWorkConstants {


	private FrameWorkConstants() {

	}

	private static final String RESOURCEPATH=System.getProperty("user.dir")+"/src/test/resources";
	private static final String CHROMEDRIVERPATH=FrameWorkConstants.getResourcepath()+"/executables/chromedriver.exe";
	private static final String CONFIGFILEPATH=FrameWorkConstants.getResourcepath()+"/config/config.properties";
	private static final String EXCELAPTH=FrameWorkConstants.getResourcepath()+"/excel/DataSheet.xlsx";
	private static final String RUNMNAGERSHEET="RUNMANAGER";
	private static final String ITERATIONSHEET="Data";
	private static final String logInPageTitle="Jarvis Invest : Wisdom meets science";
	private static final String errorMessage="Invalid Email format";
	private static final String errorMessageForPass="Invalid Password format";
	private static final String upiID="kiran@paytm";
	private static final String upiIDrazorPay="success@razorpay";
	private static final String filePath=FrameWorkConstants.getResourcepath()+"/excel/PortfolioSyncUpload.xlsx";




	public static String getFilePath() {
		return filePath;
	}
	public static String getUPIIDRazorPay() {
		return upiIDrazorPay;
	}
	public static String getUPIID() {
		return upiID;
	}	
	public static String getPassErrorMsg() {
		return errorMessageForPass;
	}
	public static String getReqErrorMsg() {
		return errorMessage;
	}
	public static String getLogInPageTitle() {
		return logInPageTitle;
	}
	public static String getRunManagerSheet() {
		return RUNMNAGERSHEET;
	}
	public static String getIterationsheet() {
		return ITERATIONSHEET;
	}

	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}

	public static String getExcelFilePath() {
		return EXCELAPTH;
	}

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}

	public static String getResourcepath() {
		return RESOURCEPATH;
	}

}
