package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prc3 
{
public static void main(String[] args) throws InterruptedException 
{
	String key="webdriver.gecko.driver";
	String value="./Software/geckodriver.exe";
System.setProperty(key, value);
WebDriver driver=new FirefoxDriver();
Thread.sleep(2000);
//String url=driver.getCurrentUrl();
//System.out.println(url);
String p=driver.getPageSource();
System.out.println(p);
//String t=driver.getTitle();
//System.out.println(t);
//driver.close();
//driver.quit();
}
}
