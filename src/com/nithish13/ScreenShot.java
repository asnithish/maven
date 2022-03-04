package com.nithish13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.amazon.com/");

driver.manage().window().maximize();

Thread.sleep(2000);

TakesScreenshot ts = (TakesScreenshot) driver;//narrowing typecasting

File source = ts.getScreenshotAs(OutputType.FILE);

File dest = new File("C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Screenshot\\pic1.png");

FileUtils.copyFile(source, dest);

	}

}
