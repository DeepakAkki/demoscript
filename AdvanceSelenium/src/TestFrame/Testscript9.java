package TestFrame;

import org.testng.annotations.Test;

public class Testscript9 
{
@Test(groups= {"sanity"})
public void test11()
{
	System.out.println("hello india");
}
@Test (groups= {"sanity","smoke"})
public void test2()
{
	System.out.println("hello asia");
}
@Test (groups= {"smoke"})
public void test3()
{
	System.out.println("hello world");
}
}
