package qsp;
//file upload popup
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo64 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/upload.html");
Thread.sleep(2000);
WebElement ele=driver.findElement(By.name("upload file"));
ele.sendKeys("C:\\Users\\Deepak Akki\\Desktop\\3.png");
}}// here use \\ for file address
