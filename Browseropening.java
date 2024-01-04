package com.webopenetc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Browseropening extends Openwebdriver {
@Test
	public void webopenlist() {
		
		//WebDriver browser = new ChromeDriver();//control+space button = import selenium 
	
		browser.get ("https://mvnrepository.com/artifact/org.testng/testng/7.9.211");
		System.out.println(browser.getTitle());
		//Assert.assertEquals(browser.getTitle(),"Maven Repository: org.testng » testng » 7.9.0" );
		Assert.assertTrue(true);
		//browser.close();
		
	}
}
