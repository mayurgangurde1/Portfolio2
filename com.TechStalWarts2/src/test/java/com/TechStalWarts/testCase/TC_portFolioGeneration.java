package com.TechStalWarts.testCase;

import java.lang.reflect.Method;
import java.util.Map;

import org.testng.annotations.Test;

import com.JarvisPortfolio.CKYC;
import com.JarvisPortfolio.InvestmentHorizon;
import com.JarvisPortfolio.Personalisedportfolio;
import com.TechStalWarts.constants.FrameWorkConstants;
import com.TechStalWarts.pageObjects.BaseClass1;
import com.TechStalWarts.pageObjects.LoginPage;
import com.TechStalWarts.testData.DataProviderUtils;

public class TC_portFolioGeneration extends BaseClass1{

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData" )
	public void tc_001(Map<String , String> data,Method method) {
		new LoginPage(driver).goToLoginWithUserNamePass().clearTExtField()
		.setuserName(data.get("username")).setPass(data.get("password")).doLogin();
		sleep();
	}


	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData" )
	public void tc_002(Map<String , String> data) {
		riskass.clickOnInvestNow().clickOnStart(). 
		qstnOne().qstnTwo().qstnThree().qstnFour().qstnFive().qstnSix().qstnSeven().qstnEgt().qstnNine().qstnTen();
		scrollDown();
		riskass.clickOnSubmit().confirmSubmit();
		scrollDown();
		riskass.clickOnCheckBox().clickOnConfirmRiskAss();
	}

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void tc_003(Map<String , String> data) {
		scrollDown();
		sleep();
		new InvestmentHorizon(driver).clickOnriskYears().clickOnriskStratergy().clickOnsubmit().clickOnMinBalance().clickOnContinue().clickOnConfirm();
		new InvestmentHorizon(driver).clickOnUnlockNow();
	}

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void tc_004(Map<String , String> data) {
		scrollDown();
		new InvestmentHorizon(driver).clickOnUnlockNow();
		new Personalisedportfolio(driver).clickOnPay().clickOnAgree().clickonUPI().typeUPIID(FrameWorkConstants.getUPIID()).clickOnverify();
		scrollDown();
		new Personalisedportfolio(driver).clickOnPayWithPaymentMode().switchFrames();
		scrollDown();
		new Personalisedportfolio(driver). clickOnPayUsingUPI() .enterUPIID(FrameWorkConstants.getUPIIDRazorPay()).clickOnPayNow().clickOnContinue().clickOnProceedToCKYC();


	}

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData" )
	public void tc_005(Map<String , String> data) {	
		new CKYC(driver).enterPANnum(data.get("PAN")).enterDOB(data.get("DOB")).clickOnSubmitVer();
		scrollDown();
		new CKYC(driver).clickOnclientAgreement();

	}

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData" )
	public void tc_006(Map<String , String> data) {


	}
}
