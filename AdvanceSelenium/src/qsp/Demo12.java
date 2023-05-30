package qsp;
//Source code with all types of sending data
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver",
"./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/2/locator%20textfiled%20pass%20Selenium.html");
Thread.sleep(2000);
driver.findElement(By.tagName("input")).sendKeys("Selenium");
//driver.findElement(By.id("a1")).sendKeys("Selenium");
//driver.findElement(By.name("n1")).sendKeys("Selenium");
//driver.findElement(By.className("c1")).sendKeys("Selenium");
}}						
//<html>
//<body>
//UN:<input type="text" id="a1" name="n1" class="c1">
//</body>
//</html>