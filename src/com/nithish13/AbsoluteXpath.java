package com.nithish13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.amazon.com/");

Thread.sleep(4000);

WebElement customer = driver.findElement(By.xpath("/html/body/div/header/div/div[4]/div/div[2]/div/a[2]"));

customer.click();

WebElement  youracc = driver.findElement(By.xpath("/html/body/div/div/div[4]/div/div/div[3]/div/a/div/div/div/div[2]/h3"));

youracc.click();

WebElement youraccc = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/a/div/div/div/div[2]/h2"));

youraccc.click();

driver.close();

}

}
