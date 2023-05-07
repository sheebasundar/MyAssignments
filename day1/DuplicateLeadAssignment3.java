package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLeadAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
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
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sheeba");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Computer");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sheebaraj28@gmail.com");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select st1=new Select(state);
		st1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.partialLinkText("Duplicate")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ammu");
		driver.findElement(By.className("smallSubmit")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		
		
		
	}

}
