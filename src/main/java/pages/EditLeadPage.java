package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdmethods.testcase.Annotations;

public class EditLeadPage extends Annotations {
	
	public EditLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy (id= "updateLeadForm_companyName")
	WebElement eleCompanyName;
	
	@FindBy ( name= "submitButton")
	WebElement eleUpdate;
	
	public EditLeadPage enterNewCompanyName(String cName)
	{
		eleCompanyName.clear();
		type(eleCompanyName,cName);
		return this;
	}
	
	public ViewLeadPage clickUpdate()
	{
		click(eleUpdate);
		return new ViewLeadPage();
	}
	
}

/*driver.findElementById("updateLeadForm_companyName").clear();
String newCompanyName = "FreshDesk";
driver.findElementById("updateLeadForm_companyName").sendKeys(newCompanyName);

driver.findElementByName("submitButton").click();
*/