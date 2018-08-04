package wdmethods.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import week3.day2.SeMethods;

public class EditLeadSeImplemented extends Annotations{
	
	@Test  
	public void editLead () throws InterruptedException
	{
		startApp("chrome","http://leaftaps.com/opentaps");

		WebElement userId = locateElement("id","username");
		type(userId,"DemoSalesManager");

		WebElement password = locateElement("id","password");
		type(password,"crmsfa");

		WebElement login = locateElement("class","decorativeSubmit");
		click(login);

		WebElement crmsLink = locateElement("linkText","CRM/SFA");
		click(crmsLink);

		WebElement leadsLink = locateElement("linkText","Create Lead");
		click(leadsLink);
		
		click(locateElement("linkText","Find Leads"));

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		type(locateElement("xpath","//input[@name=\\\"firstName\\\"])[3]"),"Sheeba M");
		
		click(locateElement("xpath","//button[text()='Find Leads']"));

		Thread.sleep(3000);
		
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		
		verifyTitle("View Lead | opentaps CRM");

		click(locateElement("linkText","Edit"));
		
		driver.findElementById("updateLeadForm_companyName").clear();
		
		String newCompanyName = "FreshDesk";
		
		type(locateElement("id","updateLeadForm_companyName"),newCompanyName);

		click(locateElement("name","submitButton"));
		
		System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
		
		verifyPartialText(locateElement("name","submitButton"), newCompanyName);

		closeBrowser();
	}
	
}
