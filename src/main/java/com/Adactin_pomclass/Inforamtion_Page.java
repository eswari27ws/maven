package com.Adactin_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inforamtion_Page {
public WebDriver driver;
	
	@FindBy (id="first_name")
	private WebElement firstname;
	
	@FindBy (id="last_name")
	private WebElement lastname;
	
	@FindBy (id="address")
	private WebElement address;
	
	@FindBy (id="cc_num")
	private WebElement accnum;
	
	@FindBy (xpath="//select[@name='cc_type']")
	private WebElement credit;
	
	@FindBy (xpath="//select[@name='cc_exp_month']")
	private WebElement Expiry1;
	
	@FindBy (xpath ="//select[@name='cc_exp_year']")
	private WebElement Expiry2;
	
	@FindBy (xpath="(//input[@type='text'])[14]")
	private WebElement csv;

	public Inforamtion_Page(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getAccnum() {
		return accnum;
	}

	public WebElement getCredit() {
		return credit;
	}

	public WebElement getExpiry1() {
		return Expiry1;
	}

	public WebElement getExpiry2() {
		return Expiry2;
	}

	public WebElement getCsv() {
		return csv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
