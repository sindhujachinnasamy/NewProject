package week6.classroom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

public class EditLeadWithReports extends Annotations{
	
	@BeforeTest
	public void setValues ()
	{
		testCaseName = "EditLead";
		testDescription = "Edit the Existing Lead";
		excelName = "EditLead";
		author = "Sindu";
		category = "smoke";
		moduleName = "Edit Lead";
	}
	
	@Test ( dataProvider = "fetchData")
	public void editLead (String fName, String companyName) throws InterruptedException
	{
	

		WebElement leadsLink = locateElement("linkText","Create Lead");
		click(leadsLink);
		
		click(locateElement("linkText","Find Leads"));

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		type(locateElement("xpath","//input[@name=\\\"firstName\\\"])[3]"),fName);
		
		click(locateElement("xpath","//button[text()='Find Leads']"));

		Thread.sleep(3000);
		
		driver.findElementByXPath("(//input[@name='firstName'])[2]").sendKeys(fName);
		
	//	type(locateElement("xpath","(//input[@name='firstName'])[2]"),fName);
		
		System.out.println(fName);
		
		Thread.sleep(3000);
		
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		
		verifyTitle("View Lead | opentaps CRM");

		click(locateElement("linkText","Edit"));
		
		driver.findElementById("updateLeadForm_companyName").clear();
		
		// String newCompanyName = "FreshDesk";
		
		type(locateElement("id","updateLeadForm_companyName"),companyName);

		click(locateElement("name","submitButton"));
		
		System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
		
		verifyPartialText(locateElement("name","submitButton"), companyName);

		closeBrowser();		
	}
	
	
	
}

