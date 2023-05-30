 package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo80 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://uitestpractice.com/");
	driver.findElement(By.xpath("//a[.='Form']")).click();
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Deepak");
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Deepu");
	driver.findElement(By.name("optradio")).click();;
	//driver.findElement(By.xpath(""))
	}} 