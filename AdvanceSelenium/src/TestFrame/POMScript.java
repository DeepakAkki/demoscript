package TestFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMScript 
{
//declaration
		@FindBy(xpath="//div[.='Login ']")
		private WebElement loginbtn;
		//initialization
		public POMScript(WebDriver driver)
		{
	PageFactory.initElements(driver,this);
		}
		//utilization
		public void clickLogin()
		{
			loginbtn.click();
	}}