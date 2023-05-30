package qsp;
//Key board function delete
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo23e 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/2/defaultext%20clear%20hello.html");
WebElement ele=driver.findElement(By.id("a1"));
Thread.sleep(2000);
ele.sendKeys(Keys.CONTROL+"a");
Thread.sleep(2000);
ele.sendKeys(Keys.DELETE);
}}
//<html>
//<body>
//UN:<input type="text" id="a1" name="n1" class="c1" value="hello">
//</body>
//</html>
