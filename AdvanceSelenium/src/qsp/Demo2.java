package qsp;
//Launch empty FF browser
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2
{
public static void main(String[] args) 
{
String key="webdriver.gecko.driver";	
String value="./Software/geckodriver.exe";
System.setProperty(key,value);
FirefoxDriver  driver=new FirefoxDriver();
}
}
