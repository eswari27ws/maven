package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Page {

	public WebDriver driver;
	
	@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?id_product=2&controller=product'])[1]")
	private WebElement black;

	public Women_Page(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
	}

	public WebElement getBlack() {
		return black;
	}
	
	
	
}
