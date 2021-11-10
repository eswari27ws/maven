package com.Adactin_pomclass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary_page {

	public WebDriver driver;
	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement Itinerary;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkbox;

	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancel;

	public Itinerary_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getItinerary() {
		return Itinerary;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCancel() {
		return cancel;
	}

	
}
