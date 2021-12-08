package com.pom.mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@id='HOOK_PAYMENT']/div[2]/div/p/a")
	private WebElement pay;

	public WebElement getPay() {
		return pay;
	}
public Payment(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);

}
}
