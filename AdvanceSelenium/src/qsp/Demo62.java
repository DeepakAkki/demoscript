package qsp;
//to handel Alert and confirmation popup
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo62 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
Thread.sleep(2000);
driver.findElement(By.name("submit")).click();
Thread.sleep(4000);
Alert a = driver.switchTo().alert();//switch control from page to popup
Thread.sleep(4000);
String t=a.getText();
Thread.sleep(4000);
System.out.println(t);
Thread.sleep(4000);
//a.dismiss();
a.accept();
}}
