package qsp;
//Source code with all types of click action 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver",
"./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/2/locator%20link%20click.html");
Thread.sleep(2000);
//WebElement ele=driver.findElement(By.tagName("a"));
//ele.click();
//or
driver.findElement(By.tagName("a")).click();
//driver.findElement(By.id("a1")).click();
//driver.findElement(By.name("n1")).click();
//driver.findElement(By.className("c1")).click();
}}				
//<html>
//<body>
//<a id="a1" name="n1" class="c1"
//href="http://www.facebook.com">facebook</a>
//</body>
//</html>
