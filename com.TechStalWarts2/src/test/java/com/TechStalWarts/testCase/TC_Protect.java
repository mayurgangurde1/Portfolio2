package com.TechStalWarts.testCase;

import java.lang.reflect.Method;
import java.util.Map;

import org.testng.annotations.Test;

import com.JarvisPortfolio.SyncPortFolio;
import com.TechStalWarts.pageObjects.BaseClass1;
import com.TechStalWarts.pageObjects.LoginPage;
import com.TechStalWarts.testData.DataProviderUtils;

public class TC_Protect extends BaseClass1 {
	
	
	

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData" )
	public void tc_pro_001(Map<String , String> data,Method method) {
		new LoginPage(driver).goToLoginWithUserNamePass().clearTExtField()
		.setuserName(data.get("username")).setPass(data.get("password")).doLogin();
		sleep();
	}
	


	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData" )
	public void tc_pro_002(Map<String , String> data,Method method) {
		riskass.clickOnStart().ProOneAns().ProTwoAns().ProThreeAns().ProFourAns()
		.ProFiveAns().ProSixAns().ProSevenAns().ProEightAns().ProNineAns().ProTenAns();
		riskass.clickOnSubmit().confirmSubmit();
		sleep();
		scrollDown();
		sleep();
		scrollDown();
		sleep();
		riskass.clickOnCheckBox().clickOnConfirmRiskAss();sleep();
	}
	

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData" )
	public void tc_pro_003(Map<String , String> data,Method method) {
		new SyncPortFolio(driver).clickOnUploadExcel().browsFile().clickOnSubmit();
		
	
	}
	
	
	
}
