package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AAAtech");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhilipan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
		WebElement eleDropdown=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select=new Select(eleDropdown);
		select.selectByVisibleText("Tradeshow");
		driver.findElement(By.name("submitButton")).click();
		String title2=driver.getTitle();
		System.out.println(title2);
		String sourcetext=driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println(sourcetext);
		
		
		
	}

}
