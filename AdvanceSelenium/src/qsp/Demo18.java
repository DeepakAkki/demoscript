package qsp;
//log in to FB using Xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo18 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Deepak");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Deepu");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@name='login']")).click();
}}