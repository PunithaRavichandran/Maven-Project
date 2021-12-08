package com.pom.mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@id='center_column']/form/p/button/span")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	public Address(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
