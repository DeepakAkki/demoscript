package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allinone 
{
public static void main(String[] args) throws InterruptedException 
{
String key="webdriver.chrome.driver";
String value="./Software/chromedriver.exe";
System.setProperty(key,value);
ChromeDriver driver=new ChromeDriver();
}
String key="webdriver.gecko.driver";
String value="./Software/geckodriver.exe";
System.setProperty(key,value);
FirefoxDriver driver=new FirefoxDriver();
}
use key1 and value1 to both browser to launch
Thread.sleep(2000);driver.quit();driver.close();
}
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.get("https://www.facebook.com");	
String title=driver.getTitle();
System.out.println(title);
String url=driver.getCurrentUrl();
System.out.println(url);
String src=driver.getPageSource();
System.out.println(src);		
}
<html>
<head>
<title>Qspiders</title>
</head>
<body>
UN:<input type="text"><br>
pwd:<input type="password"><br>
cbox:<input type="checkbox"><br>
radio:<input type="radio"><br>
<input type="button" value="submit"><br>
<a href="http://www.google.com">google</a>
</body>
</html>
driver.findElement(By.tagName("a")).click();
driver.findElement(By.id("a1")).click();
driver.findElement(By.name("n1")).click();
driver.findElement(By.className("c1")).click();
<html>
<body>
<a id="a1" name="n1" class="c1"
href="http://www.facebook.com">facebook</a>
</body>
</html>
}
driver.findElement(By.tagName("input")).sendKeys("Selenium");
driver.findElement(By.id("a1")).sendKeys("Selenium");
driver.findElement(By.name("n1")).sendKeys("Selenium");
driver.findElement(By.className("c1")).sendKeys("Selenium");
}}						
<html>
<body>
UN:<input type="text" id="a1" name="n1" class="c1">
</body>
</html>
driver.findElement(By.tagName("input")).clear();
driver.findElement(By.id("a1")).clear();
driver.findElement(By.name("n1")).clear();
driver.findElement(By.className("c1")).clear();
}}						
<html>
<body>
UN:<input type="text" id="a1" name="n1" class="c1" value="hello">
</body>
</html>	
driver.get("https://www.facebook.com");
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys("deepakakki");
Thread.sleep(2000);
driver.findElement(By.name("pass")).sendKeys("dondondon32");
Thread.sleep(2000);
driver.findElement(By.name("login")).click();
}		
driver.findElement(By.linkText("google")).click();
driver.findElement(By.partialLinkText("goo")).click();						
}
driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf");
Thread.sleep(5000);
driver.findElement(By.cssSelector("button[]")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
}
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Deepak");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Deepu");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@name='login']")).click();
}
X-path by using attributes FB pwd--<input id="pass" type="password">
---//input[@id='pass']
X-path by using multiple attributes FB pwd----//input[@id='pass'and @ type='password']
X-path by using text() gmail signin //span[text()='next']---no attribute, locator matching multiple element
text along with attribute also ok
Handling partial dynamic element-----//tag[contains(text(),'tv')]



















