package wdmethods.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week3.day2.SeMethods;

public class CreateLeadSeImplemented extends Annotations{
	
	@Test ( dataProvider = "fetchData")
	public void createLead (String cName, String fName, String lName ) throws InterruptedException
	{

		WebElement leadsLink = locateElement("linkText","Create Lead");
		click(leadsLink);
		
		type(locateElement("id","createLeadForm_companyName"),cName);

		String name = "Sheeba M";
		
		type(locateElement("id","createLeadForm_firstName"),name);
		
		type(locateElement("id","createLeadForm_lastName"),"Karthik");
		
		type(locateElement("id","createLeadForm_firstNameLocal"),"Rajee");
		
		type(locateElement("id","createLeadForm_lastNameLocal"),"M Karthik");

		type(locateElement("id","createLeadForm_personalTitle"),"Mrs");

		Select source = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		source.selectByVisibleText("Website");

		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Test Lead");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("3");

		Select industry = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		industry.selectByVisibleText("Computer Software");

		Select ownerShip = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		ownerShip.selectByVisibleText("Partnership");

		driver.findElementById("createLeadForm_sicCode").sendKeys("600129");
		driver.findElementById("createLeadForm_description").sendKeys("New to Testleaf");
		driver.findElementById("createLeadForm_importantNote").sendKeys("June Batch 2018");

		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("044");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Bio-Medical");

		Select preferredCurrency = new Select(driver.findElementById("createLeadForm_currencyUomId"));
		preferredCurrency.selectByVisibleText("INR - Indian Rupee");

		driver.findElementById("createLeadForm_numberEmployees").sendKeys("3");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Love");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Balaji");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("testLeaf.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Sheeba");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Chennai");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Nagercoil");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");

		Select province = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		province.selectByVisibleText("Indiana");

		Select country = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
		country.selectByVisibleText("India");
		
		Thread.sleep(2000);
		Select state = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		state.selectByVisibleText("TAMILNADU");

		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600129");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("600");

		Select marketingCampaign = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		marketingCampaign.selectByVisibleText("Automobile");

		driver.findElementById("createLeadForm_primaryEmail").sendKeys("sheeba.suja@gmail.com");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8220322790");

		driver.findElementByName("submitButton").click();

		if (driver.findElementById("viewLead_firstName_sp").getText().equals(name))
		{
			System.out.println("FirstName is Verified");
		}
		else
		{
			System.out.println("FirstName is different");
		}

	}
	
	@DataProvider ( name = "fetchData")
	public Object[][] getData()
	{
		Object[][] data = new Object[1][3];
		
		data[0][0] = "IBM";
		data[0][1] = "Sheeba M";
		data[0][2] = "Karthik";
		
		return data ;
	}
	
}
