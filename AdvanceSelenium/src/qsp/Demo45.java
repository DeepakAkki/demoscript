package qsp;
//Select and deselect mutiple option 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo45 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/10/hotel.html");
WebElement ele=driver.findElement(By.id("maruthi hotel"));
Select s=new Select(ele);
s.selectByIndex(1);
Thread.sleep(2000);
s.selectByValue("l");
Thread.sleep(2000);
s.selectByVisibleText("paneer dry");
Thread.sleep(2000);
s.deselectAll();
}}
//<html>
//<body>
//<select id="maruthi hotel" multiple>
//<option value="i">mutton biriyani</option>
//<option value="j">chicken kabab</option>
//<option value="k">thale mamsa</option>
//<option value="l">mushroom fry</option>
//<option value="m">paneer dry</option>
//<option value="n">kall soup</option>
//</select>
//</body>
//</html>