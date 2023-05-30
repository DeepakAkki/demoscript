package TestFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POMRunner 
{
	@Test
	public void validlogin() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	POMScript p= new POMScript(driver);
	p.clickLogin();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	p.clickLogin();
	}}