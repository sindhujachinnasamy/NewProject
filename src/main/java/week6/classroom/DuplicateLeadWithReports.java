package week6.classroom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdmethods.testcase.Annotations;
import week3.day2.SeMethods;

public class DuplicateLeadWithReports extends Annotations{
	
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
	
		WebElement leadsLink = locateElement("linkText","Create Lead");
		click(leadsLink);
		
		type(locateElement("id","createLeadForm_companyName"),cName);
		
		type(locateElement("id","createLeadForm_firstName"),fName);
		
		type(locateElement("id","createLeadForm_lastName"),lName);
		
		type(locateElement("id","createLeadForm_primaryPhoneNumber"),ph);
		
		type(locateElement("id","createLeadForm_primaryEmail"),email);
		
		driver.findElementByName("submitButton").click();
		
	}
	
	
	
}

