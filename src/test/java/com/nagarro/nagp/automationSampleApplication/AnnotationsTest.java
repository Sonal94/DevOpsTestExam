package com.nagarro.nagp.automationSampleApplication;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {
	
	@Test
	public void TestCase1() {
		System.out.println("This is normal test case");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is executed before every method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is executed after every method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is executed before every class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is executed after every class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is executed before every test case");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is executed after every test case");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is executed before every suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is executed after every suite");
	}

}
