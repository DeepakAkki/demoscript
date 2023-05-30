package TestFrame;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 
{
@Test
public void Compose()
{
	Reporter.log("Compose",true);
}
@Test(dependsOnMethods="Compose")
public void sentItem()
{
	Reporter.log("senditem",true);
	Assert.fail();
}
@Test(dependsOnMethods="sentItem")
public void trash()
{
	Reporter.log("trash",true);
}
}