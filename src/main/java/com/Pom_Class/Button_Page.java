package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Button_Page {
	public WebDriver driver;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement Button;

	public Button_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getButton() {
		return Button;
	}

}
