package wdmethods.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	// Program to execute the testcase "Edit Lead" given in the Test case.xlsx sheet ( under Sheeba\MyStuffs\TestLeaf )

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();

		driver.findElementByLinkText("Find Leads").click();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByXPath("(//input[@name=\"firstName\"])[3]").sendKeys("Sheeba M");

		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(3000);
		//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();

		if ( driver.getTitle().equals("View Lead | opentaps CRM"))
			System.out.println("Title of the Page is Verified");
		else
			System.out.println("Title of the Page is NOT Verified");

		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		String newCompanyName = "FreshDesk";
		driver.findElementById("updateLeadForm_companyName").sendKeys(newCompanyName);

		driver.findElementByName("submitButton").click();
		
		System.out.println(newCompanyName);
		System.out.println(driver.findElementById("viewLead_companyName_sp").getText());

		if (driver.findElementById("viewLead_companyName_sp").getText().contains(newCompanyName))
			System.out.println("New Company Name is updated properly");
		else
			System.out.println("new Comapny Name is NOT updated in the UI");
		driver.close();


	}

}
