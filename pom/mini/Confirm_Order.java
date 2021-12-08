package com.pom.mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Order {

	public WebDriver driver;
	
	@FindBy(xpath = "//div[@id='center_column']/ul/li[4]/a")
	private WebElement confirm;

	public WebElement getConfirm() {
		return confirm;
	}
public Confirm_Order(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);

}
}
