package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4CreateLead {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();	
		driver.findElement(By.linkText("Leads"));
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[contains(@id ,'createLeadForm_companyName')]")).sendKeys("Flextronics");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Amal");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Anto");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText());
		System.out.println(driver.getTitle());					
		driver.close();
		
	}

}
