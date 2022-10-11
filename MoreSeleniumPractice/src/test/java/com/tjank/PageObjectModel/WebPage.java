package com.tjank.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class WebPage {

	protected String URL = "http://localhost:7080";
	protected static WebDriver driver;

	public void setup() {
		String url = this.getUrl();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		assertEquals(driver.getCurrentUrl(),url);
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}
