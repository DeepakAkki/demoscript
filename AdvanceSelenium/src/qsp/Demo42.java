package qsp;
//pass data to 5 text filed forward and clear backword
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo42 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/9/text5filed.html");
List<WebElement>text=driver.findElements(By.xpath("//input[@type='text']"));
int count=text.size();
System.out.println(count);
for(WebElement we:text)
{
	we.sendKeys("deepak");
}
for(int i=count-1;i>=0;i--)
{
WebElement we=text.get(i);
we.clear();
}}}
//<html>
//<body>
//UN1:<input type="text"><br> UN2,UN3,UN4,UN5
//</body>
//</html>