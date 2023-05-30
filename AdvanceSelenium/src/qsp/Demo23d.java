package qsp;
//Web Element clear
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo23d 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/8/zaaa.htm");
WebElement ele=driver.findElement(By.id("a1"));
Thread.sleep(2000);
ele.clear();
}}
//<html>
//<body>
//un:<input type="text" value="sassas" id="a1">
//</body>
//</html>