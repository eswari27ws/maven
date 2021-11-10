package com.Maven;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class POMclass extends Project_Baseclass {
	public static WebDriver driver = Project_Baseclass.getBrowser("chrome");
    public static Home_page hp = new Home_page(driver);
	public static Women_Page wp = new Women_Page(driver);
    public static Blackdress_Page black = new Blackdress_Page(driver);
    public static Proceed_Page pp = new Proceed_Page(driver);
    public static Order_Page op = new Order_Page(driver);
    public static Login_Page lp = new Login_Page(driver);
	public static Button_Page bp = new Button_Page(driver);
    public static Shipping_page shp = new Shipping_page(driver);
	public static Payment_page paypage = new Payment_page(driver);
   public static Ordersummary_page order = new Ordersummary_page(driver);

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		geturl("http://automationpractice.com/index.php");
		action(hp.getBuy(), "contextclick");
		robot(KeyEvent.VK_DOWN);
		robot(KeyEvent.VK_ENTER);

		sleep(2000);
		switchtowindow();
		sleep(3000);
		action(wp.getBlack(), "contextClick");
		robot(KeyEvent.VK_DOWN);
		robot(KeyEvent.VK_ENTER);

		sleep(3000);
		switchtowindow();
		action(black.getCart(), "click");
		sleep(3000);

		click(black.getProceed());
		click(pp.getProcess());
		sendkey(op.getCreate(), "ishuws5896@gmail.com");
		robot(KeyEvent.VK_TAB);
		robot(KeyEvent.VK_ENTER);
		sleep(5000);
		click(lp.getInformation());
		System.out.println(lp.getInformation().isSelected());

		sendkey(lp.getFirstname(), "ishu");

		sendkey(lp.getLastname(), "ajay");

		sendkey(lp.getPasswd(), "12345688");

		Dropdown(lp.getDay(), "value", "27");

		Dropdown(lp.getMonth(), "index", "2");

		Dropdown(lp.getYear(), "value", "1998");

		sendkey(lp.getCompny(), "Greens");

		sendkey(lp.getAddr(), "No.10, bharathidasan st, ma po c nagar");
			
		sendkey(lp.getCity(), "thiruvallur");

		Dropdown(lp.getState(), "value", "14");

		sendkey(lp.getCode(), "00000");

		Dropdown(lp.getCountry(), "index", "1");

		sendkey(lp.getMobile(), "9876543221");

		sendkey(lp.getAdd1(), "bharathidasan st");

		robot(KeyEvent.VK_TAB);
		robot(KeyEvent.VK_ENTER);
		click(bp.getButton());

		sleep(3000);
		click(shp.getAgree());

		click(shp.getSubmit1());
		click(paypage.getPaybycheck());
		click(order.getSubmit2());

		sleep(3000);

		screenshot("C:\\Users\\DELL\\eclipse-workspace\\Maven\\Screenshot\\pic2.png");

		window("size");

		window("parentid");

		window("titles");

		quit();
	}

}
