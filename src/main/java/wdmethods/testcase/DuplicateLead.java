package wdmethods.testcase;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.chrome.ChromeDriver;

	public class DuplicateLead {
		public static void main(String[] args) throws InterruptedException {
			// Program to execute the testcase "Delete Lead" given in the Test case.xlsx sheet ( under Sheeba\MyStuffs\TestLeaf )
			System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\TL\\Software\\drivers\\chromedriver.exe");
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

			driver.findElementByLinkText("Email").click();
			driver.findElementByName("emailAddress").sendKeys("sheeba.suja@gmail.com");
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




