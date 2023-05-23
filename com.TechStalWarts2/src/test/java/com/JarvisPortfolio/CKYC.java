package com.JarvisPortfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TechStalWarts.pageObjects.BasePage;

public class CKYC extends BasePage{

	public CKYC(WebDriver driver) {
		super(driver);
	}


	private final By pan=By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div/div[2]/div/div[4]/div/input");
	private final By dob=By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div/div[2]/div/div[5]/div/input");
	private final By submitVer=By.xpath("//button[text()='Submit for verification']");
	private final By clientAgree=By.xpath("//button[text()='Proceed to Client Agreement']");




	public CKYC clickOnclientAgreement() {
		clickWithCondition(clientAgree);
		return this;
	}
	public CKYC clickOnSubmitVer() {
		clickWithCondition(submitVer);
		return this;
	}		

	public CKYC  enterPANnum(String value) {
		sendKeys(pan, value);
		return this;
	}

	public CKYC enterDOB(String value) {
		sendKeys(dob, value);
		return this;
	}




}
