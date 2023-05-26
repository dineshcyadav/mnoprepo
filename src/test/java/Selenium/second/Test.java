package Selenium.second;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Test {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforetest");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("befoe class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	@org.testng.annotations.Test
	public void  Test1() {
		System.out.println("Test1");
	}
	@org.testng.annotations.Test
	public void Test2() {
		System.out.println("Test2");
	}
	@AfterMethod
	public void AfterMetod() {
		System.out.println("after method");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("afterclass");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("Afetrtest");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("Aftersuite");
	}
	
	
	
	
	

}
