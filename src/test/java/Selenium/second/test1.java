package Selenium.second;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {

	@BeforeMethod
	public void Beforemethod(){
		System.out.println("Before method");
	}
	@BeforeMethod
	public void BeforeMethod1() {
		System.out.println("before method 1");
	}
	@Test
	public void test3() {
		System.out.println("test3");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After method");
	}
	@AfterMethod
	public void AfterMethod1() {
		System.out.println("After method1");
	}
	@Test
	public void Test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
}
