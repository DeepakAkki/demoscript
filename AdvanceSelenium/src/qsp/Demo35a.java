package qsp;
//fetch count of all the links (multiple element)
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo35a 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/8/zzzzzzzssssssss.html");
Thread.sleep(2000);
List<WebElement> links=driver.findElements(By.xpath("//a"));
int count=links.size();
System.out.println(count);
}}
//<html>
//<body>
//<a id="a1" href="https://www.google.com">google></a><br>
//<a id="a2" href="https://www.facebook.com">facebook></a><br>
//</body>
//</html>

