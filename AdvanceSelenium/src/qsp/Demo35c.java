package qsp;

import java.util.List;
//fetch count of img and link in flipkart
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo35c 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
Thread.sleep(2000);
List<WebElement>links=
driver.findElements(By.xpath("//a|//img"));
int count=links.size();
System.out.println(count);
}}