package Tc;

import org.testng.annotations.Test;

public class TestScript3 extends GenericScript
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
		 p.click_tsk();
			Thread.sleep(2000);
			 p.click_rep();
				Thread.sleep(2000);
				 p.click_lout();
					Thread.sleep(2000);
		
	}
}