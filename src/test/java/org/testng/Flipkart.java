package org.testng;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	
	public WebDriver driver;
	
	@Parameters({"Browser"})
	@Test
	private void tc1(String x) {
		if (x.contains("Ch")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if (x.contains("Ed")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			
		}
		BaseClass.LaunchUrl("https://www.flipkart.com/");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
