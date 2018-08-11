package week7.pagesimplemented;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdmethods.testcase.Annotations;

public class MyLeadsPage extends Annotations {
	
	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy ( linkText= "Create Lead")
	WebElement eleCreateLead;
	
	@FindBy ( linkText= "Find Leads")
	WebElement eleFindLeads;
	
	@And ("click on CreateLead")
	public CreateLeadPage clickCreateLead()
	{
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLeads()
	{
		click(eleFindLeads);
		return new FindLeadsPage();
	}
	
}



