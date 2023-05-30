package qsp;
//Open FB in FF
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo15 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
//driver.manage().window().maximize();//to max the browser
driver.get("https://www.facebook.com");
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys("deepakakki");
Thread.sleep(2000);
driver.findElement(By.name("pass")).sendKeys("dondondon32");
Thread.sleep(2000);
driver.findElement(By.name("login")).click();
}}