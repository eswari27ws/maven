package com.Maven;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baseclass extends Project_Baseclass {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		driver = getBrowser("chrome");

		geturl("http://automationpractice.com/index.php");

		
		sleep(2000);

		WebElement buy = driver.findElement(By.xpath("//a[@title='Women']"));
		action(buy, "contextclick");
		robot(KeyEvent.VK_DOWN);
		robot(KeyEvent.VK_ENTER);

		sleep(2000);

		switchtowindow();

		sleep(3000);

		WebElement black = driver.findElement(
				By.xpath("(//a[@href='http://automationpractice.com/index.php?id_product=2&controller=product'])[1]"));
		action(black, "contextClick");
		robot(KeyEvent.VK_DOWN);
		robot(KeyEvent.VK_ENTER);

		sleep(3000);
		javascript(0, 100);

		sleep(3000);
		screenshot("C:\\Users\\DELL\\eclipse-workspace\\Maven\\Screenshot\\ing.png");

		sleep(3000);
		switchtowindow();

		WebElement cart = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		action(cart, "click");

		sleep(3000);

		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		click(proceed);
		WebElement process = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		click(process);

		WebElement create = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		sendkey(create, "ishuws5069756@gmail.com");
		action(create, "click");
		robot(KeyEvent.VK_TAB);
		robot(KeyEvent.VK_ENTER);

		sleep(5000);

		WebElement Information = driver.findElement(By.id("id_gender2"));
		click(Information);
		System.out.println(Information.isSelected());

		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		sendkey(firstname, "ishu");

		WebElement lastname3 = driver.findElement(By.id("customer_lastname"));
		sendkey(lastname3, "ajay");

		WebElement passwd = driver.findElement(By.id("passwd"));
		sendkey(passwd, "12345688");

		WebElement day = driver.findElement(By.id("days"));
		Dropdown(day, "value", "27");

		WebElement month = driver.findElement(By.id("months"));
		Dropdown(month, "index", "2");

		WebElement year = driver.findElement(By.id("years"));
		Dropdown(year, "value", "1998");

		WebElement compny = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		sendkey(compny, "Greens");

		WebElement addr = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		sendkey(addr, "No.10, bharathidasan st, ma po c nagar");

		WebElement city = driver.findElement(By.id("city"));
		sendkey(city, "thiruvallur");

		WebElement state = driver.findElement(By.id("id_state"));
		Dropdown(state, "value", "14");

		WebElement code = driver.findElement(By.id("postcode"));
		sendkey(code, "00000");

		WebElement country = driver.findElement(By.id("id_country"));
		Dropdown(country, "index", "1");

		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		sendkey(mobile, "9876543221");

		WebElement add1 = driver.findElement(By.id("alias"));
		click(add1);
		sendkey(add1, "bharathidasan st");
		robot(KeyEvent.VK_TAB);
		sleep(2000);
		robot(KeyEvent.VK_ENTER);

		WebElement Button = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(Button);

		sleep(3000);
		WebElement agree = driver.findElement(By.id("cgv"));
		click(agree);

		WebElement submit1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(submit1);

		WebElement paybycheck = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		click(paybycheck);

		WebElement submit2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(submit2);

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
