package Selenium.second;

import org.testng.annotations.Test;

public class test2 {

	@Test(priority = -5)
	public void A() {
		System.out.println("test1");
	}
	@Test(priority = -3)
	public void B() {
		System.out.println("Test2");
	}
	@Test(priority = -9)
	public void C() {
		System.out.println("Test3");
	}
	@Test(priority = 5)
	public void D() {
		System.out.println("Test4");
	}
}
