package com.TechStalWarts.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private final By tsLoginWithPass=By.xpath("//button[text()='Login with ']");
	private final By userName=By.xpath("//*[@id=\"mui-2\"]");
	private final By passWord=By.xpath("//*[@id=\"mui-6\"]");
	private final By loginButton=By.xpath("//*[@id=\"mui-7\"]");
	private final By logout=By.xpath("//*[@id=\"root\"]/div/div[2]/div/header/div[2]/div/button");
	private final By errormsg=By.xpath("//p[text()='Invalid Email format']");
	private final By errormsgPass=By.xpath("//p[text()='Invalid Password format']");


	public LoginPage clearTExtField() {
		clear(userName);
		return this;
	}
	public LoginPage goToLoginWithUserNamePass() {
		clickWithCondition(tsLoginWithPass);
		return this;
	}


	public void doLogout()  {
		clicK(logout);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public LoginPage setuserName(String uname) {
		sendKeys(userName, uname );
		return this;
	}

	public LoginPage setPass(String pass) {
		sendKeys(passWord, pass );
		return this;
	}

	public LoginPage doLogin() {
		clicK(loginButton);
		return this;
	}


	public void checkCondition(String msg ,String tName) {
		assertCondition(msg, tName);
	}

	public void checkCondition2(String url ,String tName) {
		assertCondition2(url, tName);
	}

	public void checkCondition3(String msg,String methodName) {
		assertCondion4(msg, errormsg, methodName);

	}
	
	public void checkConditionForWrongPass(String msg ,String methodName) {
		assertCondion4(msg, errormsgPass, methodName);
	}

}
