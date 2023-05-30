package qsp;
//Web Element is Selected
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo23c 
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/8/zaa.html");
WebElement ele=driver.findElement(By.id("a1"));
boolean b=ele.isSelected();
if(b)
{
	System.out.println("selected");
}
else
{
	System.out.println("no");
}}}
//<html>
//<body>
//un:<input type="checkbox" checked id="a1">
//</body>
//</html>