package com.nithish13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.zee5.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	WebElement search = driver.findElement(By.xpath("//a[@href='/search']"));
	
	search.click();
	
	Thread.sleep(4000);
	
	WebElement search1 = driver.findElement(By.xpath("//input[@type='text']"));
	
	search1.sendKeys("zee telugu");
	
	Thread.sleep(4000);
	
	WebElement select = driver.findElement(By.id("tvshows"));
	
	select.click();
	
	Thread.sleep(4000);
	
	WebElement serial = driver.findElement(By.xpath("//a[@href='/tv-shows/details/mithai-kottu-chittemma/0-6-3264']"));
	
	serial.click();
	
	Thread.sleep(3000);
	
	WebElement watch = driver.findElement(By.xpath("(//div[@class='showDetailIcon'])[2]"));
	
	watch.click();
	
	
	
}
}
