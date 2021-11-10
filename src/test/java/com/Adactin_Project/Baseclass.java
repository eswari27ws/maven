package com.Adactin_Project;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Adactin_Baseclass.Project_Baseclass;

public class Baseclass extends Project_Baseclass {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		driver = getBrowser("chrome");
		geturl("http://adactinhotelapp.com/");

		WebElement username = driver.findElement(By.id("username"));
		sendkey(username, "IswariyaR");

		WebElement password = driver.findElement(By.id("password"));
		sendkey(password, "Ishuajay");

		WebElement login = driver.findElement(By.id("login"));
		click(login);

		WebElement Location = driver.findElement(By.xpath("//select[@name='location']"));
		Dropdown(Location, "index", "5");

		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Dropdown(hotel, "value", "Hotel Sunshine");

		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		Dropdown(roomtype, "value", "Double");

		WebElement roomnum = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Dropdown(roomnum, "value", "2");

		WebElement indate = driver.findElement(By.id("datepick_in"));
		clear(indate);
		sendkey(indate, "22/10/2021");

		WebElement outdate = driver.findElement(By.id("datepick_out"));
		clear(outdate);
		sendkey(outdate, "24/10/2021");

		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Dropdown(adult, "index", "2");

		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		Dropdown(child, "index", "2");

		WebElement submit = driver.findElement(By.id("Submit"));
		click(submit);

		WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		System.out.println("button click or not : " + radio.isSelected());
		click(radio);

		WebElement submit2 = driver.findElement(By.xpath("//input[@type='submit']"));
		click(submit2);

		WebElement firstname = driver.findElement(By.id("first_name"));
		sendkey(firstname, "Iswariya");

		WebElement lastname = driver.findElement(By.id("last_name"));
		sendkey(lastname, "Rs");

		WebElement address = driver.findElement(By.id("address"));
		sendkey(address, "No.10, Bharathidasan st, Thrivallur");

		WebElement accnum = driver.findElement(By.id("cc_num"));
		sendkey(accnum, "1234567890987654");

		WebElement credit = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Dropdown(credit, "index", "2");

		WebElement Expiry1 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Dropdown(Expiry1, "index", "2");

		WebElement Expiry2 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Dropdown(Expiry2, "value", "2022");

		WebElement csv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		sendkey(csv, "098");
		robot(KeyEvent.VK_TAB);
		robot(KeyEvent.VK_ENTER);

		sleep(5000);

		WebElement Itinerary = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		click(Itinerary);

		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

		click(checkbox);
		WebElement cancel = driver.findElement(By.xpath("//input[@name='cancelall']"));
		click(cancel);
		alert();

		sleep(3000);

		screenshot("C:\\Users\\DELL\\eclipse-workspace\\Maven\\Screenshot\\img.png");

		sleep(3000);

		WebElement logout = driver.findElement(By.id("logout"));
		click(logout);
	}

}
