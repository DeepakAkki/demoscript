package qsp;
//deleteAllCookies
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo35
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().deleteAllCookies();
}}
