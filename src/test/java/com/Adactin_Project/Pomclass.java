package com.Adactin_Project;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.Adactin_Baseclass.Project_Baseclass;
import com.Adactin_pomclass.Inforamtion_Page;
import com.Adactin_pomclass.Itinerary_page;
import com.Adactin_pomclass.Login_page;
import com.Adactin_pomclass.Logout_page;
import com.Adactin_pomclass.Radiobutton_page;
import com.Adactin_pomclass.Searchhotel_class;

public class Pomclass extends Project_Baseclass {

	public static WebDriver driver = Project_Baseclass.getBrowser("chrome");
	public static Login_page lp = new Login_page(driver);
	public static Searchhotel_class seach = new Searchhotel_class(driver);
	public static Radiobutton_page rb = new Radiobutton_page(driver);
	public static Inforamtion_Page ip = new Inforamtion_Page(driver);
	public static Itinerary_page Iti = new Itinerary_page(driver);
	public static Logout_page op = new Logout_page(driver);

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		sleep(2000);

		geturl("http://adactinhotelapp.com/");

		// WebElement username = driver.findElement(By.id("username"));
		sendkey(lp.getUsername(), "IswariyaR");

		// WebElement password = driver.findElement(By.id("password"));
		sendkey(lp.getPassword(), "Ishuajay");

		// WebElement login = driver.findElement(By.id("login"));
		click(lp.getLogin());

		// WebElement Location =
		// driver.findElement(By.xpath("//select[@name='location']"));
		Dropdown(seach.getLocation(), "index", "5");

		// WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Dropdown(seach.getHotel(), "value", "Hotel Sunshine");

		// WebElement roomtype =
		// driver.findElement(By.xpath("//select[@name='room_type']"));
		Dropdown(seach.getRoomtype(), "value", "Double");

		// WebElement roomnum =
		// driver.findElement(By.xpath("//select[@name='room_nos']"));
		Dropdown(seach.getRoomnum(), "value", "2");

		// WebElement indate = driver.findElement(By.id("datepick_in"));
		clear(seach.getIndate());
		sendkey(seach.getIndate(), "22/10/2021");

//		WebElement outdate = driver.findElement(By.id("datepick_out"));
		clear(seach.getOutdate());
		sendkey(seach.getOutdate(), "24/10/2021");

		// WebElement adult =
		// driver.findElement(By.xpath("//select[@name='adult_room']"));
		Dropdown(seach.getAdult(), "index", "2");

		// WebElement child =
		// driver.findElement(By.xpath("//select[@name='child_room']"));
		Dropdown(seach.getChild(), "index", "2");

		// WebElement submit = driver.findElement(By.id("Submit"));
		click(seach.getSubmit());

		// WebElement radio =
		// driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		System.out.println("button click or not : " + rb.getRadio().isSelected());
		click(rb.getRadio());

		// WebElement submit2 = driver.findElement(By.xpath("//input[@type='submit']"));
		click(rb.getSubmit2());

		// WebElement firstname = driver.findElement(By.id("first_name"));
		sendkey(ip.getFirstname(), "Iswariya");

		// WebElement lastname = driver.findElement(By.id("last_name"));
		sendkey(ip.getLastname(), "Rs");

		// WebElement address = driver.findElement(By.id("address"));
		sendkey(ip.getAddress(), "No.10, Bharathidasan st, Thrivallur");

		// WebElement accnum = driver.findElement(By.id("cc_num"));
		sendkey(ip.getAccnum(), "1234567890987654");

		// WebElement credit =
		// driver.findElement(By.xpath("//select[@name='cc_type']"));
		Dropdown(ip.getCredit(), "index", "2");

		// WebElement Expiry1 =
		// driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Dropdown(ip.getExpiry1(), "index", "2");

		// WebElement Expiry2 =
		// driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Dropdown(ip.getExpiry2(), "value", "2022");

		// WebElement csv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		sendkey(ip.getCsv(), "098");
		robot(KeyEvent.VK_TAB);
		robot(KeyEvent.VK_ENTER);

		sleep(5000);

		// WebElement Itinerary =
		// driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		click(Iti.getItinerary());

		// WebElement checkbox =
		// driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		click(Iti.getCheckbox());

		// WebElement cancel =
		// driver.findElement(By.xpath("//input[@name='cancelall']"));
		click(Iti.getCancel());
		alert();

		sleep(3000);

		screenshot("C:\\Users\\DELL\\eclipse-workspace\\Maven\\Screenshot\\img.png");

		sleep(3000);
		// WebElement logout = driver.findElement(By.id("logout"));
		click(op.getLogout());
		quit();
	}

}
