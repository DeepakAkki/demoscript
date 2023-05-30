package TestFrame;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testscript4 extends GenericScript4
{
	@Test
	public void validLogin() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}
}