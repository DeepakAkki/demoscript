package qsp;
//revision all in one
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo25 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com");	
Thread.sleep(2000);//quit,close,url,tag,page source
driver.findElement(By.tagName("button")).click();//id,name,classname.//send,clear
driver.findElement(By.linkText("Forgotten password?")).click();//partialLinkText
driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Deepakakki");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text'and @class='inputtext _55r1 _6luy']")).sendKeys("Deepak");
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();//used for all not only link
driver.findElement(By.xpath("//a[@waprocessedanchor='true'and text()='Forgotten password?']")).click();
driver.findElement(By.xpath("//td[contains(.,'Build']"));//partially Dynamic element
}
}
