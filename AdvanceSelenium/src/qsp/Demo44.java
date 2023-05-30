package qsp;
//source value of all the img in amazon
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo44 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
List<WebElement>images=driver.findElements(By.xpath("//img"));
int count=images.size();
System.out.println(count);
for(WebElement ele:images)
{
	String sv=ele.getAttribute("src");
	System.out.println(sv);
}}}