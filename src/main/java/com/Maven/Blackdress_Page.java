package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blackdress_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement cart;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed;

	public Blackdress_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getProceed() {
		return proceed;
	}

}
