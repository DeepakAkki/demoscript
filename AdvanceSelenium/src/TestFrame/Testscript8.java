package TestFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testscript8 extends GenericScript7
{
	@Test
	public void validLogin() throws InterruptedException
	{
		WebElement ele=driver.findElement(By.xpath("//div[.='Login ']")); 
				ele.click();
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(2000);
				ele.click();
		Thread.sleep(2000);
		
	}
}