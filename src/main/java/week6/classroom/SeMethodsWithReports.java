package week6.classroom;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import week3.day2.WdMethods;

public class SeMethodsWithReports extends Repor implements WdMethods{
	public static RemoteWebDriver driver ;
	int i = 1;
	
	@Override
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				 System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\TL\\Software\\drivers\\chromedriver.exe");
				 driver = new ChromeDriver();			
			} else if (browser.equalsIgnoreCase("firefox")) {
				// System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				 driver = new FirefoxDriver();		
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			reportStep("The Browser "+browser+" is Launched Successfully","pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			reportStep("The Browser "+browser+" is NOT Launched","fail");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("The Browser "+browser+" is NOT Launched","fail");
			throw new RuntimeException();
		}finally {
		// takeSnap();
		}
		
	}

	@Override
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);	
			case "linkText" : return driver.findElementByLinkText(locValue);
			case "name" : return driver.findElementByName(locValue);
			}
		} catch (NoSuchElementException e) {
			
			System.err.println("NosuchElementExc occured");
		}catch (WebDriverException e ) {
			System.err.println("Exception occured");
		}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
		
	}

	@Override
	public void type(WebElement ele, String data) {
		try {
		ele.sendKeys(data);
		reportStep("The Data "+data+" is Entered Successfully","pass");
		takeSnap();
		}catch ( Exception e)
		{
			reportStep("The Data "+data+" is NOT Entered","fail");
		}
		
	}

	@Override
	public void click(WebElement ele) {
		try {
			ele.click();
			reportStep("The Element "+ele+" is clicked Successfully","pass");
			takeSnap();
		} catch (Exception e) {
			reportStep("The Element "+ele+" is NOT clicked","fail");
			takeSnap();
		}
		
	}
	
	public void clickNoSnap(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
		
	}

	@Override
	public String getText(WebElement ele) {
		
		String getTextValue = ele.getText();
		System.out.println(getTextValue);
		return getTextValue;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select dropDown = new Select(ele);
			dropDown.selectByVisibleText(value);
			System.out.println(value+ " is selected Successfully");
		} catch (NoSuchElementException e) {
			System.out.println("Element Not found exception");
		}catch (WebDriverException e) {
			System.out.println("Browser level Exception");
		}finally {
		takeSnap();
		}
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select dropDown = new Select(ele);
		dropDown.selectByIndex(index);
		System.out.println(dropDown.getFirstSelectedOption().getText()+ " is selected Successfully");
		takeSnap();
	}

	@Override
	public boolean verifyTitle(String expectedTitle) 
	
	{
		boolean bReturn = false;
		
		// TODO Auto-generated method stub
		if ( driver.getTitle().equals(expectedTitle)) {
			System.out.println("Title of the Page is Verified");
		bReturn = true;
		}
		else {
			System.out.println("Title of the Page is NOT Verified");
		}
		return bReturn;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		if (ele.getText().equals(expectedText))
			System.out.println("Exact Match is Verified");
		else
			System.out.println("Exact Match is NOT Verified");
	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		if (ele.getText().contains(expectedText))
			System.out.println("Partial Match is Verified");
		else
			System.out.println("Partial Match is NOT Verified");
		
	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String expectedText) {
		
		String textValue = ele.getAttribute(attribute);
		if (ele.getAttribute(attribute).equals(expectedText))
			System.out.println("Exact Match is Verified");
		else
			System.out.println("Exact Match is NOT Verified");
		
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		String textValue = ele.getAttribute(attribute);
		if (ele.getAttribute(attribute).contains(value))
			System.out.println("Exact Match is Verified");
		else
			System.out.println("Exact Match is NOT Verified");
		
	}

	@Override
	public void verifySelected(WebElement ele) {
		if (ele.isSelected())
		{
			System.out.println(ele+" is Selected");
		}
		else
			System.out.println(ele+" is NOT Selected");
	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		if (ele.isDisplayed())
		{
			System.out.println(ele+" is Displayed");
		}
		else
			System.out.println(ele+" is NOT Displayed");
		
	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> allWindows = new ArrayList<String>();
			allWindows.addAll(windowHandles);
			driver.switchTo().window(allWindows.get(index));
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			System.err.println("Window not found");
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Browser not found");
		}
	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(ele);
	takeSnap();	
	}

	@Override
	public void acceptAlert() {
		Alert myAlert = driver.switchTo().alert();
		myAlert.accept();
	}

	@Override
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
		
	}

	@Override
	public String getAlertText() {
		driver.switchTo().alert().getText();
		return null;
	}

	@Override
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
		
	}

	@Override
	public void closeBrowser() {
		driver.close();
		
	}

	@Override
	public void closeAllBrowsers() {
		driver.quit();
		
	}

}
