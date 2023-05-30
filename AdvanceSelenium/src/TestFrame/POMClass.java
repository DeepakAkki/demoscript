package TestFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass 
{
	//declaration
	@FindBy(id="email")
	private WebElement usname;
	@FindBy(name="pass")
	private WebElement pass;
	@FindBy(xpath="//button[@name='login']")
	private WebElement lgn_btn;
	//initialization
	public POMClass(WebDriver driver)
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
		lgn_btn.click();
	}}