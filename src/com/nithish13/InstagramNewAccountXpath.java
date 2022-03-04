package com.nithish13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramNewAccountXpath {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");

WebDriver as = new ChromeDriver();

as.get("https://www.instagram.com/");
as.manage().window().maximize();
Thread.sleep(2000);

WebElement signup = as.findElement(By.xpath("//a[@data-testid='sign-up-link']"));
signup.click();

Thread.sleep(2000);

WebElement email = as.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']"));
email.sendKeys("as132036@gmail.com");

WebElement name = as.findElement(By.xpath("//input[@aria-label='Full Name']"));
name.sendKeys("Nithish Raj");

Thread.sleep(2000);

WebElement username = as.findElement(By.xpath("//input[@aria-label='Username']"));
username.sendKeys("asnithishdd");

Thread.sleep(2000);

WebElement password = as.findElement(By.xpath("//input[@aria-label='Password']"));
password.sendKeys("123qwe");

Thread.sleep(2000);

WebElement sign = as.findElement(By.xpath("//button[@type='submit']"));
sign.click();






 	}

}
