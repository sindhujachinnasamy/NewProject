package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdmethods.testcase.Annotations;

public class FindLeadsPage extends Annotations {
	
	public FindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy ( linkText= "Email")
	WebElement eleEmail;
	
	@FindBy ( name= "emailAddress")
	WebElement eleEmailAddress;
	
	@FindBy ( xpath= "//button[text()='Find Leads']")
	WebElement eleFindLeads;
	
	@FindBy ( xpath= "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	WebElement eleFirstName;
	
	@FindBy ( xpath= "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	WebElement eleFirstResultingLead;
		
	public FindLeadsPage clickEmailTab()
	{
		click(eleEmail);
		return this;
	}
	
	public FindLeadsPage implicitlyWait()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return this;
	}
	
	public FindLeadsPage typeEmailAddress(String emailId)
	{
		type(eleEmailAddress, emailId);
		return this;
	}
	
	public FindLeadsPage clickFindLeads()
	{
		click(eleFindLeads);
		return this;
	}
	
	public FindLeadsPage getFirstName()
	{
		getText(eleFirstName);
		return this;
	}
	
	public ViewLeadPage clickFirstResultingLead()
	{
		click(eleFirstResultingLead);
		return new ViewLeadPage();
	}
}
