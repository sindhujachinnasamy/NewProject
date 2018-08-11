package week7.pagesimplemented;

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
	
	@FindBy ( xpath= "(//span[@class='x-tab-strip-text '])[2]")
	WebElement elePhone;
	
	@FindBy ( name= "phoneNumber")
	WebElement elePhoneNumber;
	
	@FindBy ( xpath= "(//input[@name='firstName'])[3]")
	WebElement eleEnterFirstName;
	
	@FindBy ( xpath= "//button[text()='Find Leads']")
	WebElement eleFindLeads;
	
	@FindBy ( xpath= "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	WebElement eleGetFirstName;
	
	@FindBy ( xpath= "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	WebElement eleFirstResultingLead;
		
	public FindLeadsPage clickEmailTab()
	{
		click(eleEmail);
		return this;
	}
	
	public FindLeadsPage clickPhoneTab()
	{
		click(elePhone);
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
	
	public FindLeadsPage typePhoneNumber(String ph)
	{
		type(elePhoneNumber, ph);
		return this;
	}
	
	public FindLeadsPage typeFirstName(String fName)
	{
		type(eleEnterFirstName, fName);
		return this;
	}
	
	public FindLeadsPage clickFindLeads()
	{
		click(eleFindLeads);
		return this;
	}
	
	public FindLeadsPage getFirstName()
	{
		getText(eleGetFirstName);
		return this;
	}
	
	public ViewLeadPage clickFirstResultingLead()
	{
		click(eleFirstResultingLead);
		return new ViewLeadPage();
	}
}

/*driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
driver.findElementByName("phoneNumber").sendKeys("1234");

driver.findElementByXPath("//button[text()='Find Leads']").click();
Thread.sleep(3000);

String leadId = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();*/
