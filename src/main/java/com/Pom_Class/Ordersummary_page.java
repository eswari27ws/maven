package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ordersummary_page {

	public WebDriver driver;

	public Ordersummary_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getSubmit2() {
		return submit2;
	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")

	private WebElement submit2;

}
