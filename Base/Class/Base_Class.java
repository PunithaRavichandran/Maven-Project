package com.Base.Class;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		return driver;
	}
    
	public static void url(String url) {
		driver.get(url);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void input(WebElement element, String input) {
		element.sendKeys(input);
	}
	
	public static void jsexecutor(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		
	}
	public static void sleep(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}
	
	public static void implicit(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	
	public static void action(String action, WebElement element) {
		Actions ac = new Actions(driver);
		
		if(action.equalsIgnoreCase("moveto")) {
		ac.moveToElement(element).build().perform();
		}
		
		else if(action.equalsIgnoreCase("click")) {
			ac.moveToElement(element).build().perform();
			ac.click(element).build().perform();
		}
		else if(action.equalsIgnoreCase("rightclick")) {
			ac.moveToElement(element).build().perform();
			ac.contextClick(element).build().perform();
		}
		else if(action.equalsIgnoreCase("doubleclick")) {
			ac.moveToElement(element).build().perform();
			ac.doubleClick(element).build().perform();
		}
		}
	public static void explicit(int time,Object element, String type,String path) {
		WebDriverWait wait = new WebDriverWait(driver, time); 
		
		if(type.equalsIgnoreCase("visiblity")) {
			wait.until(ExpectedConditions.visibilityOf((WebElement) element));
		}
		else if(type.equalsIgnoreCase("elementlocated")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
		}
	}
		
    public static void screenshot( String path) throws IOException {
    	TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination = new File(path);
	    FileUtils.copyFile(source, destination);
		
	}
}
	
	

	
	
	
	
	
