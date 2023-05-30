package Tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMScript 
{
		//declaration
		@FindBy(id="username")
		private WebElement usname;
		@FindBy(name="pwd")
		private WebElement pass;
		@FindBy(xpath="//div[.='Login ']")
		private WebElement lginBtn;
		@FindBy(xpath="//div[.='Tasks']")
		private WebElement Tsk;
		@FindBy(xpath="//div[.='Reports']")
		private WebElement Rep;
		@FindBy(id="logoutLink")
		private WebElement lout;
		//initialization
		public POMScript(WebDriver driver)
		{
		PageFactory.initElements(driver,this);
		}
		//utilization
		public void username(String data)
		{
			usname.sendKeys(data);
		}
		public void pwd(String data1)
		{
			pass.sendKeys(data1);
		}
		public void click_btn()
		{
			lginBtn.click();
		}
		public void click_tsk()
		{
					Tsk.click();
		}
		public void click_rep()
		{
					Rep.click();
		}
		public void click_lout()
		{
					lout.click();
		}}


