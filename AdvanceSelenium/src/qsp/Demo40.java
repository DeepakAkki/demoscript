package qsp;
//text of all the links using foe each loop
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo40  
{
public static void main(String[] args) throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement>Links=
		driver.findElements(By.xpath("//a"));
		int count=Links.size();
		System.out.println(count);
		for(WebElement we:Links)
		{
			String t=we.getText();
			System.out.println(t);
		}
}}