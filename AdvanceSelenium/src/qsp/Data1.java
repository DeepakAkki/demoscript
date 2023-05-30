package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Data1 
//{
//@Test
//public void test1() throws FileNotFoundException, IOException
//{
//	//step1
//	Properties p=new Properties();
//	//step2
//	p.load(new FileInputStream("./p.properties"));
//	//step3
//	String val=p.getProperty("id");
//	System.out.println(val);
//}}
@Test
public void data(String path,String Key) throws FileNotFoundException, IOException
{
	//step1
	Properties p=new Properties();
	//step2
	p.load(new FileInputStream(path));
	//step3
	String val=p.getProperty(Key);
	System.out.println(val);
}}