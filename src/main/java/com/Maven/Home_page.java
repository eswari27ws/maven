package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public WebDriver driver;

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement buy;

	public Home_page(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBuy() {
		return buy;
	}

}
