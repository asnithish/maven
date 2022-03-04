package com.nithish13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute2 {

public static void main(String[] args) throws InterruptedException {
			
System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
			
driver.get("https://www.instagram.com/");

Thread.sleep(3000);

WebElement login = driver.findElement(By.xpath("/html/body/div/section/main/article/div[2]/div/div/form/div/div/div/label/input"));
login.sendKeys("rajnithish@rocketmail.com");

Thread.sleep(3000);

WebElement password = driver.findElement(By.xpath("/html/body/div/section/main/article/div[2]/div/div/form/div/div[2]/div/label/input"));
password.sendKeys("raj903374");

Thread.sleep(3000);

WebElement signup = driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div/form/div/div[3]"));
signup.click();

Thread.sleep(3000);

WebElement forgot = driver.findElement(By.xpath("/html/body/div/section/main/article/div[2]/div/div/form/a"));
forgot.click();




	}

}
