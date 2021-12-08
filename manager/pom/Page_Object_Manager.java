package com.manager.pom;
import org.openqa.selenium.WebDriver;

import com.pom.mini.Address;
import com.pom.mini.Choose_Option;
import com.pom.mini.Choose_Tshirt;
import com.pom.mini.Confirm_Order;
import com.pom.mini.Frame1;
import com.pom.mini.Home_Page;
import com.pom.mini.Login_Page;
import com.pom.mini.Pay_Mode;
import com.pom.mini.Payment;
import com.pom.mini.Summary;

public class Page_Object_Manager {
	public WebDriver driver;
	private Home_Page hp ; 
	private Login_Page lp ;
	private Choose_Option shirt;
	private Choose_Tshirt gshirt;
	private Frame1 f ;
	private Summary s;
	private Address a;
	private Payment p;
	private Pay_Mode pm;
	private Confirm_Order corder;
	
    public Home_Page getInstanceHp() {
		
    	if(hp == null) {
			hp = new Home_Page(driver);
		}
		return hp;
		}
	public Login_Page getInstanceLp() {
		
		if(lp== null) {
			lp = new Login_Page(driver);
		}
		return lp;
	}
	public Choose_Option getInstanceShirt() {
		
		if(shirt == null) {
			shirt = new Choose_Option(driver);
		}
		return shirt;
	}
	public Choose_Tshirt getInstanceGshirt() {
		
		if(gshirt == null) {
			gshirt = new Choose_Tshirt(driver);
		}
		return gshirt;
	}
	public Frame1 getInstanceF() {
		
		if(f == null) {
			f= new Frame1(driver);
		}
		return f;
	}
	public Summary getInstanceS() {
		
		if( s == null) {
			s = new Summary(driver);
		}
		return s;
	}
	public Address getInstanceA() {
		
		if( a == null) {
			a= new Address(driver);
		}
		return a;
	}
	public Payment getInstanceP() {
		
		if( p == null) {
			p = new Payment(driver);
		}
		return p;
	}
	public Pay_Mode getInstancePm() {
		
		if( pm == null) {
			pm = new Pay_Mode(driver);
		}
		return pm;
		}
	
	public Confirm_Order getInstanceCorder() {
		
		if( corder == null) {
			corder = new Confirm_Order(driver);
		}
		return corder;
	}
	public Page_Object_Manager(WebDriver driver2) {

    this.driver = driver2;
}
}