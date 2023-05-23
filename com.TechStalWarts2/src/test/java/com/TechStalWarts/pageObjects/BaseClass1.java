package com.TechStalWarts.pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.JarvisPortfolio.RiskAssessment;
import com.TechStalWarts.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	ReadConfig rc=new ReadConfig();

	public static WebDriver driver;
	public String baseURL=rc.getApplicationURl();
	public String userName=rc.getUserName();
	public String pass=rc.getPassWord();

	@SuppressWarnings("deprecation")
	@BeforeSuite
	public  void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//		System.setProperty("webdriver.chrome.driver",FrameWorkConstants.
		//				getChromedriverpath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL);
		Thread.sleep(5000);

	}
	@AfterSuite
	public void tearDown() {
	//	driver.quit();
	}


	public static void captureScreenShot(WebDriver driver, String tName)  {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/screenShots/"+tName+".png");


		try {
			Thread.sleep(2000);
			FileUtils.copyFile(source,target);
			System.out.println("Screen Shot taken");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}			

		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void scrollDown() {
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,600)", "");
	}
	



	public RiskAssessment riskass;
	@BeforeClass
	public void pageObjects() {
			riskass=new RiskAssessment(driver);

	}

	
	


















}
