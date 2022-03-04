package com.nithish13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown2 {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php");
	
	WebElement drop = driver.findElement(By.id("year"));
	
	Select s = new Select(drop);
	
	boolean drop2 = s.isMultiple();
	System.out.println(drop2);
	
	List<WebElement> options=s.getOptions();

	for (WebElement alloptions : options){
	String text =alloptions.getText();
	System.out.println(text);


	}
		
}
}
