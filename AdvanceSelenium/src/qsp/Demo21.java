package qsp;
//Like on KGF
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo21  
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id='segmented-like-button'and @class='style-scope ytd-segmented-like-dislike-button-renderer']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'text']")).click();
Thread.sleep(2000);
}}