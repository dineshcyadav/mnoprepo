package Selenium.second;


import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
	      WebDriver driver =new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       driver.get("https://www.google.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       driver.get("https://flipkart.com/");
	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	       driver.findElement(By.xpath("//img[@loading='lazy']")).click();
	       driver.findElement(By.xpath("//input[@class='_166SQN']")).sendKeys("560072");
	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _1IsWyb _3dESVI']")).click();
	       
	       
	       
	     /*driver.findElement(By.className("login-btn")).click();
	     driver.findElement(By.className("btn-primary")).click();
	       
	      driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("dinesh124");
	      driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("dineshyadav21434@gmail.com");
	      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dini@1245");
	      driver.findElement(By.xpath("//input[@name='commit']")).click();*/
}
}
