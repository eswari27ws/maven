package com.Adactin_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel_class {

	public WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement Location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotel;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomnum;

	@FindBy(id = "datepick_in")
	private WebElement indate;

	@FindBy(id = "datepick_out")
	private WebElement outdate;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child;

	@FindBy(id = "Submit")
	private WebElement submit;

	public Searchhotel_class(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnum() {
		return roomnum;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
