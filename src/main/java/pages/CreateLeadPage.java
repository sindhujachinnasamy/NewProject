package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdmethods.testcase.Annotations;

public class CreateLeadPage extends Annotations {
	
	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy ( id= "createLeadForm_companyName")
	WebElement eleCompanyName;
	
	@FindBy ( id= "createLeadForm_firstName")
	WebElement eleFirstName;
	
	@FindBy ( id= "createLeadForm_lastName")
	WebElement eleLastName;
	
	@FindBy ( id= "createLeadForm_primaryPhoneNumber")
	WebElement elePhoneNumber;
	
	@FindBy ( id= "createLeadForm_primaryEmail")
	WebElement eleEmail;

	@FindBy ( name= "submitButton")
	WebElement eleSubmit;
	
	@FindBy( className ="errorList")
	WebElement eleErrorMessage;
	
	public CreateLeadPage typeCompanyName(String cName)
	{
		type(eleCompanyName,cName);
		return this;
	}
	
	public CreateLeadPage typeFirstName(String fName)
	{
		type(eleFirstName,fName);
		return this;
	}
	
	public CreateLeadPage typeLastName(String lName)
	{
		type(eleLastName,lName);
		return this;
	}
	
	public CreateLeadPage typePhoneNumber(String ph)
	{
		type(elePhoneNumber,ph);
		return this;
	}
	
	public CreateLeadPage typeEmailId(String email)
	{
		type(eleEmail,email);
		return this;
	}
	
	public ViewLeadPage clickSubmitCreateLead()
	{
		click(eleSubmit);
		return new ViewLeadPage();
	}
	
	public CreateLeadPage clickSubmitForFailure()
	{
		click(eleSubmit);
		return this;
	}
	
	public CreateLeadPage verifyErrorMessage(String expectedError)
	{
		verifyPartialText(eleErrorMessage, expectedError);
		return this;
	}
}
