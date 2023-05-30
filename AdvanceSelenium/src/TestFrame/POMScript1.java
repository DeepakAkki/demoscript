package TestFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMScript1 
{
	//declaration
	@FindBy(name="username")
	private WebElement unTbox;
	@FindBy(name="pwd")
	private WebElement pwdTbox;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;
	//initialization
	public POMScript1(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	//utilization
	public void unData(String un)
	{
		unTbox.sendKeys(un);
	}
	public void pwdData(String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	public void clicklogin()
	{
		loginbtn.click();
	}}