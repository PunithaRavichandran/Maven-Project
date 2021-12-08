package com.pom.mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Choose_Option {
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='T-shirts'])[2]")
	private WebElement tshirt;

	public WebElement getTshirt() {
		return tshirt;
	}
	public Choose_Option( WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
