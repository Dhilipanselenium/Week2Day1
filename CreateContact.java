package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		//driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("AAAtech");
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Dhilipan");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("D");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String displayFirstName=driver.findElement(By.xpath("//span[@id='viewContact_firstName_sp']")).getText();
		System.out.println(displayFirstName);
		String title1=driver.getTitle();
		System.out.println(title1);
	}

}
