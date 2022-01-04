package org.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	static WebElement loc;
	static JavascriptExecutor js;
	static Actions a;

	public static void Chrome() {		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void LaunchUrl(String url) {
		driver.get(url);
	}
	public static String Url() {
		return driver.getCurrentUrl();
		
	}
	public static void close() {
	driver.close();
	}
	public static void maximize(){
		driver.manage().window().maximize();
	}
	public static void minimize() {
		driver.manage().window().minimize();
	}
	public static WebDriver driver() {return driver;}
	
	public static String title() {
		return driver.getTitle();
	}
	
	public static void ToSendkeys(String xpath, String d) {
		loc = driver.findElement(By.xpath(xpath));
		loc.sendKeys(d);
	}

	public static void ToClick(String clk) {
		loc = driver.findElement(By.xpath(clk));
		loc.click();
	}
	public static String windowhandle() {
		return driver.getWindowHandle();
	}

	public static void Wait() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public static void Dropdown(String d, int n) {
		loc = driver.findElement(By.xpath(d));
		Select s = new Select(loc);
		s.selectByIndex(n);
	}

	public static String GetValue(String x) {
		loc = driver.findElement(By.id(x));
		return loc.getAttribute("value");
	}

	public static void JavaScript(String x, WebElement y) {
		js = (JavascriptExecutor) driver;
		js.executeScript(x, y);
	}

	public static void SS(String x) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(x);
		FileUtils.copyFile(src, dest);
	}

	public static void Action(String x) {
		a = new Actions(driver);
		loc = driver.findElement(By.xpath(x));
		
	}

	public static void Sleep(int n) throws InterruptedException {
		Thread.sleep(n);
	}

	
	
	public static void PressEnter() {
    
	}
	
	

}
