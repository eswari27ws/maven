package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_page {

	public WebDriver driver;

	@FindBy(id="cgv")
	private WebElement agree;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit1;

	public Shipping_page(WebDriver driver2) {
	this.driver = 	driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getSubmit1() {
		return submit1;
	}
	
	
}
