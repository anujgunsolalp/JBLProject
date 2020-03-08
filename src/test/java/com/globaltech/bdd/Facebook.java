package com.globaltech.bdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Facebook extends GlobalDataFacebook {

	private By email = By.xpath("//input[@name='email']");
	private By password=By.xpath("//input[@name='pass']");
	private By login=By.xpath("//input[@value='Log In']");
	private By profile = By.linkText("Profile");

	
	public WebElement emailBox() {
		return driver.findElement(email);
	}
	
	public WebElement passwordBox() {
		return driver.findElement(password);
	}
	
	public WebElement loginButton() {
		return driver.findElement(login);
	}

	public WebElement profileLogo() throws InterruptedException {
		Thread.sleep(50000);
		return driver.findElement(profile);
	}
}