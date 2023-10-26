package com.aturian.utility;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aturian.base.Base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;




public class ExtentManager extends Base{
	
	public static void setExtent() throws IOException {
		   
		String dateName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());//yyyyMMddhhmmss
		
		//htmlReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"//test-output//ExtentReport//"+"MyReport.html");
		htmlReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/"+"aturian+ Report"+ "_" + dateName + ".html");
		htmlReporter.config().setDocumentTitle("MyHealthBook+");
		htmlReporter.config().setReportName("MyHealthBook+");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//To set system/environment on summary page
//		extent.setSystemInfo("ProjectName", "aturian");
//		extent.setSystemInfo("Tester", "Ratin Kumar");

		


	}
	public static void endReport() {
		extent.flush();
	}
}
