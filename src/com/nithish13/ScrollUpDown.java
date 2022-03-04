package com.nithish13;

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

public class ScrollUpDown {

	public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	WebElement scroll = driver.findElement(By.xpath("(//span[@class='hDTmm5'])[1]"));
	
	
	JavascriptExecutor ms = (JavascriptExecutor) driver;
	
	ms.executeScript("arguments[0].scrollIntoView();", scroll);
	
TakesScreenshot ss  =(TakesScreenshot) driver;
File source = ss.getScreenshotAs(OutputType.FILE);
File dest = new File("C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Screenshot\\flip1.png");
FileUtils.copyFile(source, dest);


	}
}
