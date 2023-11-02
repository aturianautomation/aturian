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

public class DashboardPage extends Base {

	Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));


	// Supplier button from left navigation
	@FindBy(xpath = "//h6[normalize-space()='Suppliers']")
	private WebElement btn_supplier;
	
	// Manage Supplier button from left navigation
	@FindBy(xpath = "//h6[normalize-space()='Manage Suppliers']")
	private WebElement btn_manage_supplier;

	// Constructor to invoke WebElement
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	
	
	// Method for Navigate to the Add new Supplier screen
		public SupplierListPage navigateToSupplierListPage() throws InterruptedException {

			try {
				wait.until(ExpectedConditions.visibilityOf(btn_supplier)).click();
				wait.until(ExpectedConditions.visibilityOf(btn_manage_supplier)).click();
				return new SupplierListPage();
			} catch (Throwable e) {
				e.printStackTrace();
				test.log(Status.INFO, e);
				return new SupplierListPage();
			}
		}

}
