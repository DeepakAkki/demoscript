package qsp;
// Launch empty chrome browser
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
public static void main(String[] args) 
{
String key="webdriver.chrome.driver";	
String value="./Software/chromedriver.exe";
System.setProperty(key,value);//start here 
ChromeDriver  driver=new ChromeDriver();
}
}
