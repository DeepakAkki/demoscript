package qsp;
//3 method Frame pass i/d
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo60 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/11/mainpage.html");
Thread.sleep(2000);
driver.findElement(By.id("a1")).sendKeys("abc");
//driver.switchTo().frame(0);//index valvue start from0
driver.switchTo().frame("f1");//id of frame
//WebElement ele=driver.findElement(By.id("f1"));//find ele by pass address
//driver.switchTo().frame(ele);
Thread.sleep(2000);
driver.findElement(By.id("b1")).sendKeys("zzz ");
}}
//<html>
//<body>
//UN:<input type="text" id="a1"><br><br>
//<iframe src="subframe.html" id="f1">
//</body>
//</html>
//<html>
//<body>
//PWD:<input type="text" id="b1">
//</body>
//</html>


















