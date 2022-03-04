package com.nithish13;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Trainstatus{

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://enquiry.indianrail.gov.in/mntes/");
	
	Thread.sleep(5000);
	
	
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	
	Thread.sleep(3000);

	search.sendKeys("12711");
	
	Thread.sleep(3000);
	
	Select sel = new Select(driver.findElement(By.xpath("//select[@name='jStation']")));
 
	Thread.sleep(2000);
	
	sel.selectByIndex(1);
	
	Thread.sleep(3000);
	
	WebElement find = driver.findElement(By.xpath("(//td[@align='left'])[4]"));
	
	JavascriptExecutor roll = (JavascriptExecutor)driver;
	
	roll.executeScript("arguments[0].scrollIntoView();", find);
	
	Thread.sleep(2000);
	
	TakesScreenshot take = (TakesScreenshot) driver;
	
	File source = take.getScreenshotAs(OutputType.FILE);
	
	File print = new File("C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Screenshot\\train1.png");
	
	FileUtils.copyFile(source, print);
	
	Thread.sleep(5000);
	
	driver.close();
	}
}
