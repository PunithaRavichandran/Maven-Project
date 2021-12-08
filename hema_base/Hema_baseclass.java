package com.hema_base;

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

public class Hema_baseclass {
	
	 public static WebDriver driver;
	 
	 public static WebDriver browserlaunch(String browser) {
		 if (browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				 driver = new ChromeDriver();
		} 
		 else if (browser.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
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
	 public static void input(WebElement element,String value ) {
        element.sendKeys(value);
	 }
	 public static void implicitwait(int time) {
		 driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	 }
	 public static void frame(WebElement element) {
			driver.switchTo().frame(element);

	 }
	 public static void javascriptExecutor(WebElement element) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView()", element);
	 }
	 public static void explicitwait(int value, String type, Object element, String path) {
		 WebDriverWait wait = new WebDriverWait(driver,value);
		 if(type.equalsIgnoreCase("visibility")) {
		 wait.until(ExpectedConditions.visibilityOf((WebElement) element));
		 }
		 else if(type.equalsIgnoreCase("visiblityoflocated")) {
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
		 }
	 }
	 
	 
	 public static void action(String type, WebElement element) {
		 Actions ac = new Actions(driver);
		 
		 if(type.equalsIgnoreCase("moveto")) {
			 ac.moveToElement(element).build().perform();
			 }
		 else if(type.equalsIgnoreCase("click")) {
			 ac.moveToElement(element).build().perform(); 
			 ac.click(element).build().perform();
		 }
		 else if(type.equalsIgnoreCase("rightclick")) {
			 ac.moveToElement(element).build().perform();
			 ac.contextClick(element).build().perform();
			 
		 }
		 else if(type.equalsIgnoreCase("double click")) {
			 ac.moveToElement(element).build().perform();
			 ac.doubleClick(element).build().perform();
			 
		 } }
	 public static void screenshot(String path) throws IOException {
		 TakesScreenshot ts = (TakesScreenshot) driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    File destination = new File(path);
		    FileUtils.copyFile(source, destination);
	 }
}


