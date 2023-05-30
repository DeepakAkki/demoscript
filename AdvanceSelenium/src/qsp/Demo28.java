package qsp;
//Location of given element 
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo28 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
WebElement ele=driver.findElement(By.xpath("//a[@title='Tamil']"));
Thread.sleep(2000);
Point lock=ele.getLocation();
System.out.println(lock);
int x=lock.getX();
System.out.println(x);
int y=lock.getY();
System.out.println(y);
}}

