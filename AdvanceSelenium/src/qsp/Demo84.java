package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Demo84 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.titleContains("Men"));
	driver.findElement(By.xpath("//a[.='Men']")).click();
	driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/w_98,c_limit,fl_progressive,dpr_2.0/assets/images/2023/5/5/18687e42-8636-4133-9be1-34d5eab75b5a1683271842727-Tshirts_Starting_199_-499-_M-H-_Moda_-_More.png']")).click();
	driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/2221361/2022/3/23/dde188cc-384b-455d-a732-44b89dde53171648039300291-Moda-Rapido-Men-Maroon--Black-Colourblocked-Cotton-T-shirt-7-1.jpg']")).click();
	WebDriverWait wait1=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.titleContains("size-buttons-unified-size"));
	}}