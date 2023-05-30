package qsp;
//Equals method
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo22  
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
if(title.equals("Instagram"))
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
	}
if(url.equals("https://www.instagram.com/"))
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
	}
}}