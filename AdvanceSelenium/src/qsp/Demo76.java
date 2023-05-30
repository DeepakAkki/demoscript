package qsp;
//scroll down and up 500 piscal
import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo76 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:/www.amazon.in");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for (int i = 0; i < 3; i++)
	{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
	}
	for (int j = 0; j < 3; j++)
	{
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
	}}}