package qsp;
//HW google kannanda page
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo71 
{
public static void main(String[] args) throws InterruptedException, AWTException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
Thread.sleep(2000);
WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
Actions act=new Actions(driver);
act.contextClick(ele).perform();
Thread.sleep(2000);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_T);
r.keyRelease(KeyEvent.VK_T);
Set<String> wh=driver.getWindowHandles();
for(String wh1:wh)
{
	driver.switchTo().window(wh1);
}}}
