package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mock 
{
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://wwww.facebook.com");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("deepak");
	driver.findElement(By.name("pass")).sendKeys("deepak");
	driver.findElement(By.tagName("button")).click();
}}