package com.java.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import com.java.commonmethods.Common;
import com.java.page.LoginPageFactory;
import com.java.page.NewUserPageFactory;

public class PageFactoryTest extends Common {

	public LoginPageFactory CM;
	public NewUserPageFactory CM2;

	@BeforeMethod
	public void Setup() {
		openBrowser();
		openUrl();

	}

	@Test 
	public void Login() {
		CM = PageFactory.initElements(driver, LoginPageFactory.class);
		CM.SelectDD();
		CM.Signin();
		CM.logOff();
 System.out.println("Logged in Successfully");
	}

	//
//	@Test (priority = 1)
//	public void RegisterUser() {
//		CM = PageFactory.initElements(driver, LoginPageFactory.class);
//		CM.SelectDD();
//		CM.Signin();
//
//		CM2 = PageFactory.initElements(driver, NewUserPageFactory.class);
//
//		CM2.hoverOver();
//		CM2.selectType();
//		CM2.EnterInfo();
//		
//		System.out.println("Registered!!!");
//
//	}

	@AfterMethod
	public void TearDown() {
		closeBrowser();
	}
}
