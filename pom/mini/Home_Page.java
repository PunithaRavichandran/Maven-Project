package com.pom.mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.implementation.bind.annotation.FieldProxy;

public class Home_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}

	public Home_Page(WebDriver driver2) {
		
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

}
