package com.nithish13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MuitiplerDropdown {

public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("http://www.leafground.com/pages/Dropdown.html");

 driver.manage().window().maximize();

Thread.sleep(2000);

WebElement drop = driver.findElement(By.xpath("(//select)[6]"));

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

