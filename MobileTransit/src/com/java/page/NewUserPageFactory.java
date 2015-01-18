package com.java.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.java.commonmethods.Common;

public class NewUserPageFactory extends Common {

	@FindBy(how = How.CLASS_NAME, using = "MenuBarItemSubmenu")
	private WebElement PrefrencesTab;

	@FindBy(how = How.CLASS_NAME, using = "MenuBarItemHover")
	private WebElement newUserTab;

	@FindBy(how = How.NAME, using = "UserType")
	// Value = U
	private WebElement userType;

	@FindBy(how = How.NAME, using = "Name")
	private WebElement Name;

	@FindBy(how = How.ID, using = "UserName")
	private WebElement userName;

	@FindBy(how = How.NAME, using = "PassWord1")
	private WebElement passWord;

	@FindBy(how = How.NAME, using = "PassWord2")
	private WebElement Retype;

	@FindBy(how = How.NAME, using = "Save")
	private WebElement Save;

	public void hoverOver() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath(".//*[@id='MenuBar1']/li[4]/a"))).build().perform();
		builder.moveToElement(driver.findElement(By.xpath(".//*[@id='MenuBar1']/li[4]/ul/li[1]/a"))).click().build().perform();
		System.out.println("mouseOver Action");
		
	}
	
	public void selectType(){
		Select type = new Select(userType);
		type.deselectByValue("U");
		System.out.println("UserType Selected");
		
	}
	
	public void EnterInfo(){
		Name.sendKeys("Babak Khan");
		userName.sendKeys("Khooboo");
		passWord.sendKeys("Babuchin");
		Retype.sendKeys("Babuchin");
		Save.click();
		System.out.println("Registered");
	}
	
	
	

	}


