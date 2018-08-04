package wdmethods.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		// Program to execute the testcase "Duplicate Lead" given in the Test case.xlsx sheet ( under Sheeba\MyStuffs\TestLeaf )
		System.setProperty("webdriver.chrome.driver","E:\\TestLeaf\\TL\\Software\\drivers\\chromedriver.exe");
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
		
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		driver.findElementByName("phoneNumber").sendKeys("1234");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		
		String leadId = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		driver.findElementByLinkText("Delete").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByName("id").sendKeys(leadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		System.out.println(driver.findElementByXPath("//div[@class='x-paging-info']").getText());
		
		if ( driver.findElementByXPath("//div[text()='No records to display']").getText().equals("No records to display"))
			System.out.println("Error message is verified");
		else
			System.out.println("Error message is NOT verified");
	//	driver.close();
		
		
		
	//	driver.findElementByXPath("//button[text()='Find Leads']").click();
	}
}




