package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement process;

	public Proceed_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProcess() {
		return process;
	}

}
