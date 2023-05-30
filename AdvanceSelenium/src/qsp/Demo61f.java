package qsp;
// last frame to default
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo61f 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/11/New%20folder/mainpage.html");
Thread.sleep(2000);
driver.findElement(By.id("a1")).sendKeys("abc");
driver.switchTo().frame(0);
Thread.sleep(2000);
driver.findElement(By.id("b1")).sendKeys("xyz ");
driver.switchTo().frame(0);
Thread.sleep(2000);
driver.findElement(By.id("C1")).sendKeys("zzz ");
driver.switchTo().frame(0);
Thread.sleep(2000);
driver.findElement(By.id("D1")).sendKeys("csd ");
Thread.sleep(2000);
driver.switchTo().defaultContent();
driver.findElement(By.id("a1")).sendKeys("xyz");
Thread.sleep(2000);
}}