package com.TechStalWarts.testCase;
import java.lang.reflect.Method;
import java.util.Map;

import org.testng.annotations.Test;

import com.TechStalWarts.constants.FrameWorkConstants;
import com.TechStalWarts.pageObjects.BaseClass;
import com.TechStalWarts.pageObjects.LoginPage;
import com.TechStalWarts.testData.DataProviderUtils;



public  class TC_LogInTest extends BaseClass {


	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void logInTest(Map<String , String> data,Method method) {
		new LoginPage(driver).goToLoginWithUserNamePass().clearTExtField().setuserName(data.get("username")).setPass(data.get("password")).doLogin();
		new LoginPage(driver).checkCondition(FrameWorkConstants.getLogInPageTitle() , method.getName());
		new LoginPage(driver).doLogout();

	}

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void verifyEmail01(Map<String , String> data,Method method) {
		new LoginPage(driver).goToLoginWithUserNamePass().clearTExtField().setuserName(data.get("username")).setPass(data.get("password")).doLogin()
		.checkCondition3(FrameWorkConstants.getReqErrorMsg(), method.getName());
	}


	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void verifyEmail02(Map<String , String> data,Method method) {
		new LoginPage(driver).goToLoginWithUserNamePass().clearTExtField().setuserName(data.get("username")).setPass(data.get("password")).doLogin()
		.checkCondition3(FrameWorkConstants.getReqErrorMsg(), method.getName());
	}

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void verifyPass01(Map<String , String> data,Method method) {
		new LoginPage(driver).goToLoginWithUserNamePass().clearTExtField().setuserName(data.get("username")).setPass(data.get("password")).doLogin()
		.checkConditionForWrongPass(FrameWorkConstants.getPassErrorMsg(),method.getName());
	}

}



