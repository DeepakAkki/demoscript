package qsp;
//OPen youtube and run video
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo17 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf");
Thread.sleep(5000);
driver.findElement(By.cssSelector("button[class='style-scope ytd-searchbox']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
}}

