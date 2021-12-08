package com.hema_po_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;

	public WebElement getLogin() {
		return signin;
	}
	public  HomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}
	

}
