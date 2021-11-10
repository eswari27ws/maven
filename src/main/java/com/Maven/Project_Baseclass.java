package com.Maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project_Baseclass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "");
			driver = new FirefoxDriver();

		}

		return driver;
	}

	public static void manage() {
		driver.manage().window().maximize();
	}

	public static void minimize(int width, int height) {
		try {
			Dimension d = new Dimension(width, height);
			driver.manage().window().setSize(d);
		} catch (Exception e) {
			System.out.println("Exception occurs");

		}
	}

	public static void geturl(String value) {

		try {
			driver.get(value);
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}
	}

	public static void webdriver(String Type) {

		try {
			if (Type.equalsIgnoreCase("gettitle")) {
				String title = driver.getTitle();
				System.out.println("Title : " + title);
			} else if (Type.equalsIgnoreCase("getcurrenturl")) {

				String currentUrl = driver.getCurrentUrl();
				System.out.println("currentUrl : " + currentUrl);
			} else if (Type.equalsIgnoreCase("Pagesource")) {
				String pageSource = driver.getPageSource();
				System.out.println("pageSource : " + pageSource);
			}
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}
	}

	public static void sendkey(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}

	}

	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}
	}

	public static void clear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}
	}

	public static void switchtowindow() {
		try {
			Set<String> page = driver.getWindowHandles();
			for (String newpage : page) {
				driver.switchTo().window(newpage);
			}
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}

	}

	public static void robot(int value) throws AWTException {
		try {
			Robot r = new Robot();
			r.keyPress(value);
			r.keyRelease(value);
		} catch (AWTException e) {
			System.out.println("Exception occurs");
		}
	}

	public static void screenshot(String value) throws IOException {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(value);
			FileUtils.copyFile(source, destination);
		} catch (WebDriverException e) {
			System.out.println("Exception occurs");
		}

	}

	public static void Dropdown(WebElement element, String type, String value) {
		Select s = new Select(element);

		try {
			if (type.equalsIgnoreCase("index")) {
				int data = Integer.parseInt(value);
				s.selectByIndex(data);
			} else if (type.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			} else if (type.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("deselectByIndex")) {
				int parseInt = Integer.parseInt(value);
				s.deselectByIndex(parseInt);
			} else if (type.equalsIgnoreCase("deselectByValue")) {
				s.deselectByValue(value);
			} else if (type.equalsIgnoreCase("deselectByVisibleText")) {
				s.deselectByVisibleText(value);
			}
		} catch (NumberFormatException e) {
			System.out.println("Exception occurs");
		}
	}

	public static void dropdown2(WebElement element, String type) {
		Select s = new Select(element);

		try {
			if (type.equalsIgnoreCase("ismultiple")) {
				boolean multiple = s.isMultiple();
				System.out.println("multiple or not : " + multiple);
			} else if (type.equalsIgnoreCase("allSelectedOptions")) {
				List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
				for (WebElement list : allSelectedOptions) {
					System.out.println(list.getText());
				}
			} else if (type.equalsIgnoreCase("firstSelectedOption")) {
				WebElement firstSelectedOption = s.getFirstSelectedOption();
				String text = firstSelectedOption.getText();
				System.out.println("firstSelected : " + text);
			} else if (type.equalsIgnoreCase("deselectall")) {
				s.deselectAll();
			}
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}
	}

	public static void action(WebElement element, String type) {
		Actions a = new Actions(driver);
		try {
			if (type.equalsIgnoreCase("click")) {
				a.click(element).build().perform();
			} else if (type.equalsIgnoreCase("contextclick")) {
				a.contextClick(element).build().perform();
			} else if (type.equalsIgnoreCase("doubleclick")) {
				a.doubleClick(element).build().perform();
			} else if (type.equalsIgnoreCase("movetoelement")) {
				a.clickAndHold(element).moveToElement(element).build().perform();
			} else if (type.equalsIgnoreCase("draganddrop")) {
				a.dragAndDrop(element, element).build().perform();
			}
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}
	}

	public static void window(String type) {

		try {
			if (type.equalsIgnoreCase("size")) {
				int size = driver.getWindowHandles().size();
				System.out.println("size : " + size);
			} else if (type.equalsIgnoreCase("parentid")) {
				String parentid = driver.getWindowHandle();
				System.out.println("parentid : " + parentid);
			} else if (type.equalsIgnoreCase("titles")) {
				Set<String> windowHandles = driver.getWindowHandles();

				for (String list : windowHandles) {
					String title = driver.switchTo().window(list).getTitle();
					System.out.println("title : " + title);
				}
			}
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}
	}

	public static void javascript(int i, int j) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(" + i, j + ")", "");
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}
	}

	public static void wait(int time, TimeUnit value) {
		try {
			driver.manage().timeouts().implicitlyWait(time, value);
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}
	}

	public static void sleep(int value) throws InterruptedException {
		try {
			Thread.sleep(value);
		} catch (InterruptedException e) {
			System.out.println("Exception occurs");
		}
	}

	public static void alert(String type) {
		try {
			Alert alert = driver.switchTo().alert();
			if (type.equalsIgnoreCase("accept")) {
				alert.accept();
			} else if (type.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
			}
		} catch (Exception e) {
			System.out.println("Exception occurs");

		}
	}

	public static void confirmalert(String type, WebElement element) {
		try {
			Alert alert = driver.switchTo().alert();
			if (type.equalsIgnoreCase("accept")) {
				alert.accept();
				System.out.println(element.getText());
			} else if (type.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
				System.out.println(element.getText());
			}
		} catch (Exception e) {
			System.out.println("Exception occurs");

		}
	}

	public static void promptalert(String type, String value, WebElement element) {
		try {
			Alert alert = driver.switchTo().alert();
			if (type.equalsIgnoreCase("accept")) {
				alert.sendKeys(value);
				alert.accept();
				System.out.println(element.getText());
			} else if (type.equalsIgnoreCase("dismiss")) {
				alert.sendKeys(value);
				alert.dismiss();
				System.out.println(element.getText());
			}
		} catch (Exception e) {
			System.out.println("Exception occurs");

		}
	}

	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}
	}

	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}
	}
}
