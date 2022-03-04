package com.nithish13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\driver2\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
	WebElement clickthebutton = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	clickthebutton.click();
	
	Thread.sleep(4000);
	driver.switchTo().alert().accept();
	
	//conform alert
	WebElement conformbutton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	conformbutton.click();
	
	WebElement button2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	button2.click();
	
	driver.switchTo().alert().dismiss();
	
	WebElement button3 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	button3.click();
	
	WebElement button4 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	button4.click();
	
	driver.switchTo().alert().sendKeys("nithish");
	driver.switchTo().alert().accept();
	}
}
