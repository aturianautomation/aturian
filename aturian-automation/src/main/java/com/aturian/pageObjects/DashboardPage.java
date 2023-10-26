package com.aturian.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aturian.base.Base;


public class DashboardPage extends Base {
	
	 Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	 
	
}
