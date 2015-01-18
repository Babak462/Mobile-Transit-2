package com.java.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.java.commonmethods.Common;

public class LoginPageFactory extends Common {

	@FindBy(how = How.NAME, using = "UserType")
	private WebElement USERTYPE;
	// Value =A
	@FindBy(how = How.ID, using = "UserName")
	private WebElement USERNAME;

	@FindBy(how = How.ID, using = "PassWord")
	private WebElement PASSWORD;

	@FindBy(how = How.NAME, using = "Login")
	private WebElement SIGNIN;

	@FindBy(how = How.XPATH, using = "html/body/table/tbody/tr[1]/td/h1")
	private WebElement Title;
	@FindBy(how = How.XPATH, using = "html/body/table/tbody/tr[2]/td[2]/a")
	private WebElement Logoff;

	public void SelectDD() {
		Select type = new Select(USERTYPE);
		type.selectByValue("A");
	}

	public void Signin() {

		USERNAME.sendKeys("shah");
		PASSWORD.sendKeys("shah123");
		SIGNIN.click();
	}

	public void verifyTitle() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		Assert.assertEquals(Title.getText(),title);
		System.out.println("title verified"); }

	public void logOff() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Logoff.click();

	}

}
