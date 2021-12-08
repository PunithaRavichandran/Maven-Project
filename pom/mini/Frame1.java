package com.pom.mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame1 {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//iframe[@vspace='0']")
	private WebElement frame;
	
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement addcart;
	
	@FindBy(xpath = "//div[@id='layer_cart']/div/div[2]/div[4]/a/span")
	private WebElement Proceed;

	public WebElement getProceed() {
		return Proceed;
	}
	public WebElement getAddcart() {
		return addcart;
	}
	public WebElement getFrame() {
		return frame;
	}
	public Frame1(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	

}
