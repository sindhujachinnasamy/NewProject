package testcases.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdmethods.testcase.Annotations;
import week6.classroom.ReadExcelWithDataProvider;

public class TC002_CreateLeadNEG_POM extends Annotations{
	
	@BeforeTest
	public void setValues ()
	{
		testCaseName = "CreateLeadFailure";
		testDescription = "Create a New Lead";
		excelName = "CreateLeadNEG";
		author = "sheeba";
		category = "sanity";
		moduleName = "Create Lead";
	}
	
	@Test ( dataProvider = "fetchData")
	public void createLead (String cName, String fName, String lName, String expectedError ) throws InterruptedException
	{
	
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickSubmitForFailure()
		.verifyErrorMessage(expectedError);
		
	}
	
	
	@DataProvider ( name = "fetchData")
	public Object[][] getData() throws IOException
	{
		ReadExcelWithDataProvider excel = new ReadExcelWithDataProvider();
		return excel.readExcel("CreateLeadNEG");
	}

}
