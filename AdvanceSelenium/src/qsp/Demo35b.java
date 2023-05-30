package qsp;
//fetch count of img in amazon
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo35b 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
List<WebElement>links=driver.findElements(By.xpath("//img"));
int count=links.size();
System.out.println(count);
}}