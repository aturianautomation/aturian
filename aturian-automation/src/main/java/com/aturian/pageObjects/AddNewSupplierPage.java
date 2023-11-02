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
import com.aturian.utility.NewExcelLibrary;
import com.aventstack.extentreports.Status;


public class AddNewSupplierPage extends Base {
	
	 Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	 
	//Basics
	 // Input name field
	@FindBy(xpath = "//input[@id='name']")
	private WebElement input_name;
	
	// Input supplier id
	@FindBy(xpath = "//input[@id='number']")
	private WebElement input_supplierId;
	
	// Input ASI
	@FindBy(xpath = "//input[@id='externalId']")
	private WebElement input_asi;
	
	// Button primary contact add new
	@FindBy(xpath = "//button[normalize-space()='+ Add New']")
	private WebElement btn_addNew;
	
	// Input Non-Order GL
	@FindBy(xpath = "//input[@id='accountNumber']")
	private WebElement input_nonOrderGL;
	
	// Drop-down Non-Order GL Amex
	@FindBy(xpath = "//li[@id='accountNumber-option-0']")
	private WebElement dropDown_amex;
	
	// Input Alias
	@FindBy(xpath = "//input[@id='alias']")
	private WebElement input_alias;
	
	//Notifications
	// Input General email
	@FindBy(xpath = "//input[@id='emailGeneral']")
	private WebElement input_generalEmail;
	
	// Input General web-hook
	@FindBy(xpath = "//input[@id='apiGeneral']")
	private WebElement input_generalWebhook;
	
	// Input order email
	@FindBy(xpath = "//input[@id='emailBilling']")
	private WebElement input_orderEmail;
	
	// Input order web-hook
	@FindBy(xpath = "//input[@id='apiBilling']")
	private WebElement input_orderWebhook;
	
	// Input art notification email
	@FindBy(xpath = "//input[@id='emailArt']")
	private WebElement input_artEmail;
	
	// Input  art notification web-hook
	@FindBy(xpath = "//input[@id='apiArt']")
	private WebElement input_artWebhook;
	
	// Input PO notification email
	@FindBy(xpath = "//input[@id='emailPurchaseOrders']")
	private WebElement input_poEmail;
	
	// Input PO notification web-hook
	@FindBy(xpath = "//input[@id='apiPurchaseOrders']")
	private WebElement input_poWebhook;
	
	//Terms & Payments
	// Input terms
	@FindBy(xpath = "//input[@id='terms']")
	private WebElement input_terms;
	
	// Drop-down terms 50% deposit
	@FindBy(xpath = "//li[@id='terms-option-0']")
	private WebElement dropDown_50percentDeposit;
	
	// Drop-down terms prepay required
	@FindBy(xpath = "//li[@id='terms-option-1']")
	private WebElement dropDown_prepayRequired;
	
	// Drop-down terms net45
	@FindBy(xpath = "//li[@id='terms-option-2']")
	private WebElement dropDown_net45;
	
	// Drop-down terms net30
	@FindBy(xpath = "//li[@id='terms-option-3']")
	private WebElement dropDown_net30;
	
	// label Is this a preferred vendor
	@FindBy(xpath = "//label[normalize-space()='Is this a Preferred Vendor?']")
	private WebElement lbl_preferredVendor;
	
	// Input Preferred payment
	@FindBy(xpath = "//input[@id='paymentPreference']")
	private WebElement input_preferredPayment;
	
	// Drop-down preferred payment Amex
	@FindBy(xpath = "//li[@id='paymentPreference-option-0']")
	private WebElement dropDown_prefPayAmex;
	
	// Drop-down preferred payment Checks
	@FindBy(xpath = "//li[@id='paymentPreference-option-1']")
	private WebElement dropDown_prefPayChecks;
	
	// Drop-down preferred payment ACH
	@FindBy(xpath = "//li[@id='paymentPreference-option-2']")
	private WebElement dropDown_prefPayACH;
	
	// Drop-down preferred payment CC
	@FindBy(xpath = "//li[@id='paymentPreference-option-3']")
	private WebElement dropDown_prefPayCC;
	
	// Drop-down preferred payment Demo
	@FindBy(xpath = "//li[@id='paymentPreference-option-4']")
	private WebElement dropDown_prefPayDemo;
	
	// Input Deal
	@FindBy(xpath = "//input[@id='deal']")
	private WebElement input_deal;
	
