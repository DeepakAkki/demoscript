package qsp;
//immed patrent switch 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo61c 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/11/mainpage.html");
Thread.sleep(2000);
driver.findElement(By.id("a1")).sendKeys("abc");
driver.switchTo().frame(0);//index valvue start from0
driver.findElement(By.id("b1")).sendKeys("xyz");
driver.switchTo().parentFrame();
Thread.sleep(4000);
driver.findElement(By.id("a1")).sendKeys("zzz ");
}}