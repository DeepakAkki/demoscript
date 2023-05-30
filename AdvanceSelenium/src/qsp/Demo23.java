package qsp;
// contains method
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo23 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver",
"./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com/");
Thread.sleep(2000);
String title=driver.getTitle();
System.out.println(title);
String url=driver.getCurrentUrl();
System.out.println(url);
if(title.contains("Insta"))
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
	}
if(url.contains("instagram"))
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
	}
}}