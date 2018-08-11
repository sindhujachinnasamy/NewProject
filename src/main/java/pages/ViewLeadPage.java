package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdmethods.testcase.Annotations;

public class ViewLeadPage extends Annotations {
	
	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy ( id= "viewLead_firstName_sp")
	WebElement eleViewFirstName;
	
	@FindBy ( id= "viewLead_companyName_sp")
	WebElement eleViewCompanyName;
	
	@FindBy ( linkText= "Duplicate Lead")
	WebElement eleDuplicateLead;

	@FindBy ( linkText= "Edit")
	WebElement eleEdit;
	
	public ViewLeadPage verifyFirstName(String fName)
	{
		verifyExactText(eleViewFirstName, fName);
		return this;
	}
	
	public ViewLeadPage verifyCompanyName(String cName)
	{
		verifyPartialText(eleViewCompanyName, cName);
		return this;
	}
	
	public DuplicateLeadPage clickDuplicateLead()
	{
		click(eleDuplicateLead);
		return new DuplicateLeadPage();
	}
	
	public EditLeadPage clickEditLead()
	{
		click(eleEdit);
		return new EditLeadPage();
	}
	
	public ViewLeadPage verifyPageTitle(String expectedTitle)
	{
		boolean value = verifyTitle(expectedTitle);
		return this;
	}
}

/*if ( driver.getTitle().equals("View Lead | opentaps CRM"))
	System.out.println("Title of the Page is Verified");
else
	System.out.println("Title of the Page is NOT Verified");

driver.findElementByLinkText("Edit").click();*/

/*if (driver.findElementById("viewLead_companyName_sp").getText().contains(newCompanyName))
	System.out.println("New Company Name is updated properly");
else
	System.out.println("new Comapny Name is NOT updated in the UI");*/