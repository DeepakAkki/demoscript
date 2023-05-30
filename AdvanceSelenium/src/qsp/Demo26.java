package qsp;
//attribute value of an element 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo26 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com");
WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
Thread.sleep(2000);
String alt=ele.getAttribute("href");
System.out.println(alt);
}}

