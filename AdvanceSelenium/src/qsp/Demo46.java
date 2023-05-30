package qsp;
//dropdown is mutiselect or not
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo46 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/10/hotel.html");
WebElement ele=
driver.findElement(By.id("maruthi hotel"));
Select s=new Select(ele);
boolean b=s.isMultiple();
if(b)
{
	System.out.println("multiple");
}
else
{
System.out.println("no"+ "e");	
}
}
}