package com.JarvisPortfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TechStalWarts.constants.FrameWorkConstants;
import com.TechStalWarts.pageObjects.BasePage;

public class SyncPortFolio extends BasePage{

	public SyncPortFolio(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	private final By upload=By.xpath("(//button[text()='Upload Excel'])[2]");
	private final By brows=By.xpath("//a[text()='Browse File']");
	private final By submit=By.xpath("//button[text()='Submit']");





	public SyncPortFolio clickOnSubmit() {
		clickWithCondition(submit);
		return this;
	}
	public SyncPortFolio clickOnUploadExcel() {
		clickWithCondition(upload);
		return this;
	}

	public SyncPortFolio browsFile() {
		sendKeys(brows, FrameWorkConstants.getFilePath());
		return this;
	}



}
