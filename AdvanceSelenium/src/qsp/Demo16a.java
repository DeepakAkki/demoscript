package qsp;
// Source code to click on google
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo16a 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver",
"./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/3/link.html");
Thread.sleep(2000);
//driver.findElement(By.linkText("google")).click();
driver.findElement(By.partialLinkText("goo")).click();						
}}
//<html>
//<body>
//<a href="http://www.google.com">google</a>
//</body>
//</html>