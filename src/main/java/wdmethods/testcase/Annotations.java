package wdmethods.testcase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;

import week3.day2.SeMethods;
import week6.classroom.ReadExcelWithDataProvider;
import week6.classroom.SeMethodsWithReports;

public class Annotations extends SeMethodsWithReports{
	@BeforeSuite
	public void startReport()
	{
		beginResult();
	}
	
	@BeforeClass
	public void beginTest()
	{
		startTest( testCaseName, testDescription);
	}
	
	@Parameters ({"url","pwd","username"})
	@BeforeMethod
	public void openApp (String url,String pwd, String username)
	{
		startTestIteration( author, category, moduleName);
		
		startApp("chrome","http://leaftaps.com/opentaps");

		WebElement userId = locateElement("id","username");
		type(userId,"DemoSalesManager");

		WebElement password = locateElement("id","password");
		type(password,"crmsfa");

		WebElement login = locateElement("class","decorativeSubmit");
		click(login);

		WebElement crmsLink = locateElement("linkText","CRM/SFA");
		click(crmsLink);
		
	}
	
	@AfterMethod
	public void browserClose()
	{
		closeBrowser();
	}
	
	@DataProvider ( name = "fetchData")
	public Object[][] getData() throws IOException
	{
		ReadExcelWithDataProvider excel = new ReadExcelWithDataProvider();
		return excel.readExcel(excelName);
	}
	
	@AfterSuite
	public void closeReport()
	{
		endResult();
	}
}
