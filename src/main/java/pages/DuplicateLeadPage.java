package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdmethods.testcase.Annotations;

public class DuplicateLeadPage extends Annotations {
	
	public DuplicateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy ( name= "submitButton")
	WebElement eleCreateLeadButton;
	
	
	public ViewLeadPage clickCreateLead()
	{
		click(eleCreateLeadButton);
		return new ViewLeadPage();
	}
	
	public DuplicateLeadPage verifyTitleOfThePage(String title)
	{
		verifyTitle(title);
		return this;
	}
}
