package com.pom.mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@id='center_column']/p[2]/a/span")
	private WebElement summary;

	public WebElement getSummary() {
		return summary;
	}
	@FindBy(id = "cgv")
	private WebElement shipping;
	
	@FindBy(xpath = "//form[@id='form']/p/button/span")
	private WebElement agree;
	
	
    public WebElement getAgree() {
		return agree;
	}


	public WebElement getShipping() {
		return shipping;
	}


	public Summary(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
}
}
