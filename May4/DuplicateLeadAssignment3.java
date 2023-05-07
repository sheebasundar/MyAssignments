package week2.May4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLeadAssignment3 {

	public static void main(String[] args) throws IOException, Exception 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sheeba");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sheeba");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Computer");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sheebaraj28@gmail.com");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select st1=new Select(state);
		st1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println("Page Title:" +title);
		driver.findElement(By.partialLinkText("Duplicate")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ammu");
		driver.findElement(By.className("smallSubmit")).click();
		String title1=driver.getTitle();
		System.out.println("Page Title:" +title1);
		Thread.sleep(2000);
		//Test cleanup
		driver.quit();
		//Runtime.getRuntime().exec("Taskkill /F /IM chromedriver.exe /T");
		//System.out.println("Chrome driver terminated successfully!!");
	}
}

