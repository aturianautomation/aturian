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

public class SupplierListPage extends Base {

	Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));

	// Add New Supplier Button
	@FindBy(xpath = "//a[normalize-space()='Add New Supplier']")
	private WebElement btn_add_new_supplier;

	// Constructor to invoke WebElement
	public SupplierListPage() {
		PageFactory.initElements(driver, this);
	}

	// Method for Navigate to the Add new Supplier screen
	public AddNewSupplierPage navigateToAddNewSupplierPage() throws InterruptedException {

		try {
			wait.until(ExpectedConditions.visibilityOf(btn_add_new_supplier)).click();
			return new AddNewSupplierPage();
		} catch (Throwable e) {
			e.printStackTrace();
			test.log(Status.INFO, e);
			return new AddNewSupplierPage();
		}
	}

}
