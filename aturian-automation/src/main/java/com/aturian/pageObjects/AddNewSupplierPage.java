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


public class AddNewSupplierPage extends Base {
	
	 Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	 
	// Input email field
	@FindBy(xpath = "//a[normalize-space()='Add New Supplier']")
	private WebElement btn_addNewSupplier;
	
	// Constructor to invoke WebElement
	public AddNewSupplierPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Method for Navigate to the Add new Supplier screen
			public AddNewSupplierPage navigateToAddNewSupplierScreen() throws InterruptedException {
				//NewExcelLibrary obj = new NewExcelLibrary();

				try {

					return new AddNewSupplierPage();
				} catch (Throwable e) {
					e.printStackTrace();
					test.log(Status.INFO, e);
					return new AddNewSupplierPage();
				}
			}
	

	 
	
}
