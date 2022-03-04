package com.nithish13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();
Thread.sleep(2000);

driver.switchTo().frame("singleframe");

WebElement findElement3 = driver.findElement(By.xpath("//input[@type='text']"));
WebElement findElement2 = findElement3;
WebElement findElement = findElement2;
WebElement textbox = findElement;

textbox.sendKeys("nithish");

driver.switchTo().defaultContent();

Thread.sleep(2000);

WebElement multiframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));

multiframe.click();

WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
driver.switchTo().frame(outerframe);

WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
driver.switchTo().frame(innerframe);

WebElement input =driver.findElement(By.xpath("//input[@type='text']"));
input.sendKeys("sujatha");




	}

}
