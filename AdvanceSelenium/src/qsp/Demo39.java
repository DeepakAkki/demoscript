package qsp;
//Select and unselect 10 check box
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo39 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Selenium/Sorce%20code/9/chechbox10.html");
Thread.sleep(2000);
List<WebElement>cbox=driver.findElements(By.xpath("//input"));
int count=cbox.size();
System.out.println(count);
for(int i=0;i<count;i++)
{
	WebElement w=cbox.get(i);
	w.click();
	Thread.sleep(1000);
}
for(int i=count-1;i>=0;i--)
{
	WebElement w=cbox.get(i);
	w.click();
	Thread.sleep(1000);
}}}
//<html>
//<body>
//<input type="checkbox">1<br>
//<input type="checkbox">2<br>
//<input type="checkbox">3<br>
//<input type="checkbox">4<br>
//<input type="checkbox">5<br>
//<input type="checkbox">6<br>
//<input type="checkbox">7<br>
//<input type="checkbox">8<br>
//<input type="checkbox">9<br>
//<input type="checkbox">10<br>
//</body>
//</html>