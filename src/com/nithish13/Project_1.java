package com.nithish13;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_1 {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Nithish\\eclipse-selenium1\\nithish1320\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://phptravels.com/");

WebElement signup = driver.findElement(By.xpath("(//a[@target='_blank'])[3]"));
signup.click();

Thread.sleep(3000);

String parent=driver.getWindowHandle();

Set<String>s=driver.getWindowHandles();

Iterator<String> reg= s.iterator();

while(reg.hasNext()) {

String child_window=reg.next();

if(parent.equals(child_window))
{
driver.switchTo().window(child_window);

WebElement firstname = driver.findElement(By.name("firstname"));
firstname.sendKeys("Nithish"); 

WebElement lastname = driver.findElement(By.id("inputLastName"));
lastname.sendKeys("Raj");

WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
email.sendKeys("asnithish51@gmail.com");

WebElement num = driver.findElement(By.id("inputPhone"));
num.sendKeys("9876543210");

WebElement st1 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
st1.sendKeys("8th street");

WebElement st2 = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
st2.sendKeys("tondiarpet");

WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
city.sendKeys("chennai");

WebElement state = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
state.sendKeys("tamil nadu");

WebElement country = driver.findElement(By.id("inputCountry"));
Select z = new Select(country);
z.selectByVisibleText("India");

WebElement mob = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
mob.sendKeys("9876543210");

WebElement pass = driver.findElement(By.name("password"));
pass.sendKeys("abcd12345");

WebElement pass2 = driver.findElement(By.name("password2"));
pass2.sendKeys("abcd12345");

Thread.sleep(10000);

WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
submit.click();

}
}

	}

}
