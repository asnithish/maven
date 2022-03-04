package com.nithish13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartlogin {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Nithish\\\\eclipse-selenium1\\\\nithish1320\\\\Driver\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	
	WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	
	username.sendKeys("7299711747");
	
	Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
	password.sendKeys("raj903374");
	
	WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	
	login.click();
	
			

	
			

	}

}
