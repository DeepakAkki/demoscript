package d;

public class Listener_Class 
{
@Override
public void onTestSucess(ITestResult Result)
{
	System.out.println("tc is passed");
}
@Override
public void onTestFailure(ITestResult Result)
{
	System.out.println("tc failed capture ss");
}
@Override
public void onTestSkipped(ITestResult Result)
{
	System.out.println("tc is skipped");
}
}
