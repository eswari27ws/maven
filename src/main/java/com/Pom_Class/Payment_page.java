package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Pay by check.']")
	private WebElement paybycheck;

	public Payment_page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPaybycheck() {
		return paybycheck;
	}
	
	
	
	
	
}
