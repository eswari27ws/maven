package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Page {

	public WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement  create;

	public Order_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreate() {
		return create;
	}

	}
	

