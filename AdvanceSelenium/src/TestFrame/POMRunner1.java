package TestFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POMRunner1 
{
	@Test
	public void validlogin() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	POMScript1 p= new POMScript1(driver);
	p.unData("admin");
	Thread.sleep(2000);
	p.pwdData("manager");
	Thread.sleep(2000);
	p.clicklogin();
	}}