	//Ship Methods
	// Input Default Ship Method
	@FindBy(xpath = "//input[@id='shipMethods-0']")
	private WebElement input_defaultShipMethod;
	
	// Drop-down default Ship Method UPS Ground
	@FindBy(xpath = "//li[@id='shipMethods-0-option-0']")
	private WebElement dropDown_upsGround;
	
	// Drop-down default Ship Method PSST
	@FindBy(xpath = "//li[@id='shipMethods-0-option-1']")
	private WebElement dropDown_psst;
	
	// Drop-down default Ship Method SANMAR_2.0
	@FindBy(xpath = "//li[@id='shipMethods-0-option-2']")
	private WebElement dropDown_sanmar;
	
	// Input Supplier to Supplier
	@FindBy(xpath = "//input[@id='shipMethods-1']")
	private WebElement input_supplierToSupplier;
	
	// Drop-down Supplier to Supplier UPS Ground
	@FindBy(xpath = "//li[@id='shipMethods-1-option-0']")
	private WebElement dropDown_upsGround1;
	
	// Drop-down Supplier to Supplier PSST
	@FindBy(xpath = "//li[@id='shipMethods-1-option-1']")
	private WebElement dropDown_psst1;
	
	// Drop-down Supplier to Supplier SANMAR_2.0
	@FindBy(xpath = "//li[@id='shipMethods-1-option-2']")
	private WebElement dropDown_sanmar1;
	
	// Input Supplier to Customer
	@FindBy(xpath = "//input[@id='shipMethods-2']")
	private WebElement input_supplierToCustomer;
	
	// Drop-down Supplier to Customer UPS Ground
	@FindBy(xpath = "//li[@id='shipMethods-2-option-0']")
	private WebElement dropDown_upsGround2;
	
	// Drop-down Supplier to Customer PSST
	@FindBy(xpath = "//li[@id='shipMethods-2-option-1']")
	private WebElement dropDown_psst2;
	
	// Drop-down Supplier to Customer SANMAR_2.0
	@FindBy(xpath = "//li[@id='shipMethods-2-option-2']")
	private WebElement dropDown_sanmar2;
	
	// Input Supplier to Client warehouse
	@FindBy(xpath = "//input[@id='shipMethods-3']")
	private WebElement input_supplierToClientWarehouse;
	
	// Drop-down Supplier to Client warehouse UPS Ground
	@FindBy(xpath = "//li[@id='shipMethods-3-option-0']")
	private WebElement dropDown_upsGround3;
	
	// Drop-downSupplier to Client warehouse PSST
	@FindBy(xpath = "//li[@id='shipMethods-3-option-1']")
	private WebElement dropDown_psst3;
	
	// Drop-down Supplier to Client warehouse SANMAR_2.0
	@FindBy(xpath = "//li[@id='shipMethods-3-option-2']")
	private WebElement dropDown_sanmar3;
	
	//Shipping Address
	//Input Name
	@FindBy(xpath = "//input[@id='shipping-recipient']")
	private WebElement shipping_name;
	
	//Input Attention
	@FindBy(xpath = "//input[@id='shipping-attention']")
	private WebElement shipping_attention;
	
	//Input Company Name
	@FindBy(xpath = "//input[@id='shipping-companyName']")
	private WebElement shipping_companyName;
	
	//Input Address Line-1
	@FindBy(xpath = "//input[@id='shipping-addressLineOne']")
	private WebElement shipping_addressLineOne;
	
	//Input Address Line-2
	@FindBy(xpath = "//input[@id='shipping-addressLineTwo']")
	private WebElement shipping_addressLineTwo;
	
	//Input Address Line-3
	@FindBy(xpath = "//input[@id='shipping-addressLineThree']")
	private WebElement shipping_addressLineThree;
	
	//Input City
	@FindBy(xpath = "//input[@id='shipping-city']")
	private WebElement shipping_city;
	
	
	// Constructor to invoke WebElement
	public AddNewSupplierPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Method for Navigate to the Add new Supplier screen
			public void addNewSupplier(){
				NewExcelLibrary obj = new NewExcelLibrary();

				try {

					//return new AddNewSupplierPage();
				} catch (Throwable e) {
					e.printStackTrace();
					test.log(Status.INFO, e);
					//return new AddNewSupplierPage();
				}
			}
	

	 
	
}
