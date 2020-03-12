package com.globaltech.bdd;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class Oliveboard extends GlobalDataOliveboard {

	private By loginPageButton = By.xpath("//a[text()='Login']/@href ");
	private By email = By.xpath("//input[@name='email']");
	private By password=By.xpath("//input[@name='pass']");
	private By login=By.xpath("//input[@value='Log In']");
	private By profile = By.xpath("//span[@class='_1vp5']");

	
	public WebElement emailBox() {
		return driver.findElement(email);
	}
	
	public WebElement passwordBox() {
		return driver.findElement(password);
	}
	
	public WebElement loginButton() {
		return driver.findElement(login);
	}

	public String profileName() throws InterruptedException {
		String ProfileName = driver.findElement(profile).getText();
		System.out.println(ProfileName);
		return ProfileName;
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void closeNotificationWindow() throws AWTException, Exception {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rob.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rob.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
			}
}