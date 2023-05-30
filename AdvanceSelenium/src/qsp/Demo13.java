package qsp;
//Source code with all types of clear data
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver",
"./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/2/defaultext%20clear%20hello.html");
Thread.sleep(2000);
driver.findElement(By.tagName("input")).clear();
//driver.findElement(By.id("a1")).clear();
//driver.findElement(By.name("n1")).clear();
//driver.findElement(By.className("c1")).clear();
}}						
//<html>
//<body>
//UN:<input type="text" id="a1" name="n1" class="c1" value="hello">
//</body>
//</html>