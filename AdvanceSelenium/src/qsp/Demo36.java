package qsp;
// no of checkbox and radio in irctc
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo36 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.irctc.co.in/nget/");
Thread.sleep(2000);
List<WebElement>links=
driver.findElements(By.xpath("//input[@type='checkbox']|//input[@type='radio']"));//img   //a|//img
int count=links.size();
System.out.println(count);
}}
