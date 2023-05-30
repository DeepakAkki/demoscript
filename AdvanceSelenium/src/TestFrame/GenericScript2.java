package TestFrame;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GenericScript2 
{
@Test(enabled=false)
public void date1()
{
	Reporter.log("1",true);
}
@Test
public void date2()
{
	Reporter.log("2",true);
}
}