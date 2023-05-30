package TestFrame;

import org.testng.annotations.Test;

public class RunnerClass extends Script
{
	
		@Test
		public void validlogin() throws InterruptedException
		{
		POMClass p= new POMClass(driver);
		p.username("qsp");
		Thread.sleep(2000);
		p.pwd("rajaji");
		Thread.sleep(2000);
		p.click_btn();
		Thread.sleep(6000);
		}
}