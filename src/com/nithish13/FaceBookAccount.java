package com.nithish13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAccount {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");
	
WebDriver driver = new ChromeDriver();
	
driver.get("https://www.facebook.com/r.php");

driver.manage().window().maximize();
Thread.sleep(3000);

WebElement firstname = driver.findElement(By.name("firstname"));
firstname.sendKeys("nithish");

WebElement lastname = driver.findElement(By.name("lastname"));
lastname.sendKeys("raj");

WebElement mobile = driver.findElement(By.name("reg_email__"));
mobile.sendKeys("1234567890");

WebElement password = driver.findElement(By.name("reg_passwd__"));
password.sendKeys("raj123456");

Select s = new Select(driver.findElement(By.id("day")));
Thread.sleep(2000);
s.selectByValue("13");

Select s1 = new Select(driver.findElement(By.id("month")));
Thread.sleep(2000);
s1.selectByValue("4");

Select s2 = new Select(driver.findElement(By.id("year")));
Thread.sleep(2000);
s2.selectByValue("1995");

WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
gender.click();
Thread.sleep(2000);

WebElement signup = driver.findElement(By.name("websubmit"));
signup.click();






	}

}
