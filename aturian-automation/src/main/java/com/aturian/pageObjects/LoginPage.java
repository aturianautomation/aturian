package com.aturian.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aturian.base.Base;
import com.aventstack.extentreports.Status;


public class LoginPage extends Base {
	
	 Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	// Input email field
		@FindBy(xpath = "//input[@type='email']")
		private WebElement input_email;
		
		// input password field
		@FindBy(xpath = "//input[@type='password']")
		private WebElement input_password;

		// Sign in button
		@FindBy(xpath = "//button[@type='submit']")
		private WebElement button_signin;
		
		
		// Constructor to invoke WebElement
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}

		// Method for Sign in the application
		public DashboardPage signIn() throws InterruptedException {
			//NewExcelLibrary obj = new NewExcelLibrary();

			try {
				String username = prop.getProperty("login_username");
				String password = prop.getProperty("login_password");
				
				wait.until(ExpectedConditions.visibilityOf(button_signin));

				input_email.clear();
				// input_username.sendKeys(prop.getProperty("loginUsername"));
				input_email.sendKeys(username);

				input_password.clear();
				// input_password.sendKeys(prop.getProperty("loginPassword"));
				input_password.sendKeys(password);

				// Click on sign in button
				wait.until(ExpectedConditions.elementToBeClickable(button_signin)).click();
				Thread.sleep(5000);

				return new DashboardPage();
			} catch (Throwable e) {
				e.printStackTrace();
				test.log(Status.INFO, e);
				return new DashboardPage();
			}
		}
}
