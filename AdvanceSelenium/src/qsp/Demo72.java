package qsp;
//Open multi tab anf take control in last tab
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo72 
{
public static void main(String[] args) throws InterruptedException, AWTException
{
System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.selenium.dev/");
WebElement ele1=driver.findElement(By.xpath("//span[.='Downloads']"));
WebElement ele2=driver.findElement(By.xpath("//span[.='Documentation']"));
WebElement ele3=driver.findElement(By.xpath("//span[.='Projects']"));
WebElement ele4=driver.findElement(By.xpath("//span[.='Support']"));
WebElement ele5=driver.findElement(By.xpath("//span[.='Blog']"));
ArrayList l1=new ArrayList();
l1.add(ele1);
l1.add(ele2);
l1.add(ele3);
l1.add(ele4);
l1.add(ele5);
Thread.sleep(2000);
Actions act=new Actions(driver);
Robot r=new Robot();
for (Object l2:l1)
{
	act.contextClick((WebElement)l2).perform();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
}
Thread.sleep(2000);
Set<String> allwh=driver.getWindowHandles();
int count=allwh.size();
int i=0;
for(String wh:allwh)
{
	if(i==count-1)
	{
		driver.switchTo().window(wh);
	}
	i++;
}
	}
}