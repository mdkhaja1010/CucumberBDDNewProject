package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseClass;

public class SecondProductSelectingPage extends BaseClass{
	WebDriver driver;
	public SecondProductSelectingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='Sauce Labs Backpack']")
	private WebElement bag;
	public void clkbag() {
	utilfunctions.clickElement(bag);
	log.Info("bag is selected");
	}
	

}
