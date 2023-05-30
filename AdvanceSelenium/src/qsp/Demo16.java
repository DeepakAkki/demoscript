package qsp;
//Open FB in crome by using CSS
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo16 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();//to max the browser
driver.get("https://www.facebook.com");
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Deepakakki");
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("dondondon32");
Thread.sleep(2000);
driver.findElement(By.cssSelector("button[name='login']")).click();				
}}
