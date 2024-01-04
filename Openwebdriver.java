package com.webopenetc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Openwebdriver {
   public WebDriver browser;
	@BeforeSuite
   public void webdriver(){
		 
	 browser = new ChromeDriver();
		

	}
	@AfterSuite
	public void quiteBrowser() {
		browser.close();
	}
	
}
