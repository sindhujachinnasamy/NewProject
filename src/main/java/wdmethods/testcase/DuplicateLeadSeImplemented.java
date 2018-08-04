package wdmethods.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import week3.day2.SeMethods;

public class DuplicateLeadSeImplemented extends Annotations{
	@Test
	public void duplicateLead() throws InterruptedException
	{
	
		WebElement leadsLink = locateElement("linkText","Create Lead");
		click(leadsLink);
		
		click(locateElement("linkText","Find Leads"));

	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//	driver.findElementByXPath("(//input[@name=\"firstName\"])[3]").sendKeys("Sheeba M");
		
		click(locateElement("linkText","Email"));
		
		type(locateElement("name","emailAddress"),"sheeba.suja@gmail.com");
	
	//	driver.findElementByLinkText("Find Leads").click();

	//	driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(3000);
	String firstName = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
	System.out.println(firstName);
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();

	driver.findElementByLinkText("Duplicate Lead").click();

	if ( driver.getTitle().contains("Duplicate Lead"))
		System.out.println("Title of the Page is Verified as Duplicate Lead");
	else
		System.out.println("Title of the Page is NOT Duplicate Lead");

	driver.findElementByName("submitButton").click();

	if ( driver.findElementById("viewLead_firstName_sp").getText().equals(firstName))
		System.out.println("Duplicated Lead Name is same as Captured Name");
	else
		System.out.println("Duplicated Lead Name is NOT same as Captured Name");
	driver.close();

	}
}
