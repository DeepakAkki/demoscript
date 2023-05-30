package qsp;
//chech option Sep present on dropdown
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo53 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/r.php");// add /r.php
WebElement ele=driver.findElement(By.id("month"));
Select s=new Select(ele);
ArrayList<String>l1=new ArrayList<String>();
List<WebElement>opt=s.getOptions();
int count=opt.size();
System.out.println(count);
for(WebElement we:opt)
{
	String t=we.getText();
	l1.add(t);
}
if (l1.contains("Sep"))
{
	System.out.println("present");
}
else
{
	System.out.println("no");
}}}