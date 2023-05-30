package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo61a 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/11/mainpage.html");
Thread.sleep(2000);
driver.findElement(By.id("a1")).sendKeys("abc");
driver.switchTo().frame(0);//index valvue start from0 control will go to from0 to confirm that use sop
driver.findElement(By.id("b1")).sendKeys("xyz");//find ele by pass address
driver.switchTo().parentFrame();//without this control will not go back
Thread.sleep(2000);
driver.findElement(By.id("a1")).sendKeys("ccc");
}}
