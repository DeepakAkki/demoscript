package qsp;
//type casting from list set
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo51 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/r.php");// add /r.php
WebElement ele=driver.findElement(By.id("month"));
Select s=new Select(ele);
ArrayList<String>l1=new ArrayList<String>();
TreeSet<String>t1=new TreeSet<String>(l1);
List<WebElement>opt=s.getOptions();
int count=opt.size();
System.out.println(count);
for(WebElement we:opt)
{
	String t=we.getText();
	t1.add(t);
}
for(String t2:t1)
{
	System.out.println(t2);
}}}
