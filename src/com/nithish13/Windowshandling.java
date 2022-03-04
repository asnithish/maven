package com.nithish13;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowshandling {

	public static void main(String[] args) throws AWTException {

System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");

WebElement news = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div[3]/a"));

Actions ac = new Actions(driver);

ac.contextClick(news).build().perform();

Robot r = new Robot();

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

String one = driver.getWindowHandle();

Set<String> two = driver.getWindowHandles();

Iterator<String> three = two.iterator();

while (three.hasNext()) {
String child = three.next();

if (one.equals(child)) {
	
driver.switchTo().window(one);

WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
pass.sendKeys("123456");

	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
}
	
}
}

	}

