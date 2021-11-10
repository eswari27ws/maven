package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;
	
	@FindBy (id = "id_gender2")
	private WebElement Information;
	
	@FindBy (id = "customer_firstname")
	private WebElement firstname;
	
	@FindBy (id = "customer_lastname")
	private WebElement lastname;
	
	@FindBy (id = "passwd")
	private WebElement passwd;

	@FindBy (id = "days")
	private WebElement day;
	
	@FindBy (id = "months")
	private WebElement month;
	
	@FindBy (id = "years")
	private WebElement year;
	
	@FindBy (xpath = "(//input[@type='text'])[7]")
	private WebElement compny;
	
	@FindBy (xpath = "(//input[@type='text'])[8]")
	private WebElement addr;
	
	@FindBy (id = "city")
	private WebElement city;
	
	@FindBy (id = "id_state")
	private WebElement state;
	
	@FindBy (id = "postcode")
	private WebElement code;
	
	@FindBy (id = "id_country")
	private WebElement country;
	
	@FindBy (id = "phone_mobile")
	private WebElement mobile;
	
	@FindBy (id = "alias")
	private WebElement add1;

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getInformation() {
		return Information;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCompny() {
		return compny;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCode() {
		return code;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getAdd1() {
		return add1;
	}
	
}
