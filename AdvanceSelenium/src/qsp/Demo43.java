package qsp;
//fetch fref value od all link in flipkart
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo43 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
List<WebElement>links=
driver.findElements(By.xpath("//a"));
int count=links.size();
System.out.println(count);
for(WebElement ele:links)
{
	String alt=ele.getAttribute("href");
	System.out.println(alt);
}}}