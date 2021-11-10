package com.Base_Class;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();

		return driver;
	}
	public static void minimize(int width, int height) {
	Dimension d = new Dimension(width, height);
			driver.manage().window().setSize(d);
	
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void sendkey(WebElement element, String value) {

		element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void sleep(int value) throws InterruptedException {
		Thread.sleep(value);
	}
	public static void javascript() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scroll(0,800)", "");
	}
	public static void action(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}
	public static void action2(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();
	}
	public static void action3(WebElement element, String enter) {
		Actions a = new Actions(driver);
		a.click(element).sendKeys(enter).build().perform();
	}
	public static void robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void robot2() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void screenshot(String values) throws IOException {
		TakesScreenshot ks = (TakesScreenshot) driver;
		File sour = ks.getScreenshotAs(OutputType.FILE);
		File Desti = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Screenshot\\"+values+".png");
		FileUtils.copyFile(sour, Desti);
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
}
