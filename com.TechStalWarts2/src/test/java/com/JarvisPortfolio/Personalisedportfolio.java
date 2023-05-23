package com.JarvisPortfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.TechStalWarts.pageObjects.BasePage;

public class Personalisedportfolio extends BasePage {

	public Personalisedportfolio(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private final By pay=By.xpath("//button[text()='Pay ']");
	private final By iAgree=By.xpath("//button[text()='I agree']");
	private final By UPI=By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/span/input");
	private final By enterUPIId=By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[3]/div/div/div/input");
	private final By verify=By.xpath("//button[text()='Verify']");
	private final By payWithPaymentMode=By.xpath("(//button[text()='Pay '])[1]");
	private final By payUsingUPI=By.xpath("//button[text()='Pay using UPI / QR']");
	private final By frame=By.xpath("/html/body/div[4]/iframe");
	private final By enterUPIID=By.xpath("//*[@id='vpa-upi']");
	private final By payNow=By.xpath("//button[text()='Pay Now']");
	private final By proceedToCKYC=By.xpath("(//button[text()='Proceed to CKYC'])[1]");
	private final By clickOnQR=By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[5]/div[1]/div[1]/div/div/div[1]/div[2]/div[1]/div[1]/div/div");
	private final By onboarding=By.xpath("//div[@class='MuiBox-root css-8atqhb']");
	private final By page=By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div[5]");
	private final By clickContinue=By.xpath("//button[text()='Continue']");


	public Personalisedportfolio clickOnContinue() {
		clickWithCondition(clickContinue);
		return this;
	}
	public Personalisedportfolio clickonPage() {
		clicK(page);
		driver.findElement(page).sendKeys(Keys.TAB, Keys.ENTER);
		return this;
	}


	public Personalisedportfolio clickOnOnboarding() {
		clickWithCondition(onboarding);
		return this;
	}
	public Personalisedportfolio clickOnQRCoce() {
		clickWithCondition(clickOnQR);
		return this;
	}
	public Personalisedportfolio clickOnProceedToCKYC() {
		clickWithCondition(proceedToCKYC);
		return this;
	}
	public Personalisedportfolio clickOnPayNow() {
		clickWithCondition(payNow);
		return this;
	}
	public Personalisedportfolio enterUPIID(String value) {
		sendKeys(enterUPIID, value);
		return this;
	}
	public Personalisedportfolio clickOnPayUsingUPI() {
		clickWithCondition(payUsingUPI);
		return this;
	}
	public Personalisedportfolio clickOnverify() {
		clickWithCondition(verify);
		return this;
	}
	public Personalisedportfolio clickOnPayWithPaymentMode() {
		clickWithCondition(payWithPaymentMode);
		return this;
	}
	public Personalisedportfolio typeUPIID(String value) {
		sendKeys(enterUPIId, value);
		return this;
	}

	public Personalisedportfolio clickonUPI() {
		clicK(UPI);
		return this;
	}

	public Personalisedportfolio clickOnPay() {
		clicK(pay);
		return this;
	}

	public Personalisedportfolio clickOnAgree() {
		clicK(iAgree);
		return this;
	}

	public void switchFrames() {
		driver.switchTo().frame(driver.findElement(frame));
	}


}
