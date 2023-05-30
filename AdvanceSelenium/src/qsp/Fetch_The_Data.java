package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_The_Data
{
public static void main(String[] args)throws EncryptedDocumentException, IOException {
//Step1
FileInputStream fis=new FileInputStream("./Excel/TestData.xlsx");
//Step2
Workbook book = WorkbookFactory.create(fis);
//Step3
Sheet sheet = book.getSheet("Sheet1");
//Step4
Row row = sheet.getRow(0);
//Step5
Cell cell = row.getCell(0);
Cell cell1 = row.getCell(1);
//Sterp6
String value=cell.toString();
String value1=cell.toString();
System.out.println(value);
System.out.println(value1);
//launch facebook page
System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com");
//pass un psw and click on login
driver.findElement(By.id("email")).sendKeys(value);
driver.findElement(By.name("pass")).sendKeys(value1);
driver.findElement(By.xpath("//button[@name='login']")).click();
}}