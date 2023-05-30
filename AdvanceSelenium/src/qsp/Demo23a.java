package qsp;
//Web Element Displayed method
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo23a 
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/8/z.html");
WebElement ele=driver.findElement(By.id("a1"));
boolean b=ele.isDisplayed();
if(b)
{
	System.out.println("Displayed");
}
else
{
	System.out.println("no");
}}}
//<html>
//<body>
//UN:<input type="text" id="a1">
//</body>
//</html>