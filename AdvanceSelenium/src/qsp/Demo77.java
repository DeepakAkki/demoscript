package qsp;
//amazon secarch fb scroll
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo77 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:/www.amazon.in");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//a[.='Facebook']"));
	Point Loc=ele.getLocation();
	System.out.println(Loc);
	int x =Loc.getX();
	int y=Loc.getY();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	js.executeScript("window.scrollBy(0,-500)");
	ele.click();
	driver.close();
	}}
	