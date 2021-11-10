package com.Maven;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		driver = getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebElement buy = driver.findElement(By.xpath("//a[@title='Women']"));
		action(buy);
		sleep(3000);
		robot();
		sleep(3000);
		javascript();
		sleep(3000);
		screenshot("file1");
		sleep(3000);
		Set<String> list = driver.getWindowHandles();
		for (String si : list) {
			driver.switchTo().window(si);
		}
		sleep(3000);
		WebElement black = driver.findElement(
				By.xpath("(//a[@href='http://automationpractice.com/index.php?id_product=2&controller=product'])[1]"));
		action(black);
		robot();
		sleep(3000);
		for (String by : list) {
			driver.switchTo().window(by);
		}
		WebElement cart = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		action2(cart);
		sleep(3000);
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		sleep(5000);
		click(proceed);
		WebElement process = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		process.click();
		WebElement create = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		action3(create, "ishuws900876@gmail.com");
		robot2();
		sleep(3000);
		WebElement Information = driver.findElement(By.id("id_gender2"));
		click(Information);
		System.out.println(Information.isSelected());
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		sendkey(firstname, "ishu");
		WebElement lname = driver.findElement(By.id("customer_lastname"));
		sendkey(lname, "ajay");
		WebElement pass = driver.findElement(By.id("passwd"));
		sendkey(pass, "12345678");
		WebElement day = driver.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByValue("27");
		WebElement month = driver.findElement(By.id("months"));
		Select m = new Select(month);
		m.selectByIndex(2);
		WebElement year = driver.findElement(By.id("years"));
		Select y = new Select(year);
		y.selectByValue("1998");
		WebElement compny = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		sendkey(compny, "Greens");
		WebElement addr = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		sendkey(addr, "No.10, bharathidasan st, ma po c nagar");
		WebElement city = driver.findElement(By.id("city"));
		sendkey(city, "thiruvallur");
		WebElement state = driver.findElement(By.id("id_state"));
		Select t = new Select(state);
		t.selectByValue("14");
		WebElement code = driver.findElement(By.id("postcode"));
		sendkey(code, "00000");
		WebElement country = driver.findElement(By.id("id_country"));
		Select c = new Select(country);
		c.selectByIndex(1);
		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		sendkey(mobile, "9876543221");
		WebElement add1 = driver.findElement(By.id("alias"));
		sendkey(add1, "bharathidasan st");
		robot2();
		WebElement Button = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(Button);
		sleep(3000);
		WebElement agree = driver.findElement(By.id("cgv"));
		click(agree);
		WebElement sub = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(sub);
		WebElement check = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		click(check);
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(submit);
		sleep(3000);
		JavascriptExecutor k = (JavascriptExecutor) driver;
		k.executeScript("window.scroll(0,100)", "");
		screenshot("file2");
		sleep(3000);
		int size = driver.getWindowHandles().size();
		System.out.println("size : " + size);
		String parentid = driver.getWindowHandle();
		System.out.println("parentid : " + parentid);
		Set<String> Title = driver.getWindowHandles();
		for (String ti : Title) {
			String title2 = driver.switchTo().window(ti).getTitle();
			System.out.println("Title : " + title2);
		}
		String spchild = "Order confirmation - My Store";
		for (String sp : Title) {
			if (driver.switchTo().window(sp).getTitle().equalsIgnoreCase(spchild));
			break;
		}
	
		sleep(3000);
	}

	
}