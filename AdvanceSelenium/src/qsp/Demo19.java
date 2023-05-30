package qsp;
//Log in to insta using xpath 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo19 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.instagram.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Deepak");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Deepuggfd");
Thread.sleep(8000);
driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
}}
