package com.nithish13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstragramLogin {

public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");
	
WebDriver driver = new ChromeDriver();

driver.get("https://www.instagram.com/");

driver.manage().window().maximize();

Thread.sleep(3000);

WebElement username = driver.findElement(By.name("username"));

username.sendKeys("asnithish851@gmail.com");

Thread.sleep(3000);

WebElement password = driver.findElement(By.name("password"));

password.sendKeys("raj13203615");

WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));

login.click();

driver.findElement(By.className("_6q-tv"));




}
}
