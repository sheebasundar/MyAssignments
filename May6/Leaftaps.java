   package week2.May6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();	
		driver.manage().window().maximize();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sheeba");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		WebElement secElement=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec=new Select(secElement);
		sec.selectByIndex(4);
		WebElement secElement2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec2=new Select(secElement2);
		sec2.selectByVisibleText("Automobile");
		WebElement secElement3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sec3=new Select(secElement3);
		sec3.selectByValue("OWN_CCORP");///doubt??/
		driver.findElement(By.className("smallSubmit")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		
	}

}
