package qsp;
//find ele and pass address
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo61b 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/11/mainpage.html");
Thread.sleep(2000);
driver.findElement(By.id("a1")).sendKeys("abc");
Thread.sleep(4000);
WebElement ele=driver.findElement(By.id("f1"));// by pass address
driver.switchTo().frame(ele);
Thread.sleep(2000);
driver.findElement(By.id("b1")).sendKeys("zzz ");
}}












