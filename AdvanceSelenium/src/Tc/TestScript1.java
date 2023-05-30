package Tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestScript1 extends GenericScript
{
		@Test
		public void Login() throws InterruptedException
		{
			POMScript p=new POMScript(driver);
			p.username("admin");
					Thread.sleep(2000);
	        p.pwd("manager");
					Thread.sleep(2000);
		   p.click_btn();
			Thread.sleep(2000);
			
		}
	}