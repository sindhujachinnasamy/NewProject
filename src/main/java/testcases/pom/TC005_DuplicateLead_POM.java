package testcases.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdmethods.testcase.Annotations;
import week6.classroom.ReadExcelWithDataProvider;

public class TC005_DuplicateLead_POM extends Annotations{
	
	@BeforeTest
	public void setValues ()
	{
		testCaseName = "Duplicate Lead";
		testDescription = "Duplicate an Existing Lead";
		excelName = "DuplicateLead";
		author = "sheeba";
		category = "sanity";
		moduleName = "Duplicate Lead";
	}
	
	@Test ( dataProvider = "fetchData")
	public void createLead (String fName, String title, String emailId ) throws InterruptedException
	{
	
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.implicitlyWait()
		.clickEmailTab()
		.typeEmailAddress(emailId)
		.clickFindLeads()
		.implicitlyWait()
		.getFirstName()
		.clickFirstResultingLead()
		.clickDuplicateLead()
		.verifyTitleOfThePage(title)
		.clickCreateLead()
		.verifyFirstName(fName);

	}
	
	
	@DataProvider ( name = "fetchData")
	public Object[][] getData() throws IOException
	{
		ReadExcelWithDataProvider excel = new ReadExcelWithDataProvider();
		return excel.readExcel("DuplicateLead");
	}

}
