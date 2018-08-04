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
	
	@FindBy ( linkText= "Duplicate Lead")
	WebElement eleDuplicateLead;
	
	public ViewLeadPage verifyFirstName(String fName)
	{
		verifyExactText(eleViewFirstName, fName);
		return this;
	}
	
	public DuplicateLeadPage clickDuplicateLead()
	{
		click(eleDuplicateLead);
		return new DuplicateLeadPage();
	}
}
