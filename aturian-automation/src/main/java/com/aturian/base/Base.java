package com.aturian.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aturian.utility.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;




public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;


	
	@BeforeSuite(groups = {"smoke", "sanity", "regression" })
	// Method to initialize log4j.xml file and set extents for extent report
	public void loadConfig() throws Throwable {
		ExtentManager.setExtent();
		DOMConfigurator.configure("log4j.xml");

		try {
			String path = System.getProperty("user.dir") + "//Configuration//Config.properties";

			// Creating object for Properties class.
			prop = new Properties();

			// Creating object for FileInputStream to read properties file.
			FileInputStream inputstream = new FileInputStream(path);

			prop.load(inputstream);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//@Parameters("Browser")
	@BeforeTest
	public void setup() throws InterruptedException {		
		
//		if (browser.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		} else if (browser.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		} else if (browser.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//		} else {
//			driver = new ChromeDriver();
//		}
		
		driver = new FirefoxDriver();
		driver.get(prop.getProperty("base_url"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@AfterSuite(groups = { "smoke", "sanity", "regression" })
	public void afterSuite() {
		ExtentManager.endReport();
	}
	
}
