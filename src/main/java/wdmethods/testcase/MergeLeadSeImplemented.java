package wdmethods.testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week3.day2.SeMethods;

public class MergeLeadSeImplemented extends Annotations {
@Test
	public void mergeLeads() 
	{

		WebElement leadsLink = locateElement("linkText","Leads");
		click(leadsLink);

		WebElement mergeLeads = locateElement("linkText","Merge Leads");
		click(mergeLeads);

		WebElement fromLead = locateElement("xpath","//input[@id='partyIdFrom']/following::img");
		click(fromLead);
		switchToWindow(1);
		
		WebElement leadId = locateElement("name","id");
		type(leadId,"10293");
		
		WebElement findLeads = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeads);
		
		WebElement firstLead = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickNoSnap(firstLead);
		
		switchToWindow(0);
		
		WebElement toLead = locateElement("xpath","//input[@id='partyIdTo']/following::img");
		click(toLead);
		switchToWindow(1);
		
		WebElement toLeadId = locateElement("name","id");
		type(toLeadId,"10294");
		
		WebElement toFindLeads = locateElement("xpath","//button[text()='Find Leads']");
		click(toFindLeads);
		
		WebElement firstToLead = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickNoSnap(firstToLead);
		
		switchToWindow(0);
		
		WebElement mergeButton = locateElement("linkText","Merge");
		clickNoSnap(mergeButton);
		acceptAlert();
		
		WebElement findLeadsLink = locateElement("linkText","Find Leads");
		clickNoSnap(findLeadsLink);
		
		WebElement findLeadId = locateElement("name","id");
		type(findLeadId,"10293");
		
		WebElement findLeadButton = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeadButton);
		
	}
}
