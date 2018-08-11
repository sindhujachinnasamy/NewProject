package week7.pagesimplemented;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
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
	
	@And ("Enter the CompanyName")
	public CreateLeadPage typeCompanyName(String cName)
	{
		type(eleCompanyName,cName);
		return this;
	}
	@And ("Enter the FirstName")
	public CreateLeadPage typeFirstName(String fName)
	{
		type(eleFirstName,fName);
		return this;
	}
	@And ("Enter the LastName")
	public CreateLeadPage typeLastName(String lName)
	{
		type(eleLastName,lName);
		return this;
	}
	@And ("Enter the phoneNumber")
	public CreateLeadPage typePhoneNumber(String ph)
	{
		type(elePhoneNumber,ph);
		return this;
	}
	@And ("Enter the mail Id")
	public CreateLeadPage typeEmailId(String email)
	{
		type(eleEmail,email);
		return this;
	}
	@When ("click CreateLeadButton")
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


