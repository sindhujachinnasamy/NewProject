package project.week4;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import week3.day2.SeMethods;

public class FlipkartPriceCompare extends SeMethods{
@Test
	public void flipkartPriceComparison()
	{
	
		startApp("chrome","https://www.flipkart.com/");
	
		WebElement loginButton = locateElement("xpath", "//button[text()='✕']");
		clickNoSnap(loginButton);
		
		WebElement tvAppliance = locateElement("xpath", "//span[text()='TVs & Appliances']");
		WebElement samsung = locateElement("xpath", "(//span[text()='Samsung'])[2]");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(tvAppliance).pause(3000).click(samsung).perform();
		
		WebElement minValue = locateElement("xpath", "(//div[@class='_3Uy12X']//select)[1]");
		selectDropDownUsingText(minValue, "₹25000");
		
		WebElement maxValue = locateElement("xpath", "//div[@class='_1YoBfV']/select");
		selectDropDownUsingText(maxValue, "₹60000");
		
		
		
	}
	
}
