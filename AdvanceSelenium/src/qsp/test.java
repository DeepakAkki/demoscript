package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
Thread.sleep(2000);
//driver.close();
//driver.quit();
driver.get("file:///C:/Users/Deepak%20Akki/Desktop/za.html");
driver.findElement(By.tagName("input")).sendKeys("aa");
}}