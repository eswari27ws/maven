package com.Adactin_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radiobutton_page {

	public WebDriver driver;
	
	@FindBy (xpath="//input[@name='radiobutton_0']")
	private WebElement radio;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit2;

	public Radiobutton_page(WebDriver driver2) {
	
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getSubmit2() {
		return submit2;
	}


}
