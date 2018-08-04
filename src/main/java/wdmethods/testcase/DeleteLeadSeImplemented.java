package wdmethods.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import week3.day2.SeMethods;

public class DeleteLeadSeImplemented extends Annotations{
	
	@Test
	public void deleteLead () throws InterruptedException
	{

		WebElement leadsLink = locateElement("linkText","Create Lead");
		click(leadsLink);

		click(locateElement("linkText","Find Leads"));

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		click(locateElement("linkText","Phone"));
		
	//	driver.findElementByLinkText("Phone").click();
		type(locateElement("name","phoneNumber"),"8220322790");
	//	driver.findElementByName("phoneNumber").sendKeys("8220322790");
		
		click(locateElement("linkText","Find Leads"));
	//	driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		driver.findElementByLinkText("Delete Lead").click();

	}
}
