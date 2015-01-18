package com.java.commonmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	
	String Url = "http://www.crossoverlearning.com/Apps/MobileTransact/Login.php";
	
	public static WebDriver driver;
	
	public void openBrowser(){
		
		driver = new FirefoxDriver();
	}
	
	
	public void openUrl(){
		
		driver.get(Url);
		
		}
	
	public void closeBrowser(){
		
		driver.quit();
		
		
		
	}
	
	}
	


