package TestFrame;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testscript5 extends GenericScript5
{
	@Test
	public void validLogin() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test (priority=1)
	public void InvalidLogin() throws InterruptedException
	{
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//a[@id='lognButton']")).click();
	Thread.sleep(2000);
	String title=driver.getTitle();
	System.out.println(title);
}}