package qsp;
//Key board function enter
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo23f 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/8/abc.html");
WebElement ele=driver.findElement(By.tagName("input"));
Thread.sleep(2000);
ele.sendKeys(Keys.ENTER);
}}
//<html>
//<head>
//un:<input type="Text"><br>
//</html>
