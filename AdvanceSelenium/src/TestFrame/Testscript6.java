package TestFrame;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testscript6 extends GenericScript6
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
		//Assert.assertEquals(title,"actiTIME - Enter Time-Track");
		Assert.assertTrue(title.contains("Enter"));
		System.out.println("1");
	}
}