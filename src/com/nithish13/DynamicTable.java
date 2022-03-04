package com.nithish13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.cricbuzz.com/");
WebElement liveScore = driver.findElement(By.xpath("(//a[@class='cb-hm-mnu-itm'])[1]"));
liveScore.click();


}
}
