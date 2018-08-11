package testcases.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdmethods.testcase.Annotations;
import week6.classroom.ReadExcelWithDataProvider;

public class TC003_EditLead_POM extends Annotations{
	
	@BeforeTest
	public void setValues ()
	{
		testCaseName = "Edit Lead";
		testDescription = "Edit an Existing Lead";
		excelName = "EditLead";
		author = "sindu";
		category = "smoke";
		moduleName = "Edit Lead";
	}
	
	@Test ( dataProvider = "fetchData")
	public void createLead (String fName, String expectedTitle, String cName ) throws InterruptedException
	{
	
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.implicitlyWait()
		.typeFirstName(fName)
		.clickFindLeads()
		.implicitlyWait()
		.clickFirstResultingLead()
		.verifyPageTitle(expectedTitle)
		.clickEditLead()
		.enterNewCompanyName(cName)
		.clickUpdate()
		.verifyCompanyName(cName);

	}
	
	
	@DataProvider ( name = "fetchData")
	public Object[][] getData() throws IOException
	{
		ReadExcelWithDataProvider excel = new ReadExcelWithDataProvider();
		return excel.readExcel("EditLead");
	}

}
