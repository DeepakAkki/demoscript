package qsp;
//address od all browser and aslo size of child,parent browser
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo66 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://skpatro.github.io/demo/links/");
Thread.sleep(2000);
driver.findElement(By.name("NewWindow")).click();
Thread.sleep(2000);
Set<String>allwh=driver.getWindowHandles();
int count=allwh.size();
System.out.println(count);
for(String wh:allwh)
{
	System.out.println(wh);
}
}} 
