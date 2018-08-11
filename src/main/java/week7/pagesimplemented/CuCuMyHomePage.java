package week7.pagesimplemented;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdmethods.testcase.Annotations;

public class CuCuMyHomePage extends Annotations {
	
	public CuCuMyHomePage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy ( linkText= "Leads")
	WebElement eleLeads;
	@And("click on Leads")
	public MyLeadsPage clickLeads()
	{
		click(eleLeads);
		return new MyLeadsPage();
	}
}

