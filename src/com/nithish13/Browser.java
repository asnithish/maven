package com.nithish13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
//main method	
public static void main(String[] args) {
	//browser launch       key                                   location
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");
//up casting method
WebDriver driver = new ChromeDriver();
                          //url
driver.get("https://www.selenium.dev/downloads/");
//maximize
driver.manage().window().maximize();
//navigate method
driver.navigate().to("https://www.facebook.com/");

driver.navigate().back();

driver.navigate().forward();
//close
driver.close();

}
}
