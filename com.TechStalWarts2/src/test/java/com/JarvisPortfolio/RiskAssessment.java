package com.JarvisPortfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TechStalWarts.pageObjects.BasePage;

public class RiskAssessment extends BasePage {


	public RiskAssessment(WebDriver driver) {

		super(driver);

		// TODO Auto-generated constructor stub
	}


	//******************Page elements***************
	private final By investNow=By.xpath("(//button[text()='Invest Now'])[1]");
	private final By investNowProtect=By.xpath("(//button[text()='Invest Now'])[2]");
	private final By startNow=By.xpath("//button[text()='Start now']");
	private final By asn1=By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div[5]/div[4]/ul/div[1]");
	private final By ansForProtect=By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div[5]/div[4]/ul/div[1]");
	private final By submit=By.xpath("//button[text()='Submit my responses']");
	private final By confirmSubmit=By.xpath("(//button[text()='Submit my responses'])[2]");
	private final By checkBox=By.xpath("//input[@type='checkbox']");
	private final By confirmRiskAss=By.xpath("//button[text()='I confirm my risk profile']");
	





	//******************methods****************

	public RiskAssessment ProOneAns() {
		clickWithCondition(ansForProtect);
		return this;
	}
	public RiskAssessment ProTwoAns() {
		clickWithCondition(ansForProtect);
		return this;
	}public RiskAssessment ProThreeAns() {
		clickWithCondition(ansForProtect);
		return this;
	}public RiskAssessment ProFourAns() {
		clickWithCondition(ansForProtect);
		return this;
	}public RiskAssessment ProFiveAns() {
		clickWithCondition(ansForProtect);
		return this;
	}public RiskAssessment ProSixAns() {
		clickWithCondition(ansForProtect);
		return this;
	}public RiskAssessment ProSevenAns() {
		clickWithCondition(ansForProtect);
		return this;
	}public RiskAssessment ProEightAns() {
		clickWithCondition(ansForProtect);
		return this;
	}public RiskAssessment ProNineAns() {
		clickWithCondition(ansForProtect);
		return this;
	}public RiskAssessment ProTenAns() {
		clickWithCondition(ansForProtect);
		return this;
	}

	public RiskAssessment clickOnInvestNowTwo() {
		clickWithCondition(investNowProtect);
		return this;
	}

	public RiskAssessment clickOnConfirmRiskAss() {
		clicK(confirmRiskAss);
		return this;
	}
	public RiskAssessment clickOnCheckBox() {
		clickWithCondition(checkBox);
		return this;
	}
	public RiskAssessment confirmSubmit() {
		clicK(confirmSubmit);
		return this;
	}
	public RiskAssessment clickOnSubmit() {
		clicK(submit);
		return this;
	}

		public RiskAssessment clickOnInvestNow() {
			clicK(investNow);
			return this;
		}
	public RiskAssessment clickOnStart() {
		clicK(startNow);
		return this;
	}

	public RiskAssessment qstnOne() {
		clicK(asn1);
		return this;
	}
	public RiskAssessment qstnTwo() {
		clicK(asn1);
		return this;
	}

	public RiskAssessment qstnThree() {
		clicK(asn1);
		return this;
	}

	public RiskAssessment qstnFour() {
		clicK(asn1);
		return this;
	}

	public RiskAssessment qstnFive() {
		clicK(asn1);
		return this;
	}
	public RiskAssessment qstnSix() {
		clicK(asn1);
		return this;
	}
	public RiskAssessment qstnSeven() {
		clicK(asn1);
		return this;
	}
	public RiskAssessment qstnEgt() {
		clicK(asn1);
		return this;
	}
	public RiskAssessment qstnNine() {
		clicK(asn1);
		return this;
	}
	public RiskAssessment qstnTen() {
		clicK(asn1);
		return this;
	}	

}
