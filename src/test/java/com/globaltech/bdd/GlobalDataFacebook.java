package com.globaltech.bdd;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GlobalDataFacebook {
	public WebDriver driver = null;
	public Properties prop;
	@Test
	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Anuj Gunsola\\JBLProject\\facebookData.properties");
		prop.load(file);

		if (prop.getProperty("browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").equals("internet explorer")) {
			driver = new InternetExplorerDriver();
		}
		return driver;
	}
	
	public void homepage() throws Exception {
		prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Anuj Gunsola\\JBLProject\\facebookData.properties");
		prop.load(file);
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	public CharSequence detail() throws IOException {
		prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Anuj Gunsola\\JBLProject\\facebookData.properties");
		prop.load(file);
		CharSequence username = prop.getProperty("username");
		return username;
	}
	
	public CharSequence password() throws IOException {
		prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Anuj Gunsola\\JBLProject\\facebookData.properties");
		prop.load(file);
		CharSequence password = prop.getProperty("password");
		return password;
	}

	/*
	 * @Test void addInfo() {
	 * 
	 * }
	 */
}
