package qsp;
//using Xpath grt direction in googel map bng-mys
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo20 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(6000);
driver.get("https://www.google.co.in/maps/@12.9978608,77.5275458,15z");
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bengaluru, Karnataka");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@aria-controls='sbsg52']")).sendKeys("Mysuru, Karnataka");
Thread.sleep(6000);
driver.findElement(By.xpath("//img[@aria-label='Driving']")).click();
}}
