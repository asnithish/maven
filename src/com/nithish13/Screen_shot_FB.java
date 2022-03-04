package com.nithish13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_shot_FB {

	public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("rajnithish@rocketmail.com");
	
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("13203615raj");
	
	TakesScreenshot take = (TakesScreenshot) driver;
	File source = take.getScreenshotAs(OutputType.FILE);
	File print = new File("C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Screenshot\\facebook.png");
	FileUtils.copyFile(source, print);
	
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	
	
	
	
	}

}
