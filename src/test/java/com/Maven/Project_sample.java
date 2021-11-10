package com.Maven;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class Project_sample extends Project_Baseclass {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		driver = getBrowser("chrome");

		geturl("http://automationpractice.com/index.php");

		sleep(2000);
		// WebElement buy = driver.findElement(By.xpath("//a[@title='Women']"));
		Home_page hp = new Home_page(driver);
		action(hp.getBuy(), "contextclick");

		robot(KeyEvent.VK_DOWN);
		robot(KeyEvent.VK_ENTER);

		sleep(2000);
		switchtowindow();
		sleep(3000);

		Women_Page wp = new Women_Page(driver);
		/*
		 * WebElement black = driver.findElement( By.xpath(
		 * "(//a[@href='http://automationpractice.com/index.php?id_product=2&controller=product'])[1]"
		 * ));
		 */
		action(wp.getBlack(), "contextClick");
		robot(KeyEvent.VK_DOWN);
		robot(KeyEvent.VK_ENTER);

		sleep(3000);
		javascript(0, 100);
		sleep(3000);

		screenshot("C:\\Users\\DELL\\eclipse-workspace\\Maven\\Screenshot\\ing.png");

		sleep(3000);
		switchtowindow();

		// WebElement cart =
		// driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		Blackdress_Page black = new Blackdress_Page(driver);
		action(black.getCart(), "click");
		sleep(3000);

		// WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to
		// checkout']"));
		click(black.getProceed());

		// WebElement process = driver.findElement(By.xpath("(//a[@title='Proceed to
		// checkout'])[2]"));
		Proceed_Page pp = new Proceed_Page(driver);
		click(pp.getProcess());

		// WebElement create =
		// driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Order_Page op = new Order_Page(driver);

		sendkey(op.getCreate(), "ishuws5067756@gmail.com");
		robot(KeyEvent.VK_TAB);
		robot(KeyEvent.VK_ENTER);
		sleep(5000);

//		WebElement Information = driver.findElement(By.id("id_gender2"));
		Login_Page lp = new Login_Page(driver);
		click(lp.getInformation());
		System.out.println(lp.getInformation().isSelected());

//		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		sendkey(lp.getFirstname(), "ishu");

		// WebElement lastname = driver.findElement(By.id("customer_lastname"));
		sendkey(lp.getLastname(), "ajay");

		// WebElement passwd = driver.findElement(By.id("passwd"));
		sendkey(lp.getPasswd(), "12345688");

		// WebElement day = driver.findElement(By.id("days"));
		Dropdown(lp.getDay(), "value", "27");

		// WebElement month = driver.findElement(By.id("months"));
		Dropdown(lp.getMonth(), "index", "2");

		// WebElement year = driver.findElement(By.id("years"));
		Dropdown(lp.getYear(), "value", "1998");

		// WebElement compny =
		// driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		sendkey(lp.getCompny(), "Greens");

		// WebElement addr = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		sendkey(lp.getAddr(), "No.10, bharathidasan st, ma po c nagar");

		// WebElement city = driver.findElement(By.id("city"));
		sendkey(lp.getCity(), "thiruvallur");

		// WebElement state = driver.findElement(By.id("id_state"));
		Dropdown(lp.getState(), "value", "14");

		// WebElement code = driver.findElement(By.id("postcode"));
		sendkey(lp.getCode(), "00000");

		// WebElement country = driver.findElement(By.id("id_country"));
		Dropdown(lp.getCountry(), "index", "1");

		// WebElement mobile = driver.findElement(By.id("phone_mobile"));
		sendkey(lp.getMobile(), "9876543221");

		// WebElement add1 = driver.findElement(By.id("alias"));
		sendkey(lp.getAdd1(), "bharathidasan st");
		robot(KeyEvent.VK_TAB);
		sleep(2000);
		robot(KeyEvent.VK_ENTER);

		// address
		// WebElement Button =
		// driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Button_Page bp = new Button_Page(driver);
		click(bp.getButton());

		sleep(3000);

		Shipping_page shp = new Shipping_page(driver);

		// WebElement agree = driver.findElement(By.id("cgv"));
		click(shp.getAgree());

		// WebElement submit1 =
		// driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(shp.getSubmit1());

		// WebElement paybycheck = driver.findElement(By.xpath("xpath"));
		Payment_page paypage = new Payment_page(driver);
		click(paypage.getPaybycheck());

		// WebElement submit2 =
		// driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		Ordersummary_page order = new Ordersummary_page(driver);
		click(order.getSubmit2());

		sleep(3000);

		javascript(0, 100);

		screenshot("C:\\Users\\DELL\\eclipse-workspace\\Maven\\Screenshot\\pic2.png");

		sleep(3000);

		window("size");

		window("parentid");

		window("titles");

		sleep(3000);

		quit();
	}

}
