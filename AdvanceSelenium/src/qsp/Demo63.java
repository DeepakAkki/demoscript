package qsp;
//hidden division popup
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo63 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.redbus.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='r-date']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//span[.='30'])[1]")).click();
}}
