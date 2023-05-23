package com.JarvisPortfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.TechStalWarts.pageObjects.BasePage;

public class InvestmentHorizon extends BasePage {

	WebDriverWait wait=null;
	public InvestmentHorizon(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	private final By riskYears=By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium  css-1sdf1vm'])[2]");
	private final By riskStratergy=By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div[1]");
	private final By submit=By.xpath("//button[text()='Submit my strategy']");
	private final By onboarding=By.xpath("//button[text()='Complete onboarding']");
	private final By minBalance=By.xpath("//button[text()='₹50,00,000']");
	private final By clickContinue=By.xpath("//button[text()='Continue']");
	private final By clickOnConfirm=By.xpath("(//button[text()='Confirm'])[1]");
	private final By unlockNow=By.xpath("(//div[text()='Unlock now'])[1]");


	public InvestmentHorizon clickOnUnlockNow() {
		//		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		//		wait.until(ExpectedConditions.elementToBeClickable(unlockNow));
		//		clicK(unlockNow);
		clickWithCondition(unlockNow);
		return this;
	}

	public InvestmentHorizon clickOnConfirm() {
		clicK(clickOnConfirm);
		return this;
	}

	public InvestmentHorizon clickOnContinue() {
		clicK(clickContinue);
		return this;
	}
	public InvestmentHorizon clickOnMinBalance() {
		clicK(minBalance);
		return this;
	}
	public InvestmentHorizon clickOnCompleteOnboarding() {
		clickWithCondition(onboarding);
		return this;
	}
	public InvestmentHorizon clickOnriskYears() {
		clickWithCondition(riskYears);
		return this;
	}

	public InvestmentHorizon clickOnriskStratergy() {
		clicK(riskStratergy);
		return this;
	}

	public InvestmentHorizon clickOnsubmit() {
		clicK(submit);
		return this;
	}

}
