package com.hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.global.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {
	@Before
	public void setUp() {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options1=new ChromeOptions();
			options1.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options1);
			url();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
	        options.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(options);
			
			url();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			url();
			break;
		}
	}

	@After
	public void tearDown()  {
		driver.quit();
	}

	public void url() {
		driver.get(url);

	}

}
