package qsp;
//Web Element is Enabled
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo23b
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/8/za.html");
WebElement ele=driver.findElement(By.id("a1"));
boolean b=ele.isEnabled();
if(b)
{
	System.out.println("enb");
}
else
{
	System.out.println("no");
}}}
//<html>
//<body>
//UN:<input type="text" disabled id="a1">
//</body>
//</html>