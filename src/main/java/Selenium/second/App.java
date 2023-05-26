package Selenium.second;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
	
	public void setUP(){
		startSeleniumSession();
		}
    private void startSeleniumSession() {
		// TODO Auto-generated method stub
		
	}
	public static void main( String[] args ) throws IOException
    {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32 11\\chromedriver.exe");
    	
    	ChromeOptions opt=new ChromeOptions();
    	
    	opt.addArguments("--remote-allow-origins=*");
    	
    	System.out.println("updated the code by karan");
    	System.out.println("committed by karan for 2nd time");
    	
    WebDriver driver=new ChromeDriver(opt);
    
    driver.get("https://www.google.com/");
    
    driver.get("https://www.amazon.com/");
         File  screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshot,new File(".//screenshot/screen.png"));
    driver.quit();
	
     
	}
}
