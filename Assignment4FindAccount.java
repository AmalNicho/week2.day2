package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4FindAccount {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Find Accounts')]")).click();
		
		driver.findElement(By.xpath("(//input[contains(@name,'accountName')])[2]")).sendKeys("Credit Limited Account");
		
	// driver.findElement(By.xpath("//button[contains(text(),'Find Accounts')]")).click(); // This line is not working for me
		
		 driver.findElement(By.xpath("//button[text() ='Find Accounts']")).click(); 
		 
	driver.findElement(By.xpath("(//a[contains(text(),'Credit Limited Account')])[2]")).click(); // This line is not working for me
	
	//driver.findElement(By.xpath("(//a[text()='Credit Limited Account')])[2]")).click(); // This line is not working for me
		
	driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	
	System.out.println(driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).getText());
		
		
	
	
	
	if (driver.getTitle()=="Edit Account | opentaps CRM")
		
	{
		System.out.println("Title of the page is correct "+driver.getTitle());
	}	
		else
		{
			System.out.println("Title of the page is incorrect "+driver.getTitle());
		}
			
			
		
//	if (	driver.findElement(By.id("sectionHeaderTitle_accounts")).getText()=="Edit Account")
//		
//	{
//		System.out.println("Title of the page is correct "+driver.findElement(By.id("sectionHeaderTitle_accounts")).getText());
//		
//	}
//	
//	else
//	{
//		System.out.println("Title of the page is correct "+driver.findElement(By.id("sectionHeaderTitle_accounts")).getText());
//	}
//	

	if (driver.findElement(By.xpath("//input[@id='accountName']")).getAttribute("value")=="Credit Limited Account")
	{		
	System.out.println("Account name is correct "+ driver.findElement(By.xpath("//input[@id='accountName']")).getAttribute("value"));
	}
			
	else 
				
		{ System.out.println("Account name is incorrect "+ driver.findElement(By.xpath("//input[@id='accountName']")).getAttribute("value"));
			
		}
			
	}

}
