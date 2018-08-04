package testcases.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdmethods.testcase.Annotations;
import week6.classroom.ReadExcelWithDataProvider;

public class TC001_CreateLead_POM extends Annotations{
	
	@BeforeTest
	public void setValues ()
	{
		testCaseName = "CreateLead";
		testDescription = "Create a New Lead";
		excelName = "CreateLead";
		author = "sheeba";
		category = "sanity";
		moduleName = "Create Lead";
	}
	
	@Test ( dataProvider = "fetchData")
	public void createLead (String cName, String fName, String lName, String ph, String email ) throws InterruptedException
	{
	
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.typePhoneNumber(ph)
		.typeEmailId(email)
		.clickSubmitCreateLead()
		.verifyFirstName(fName);
		
	}
	
	
	@DataProvider ( name = "fetchData")
	public Object[][] getData() throws IOException
	{
		ReadExcelWithDataProvider excel = new ReadExcelWithDataProvider();
		return excel.readExcel("CreateLead");
	}

}
