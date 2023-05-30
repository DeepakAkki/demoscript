package qsp;
//Launch empty both browser
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 
{
public static void main(String[] args) 
{
String key="webdriver.chrome.driver";	
String value="./Software/chromedriver.exe";
System.setProperty(key,value);//start here 
ChromeDriver  driver=new ChromeDriver();
String key1="webdriver.gecko.driver";	
String value1="./Software/geckodriver.exe";
System.setProperty(key1,value1);
FirefoxDriver  driver1=new FirefoxDriver();
}
}
