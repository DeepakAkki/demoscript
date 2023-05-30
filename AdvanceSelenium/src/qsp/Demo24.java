package qsp;
//Swap using board function 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo24 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/7/ManAut.html");
WebElement ele1=driver.findElement(By.id("a1"));
WebElement ele2=driver.findElement(By.id("a2"));
WebElement ele3=driver.findElement(By.id("a3"));
Thread.sleep(2000);
ele1.sendKeys(Keys.CONTROL+"ax");
Thread.sleep(2000);
ele3.sendKeys(Keys.CONTROL+"v");
Thread.sleep(2000);
ele2.sendKeys(Keys.CONTROL+"ax");
Thread.sleep(2000);
ele1.sendKeys(Keys.CONTROL+"v");
Thread.sleep(2000);
ele3.sendKeys(Keys.CONTROL+"ax");
Thread.sleep(2000);
ele2.sendKeys(Keys.CONTROL+"v");
Thread.sleep(2000);
}}
//<html>
//<body>
//1:<input type="text" value="Manual" id="a1"><br>
//2:<input type="text"value="Automation" id="a2"><br>
//3:<input type="text"id="a3"><br>
//</body>
//</html>