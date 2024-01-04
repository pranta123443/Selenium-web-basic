package com.webopenetc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationtest {
 
	@Test
	public void Testcaseone () {
		
		System.out.println("this is test case one");
	}
	@BeforeMethod
	public void Beforemethod() {
		System.out.println("this is before method test ");
	}
	@AfterMethod
	public void Aftermethod() {
		System.out.println("this is after method test ");
	}
	@BeforeClass
	public void Beforeclass() {
		System.out.println("this is before class test ");
}
	@AfterClass
	public void Afterclass() {
		System.out.println("this is After class test ");
}
	@BeforeTest
	public void Beforetest() {
		System.out.println("this is Before Test test ");
}
	@AfterTest
	public void Aftertest() {
		System.out.println("this is After Test test ");
}
	@BeforeSuite
	public void Beforesuite() {
		System.out.println("this is Before suite test ");
}
	@AfterSuite
	public void Aftersuite() {
		System.out.println("this is After Suite test ");
}
}
