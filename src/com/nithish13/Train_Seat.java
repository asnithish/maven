package com.nithish13;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Train_Seat {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html?locale=en");
	
	Thread.sleep(2000);
	
	WebElement train = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	
	train.sendKeys("12712");
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
	
	WebElement date = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
	
    date.click();
    
    Thread.sleep(2000);
    
    WebElement select = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[2]"));
    
    select.click();
    Thread.sleep(2000);
    
    WebElement source = driver.findElement(By.xpath(("//input[@type='text'])[4]")));
    source.sendKeys("chennai");
    
    r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
	
	WebElement destination = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
    destination.sendKeys("nlr");
    
    r.keyPress(KeyEvent.VK_DOWN);
   	r.keyRelease(KeyEvent.VK_DOWN);
   	r.keyPress(KeyEvent.VK_ENTER);
   	r.keyRelease(KeyEvent.VK_ENTER);
   	
   	Thread.sleep(2000);
   	
   	WebElement getstatus = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
   	getstatus.click();
    
    
	}

}
