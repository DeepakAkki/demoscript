package qsp;
//3 frame
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo61d 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/11/New%20folder/mainpage.html");
Thread.sleep(2000);
driver.findElement(By.id("a1")).sendKeys("1");
driver.switchTo().frame(0);//a-b
Thread.sleep(2000);
driver.findElement(By.id("b1")).sendKeys("2 ");
driver.switchTo().frame(0);//b-c
Thread.sleep(2000);
driver.findElement(By.id("C1")).sendKeys("3 ");
driver.switchTo().frame(0);
Thread.sleep(2000);
driver.switchTo().defaultContent();//c-a
driver.findElement(By.id("a1")).sendKeys("4");
driver.switchTo().frame(0);//a-b
driver.findElement(By.id("b1")).sendKeys("5 ");
driver.switchTo().parentFrame();//b-a
driver.findElement(By.id("a1")).sendKeys("6");
driver.switchTo().frame(0);//a-c
driver.switchTo().frame(0);
driver.findElement(By.id("C1")).sendKeys("7 ");
driver.switchTo().defaultContent();//c-a
driver.findElement(By.id("a1")).sendKeys("8");
}}
//<html> <body> UN:<input type="text" id="a1"><br><br>
//<iframe src="subframe.html" id="f1"> </body> </html>
//Subframe
//<html><body> PWD:<input type="text" id="b1"><br><br> <iframe src="subframe1.html" id="f2"> </body> </html>
//Subframe1 <html> <body> Reset:<input type="text" id="c1">
//<iframe src="subframe2.html" id="f2"> </body> </html>
//Subframe2 <html> <body> Reset:<input type="text" id="d1"> </body> </html>
