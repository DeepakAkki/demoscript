package qsp;
//text of given element 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo27 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
WebElement ele=driver.findElement(By.xpath("//a[@title='Hindi']"));
Thread.sleep(2000);
String t=ele.getText();
System.out.println(t);
}}
