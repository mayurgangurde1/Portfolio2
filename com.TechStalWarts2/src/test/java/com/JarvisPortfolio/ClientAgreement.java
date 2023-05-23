package com.JarvisPortfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TechStalWarts.pageObjects.BasePage;

public class ClientAgreement extends BasePage{

	public ClientAgreement(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	private final By frm=By.xpath("//*[@id=\"digio-ifm-1684743219447\"]");
	private final By checkBoxfirst=By.xpath("/html/body/app-root/app-layout/div/main/app-esign/app-modal[2]/div/div/div/div[2]/div[1]/div/app-checkbox-component/label/div[2]");
	private final By checkBoxsecnd=By.xpath("/html/body/app-root/app-layout/div/main/app-esign/app-modal[2]/div/div/div/div[2]/div[2]/div/app-checkbox-component/label/div[2]");

	public ClientAgreement switchFrame() {
		driver.switchTo().frame(driver.findElement(frm));
		return this;
	}
	
	

}
