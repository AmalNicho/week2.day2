package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4CreateAccount {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
	driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
	driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("XXX");
	driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
	driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("100");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//driver.findElement(By.xpath("//a[text()='Create Account Ignoring Duplicates']")).click();
		
		driver.close();
	
		
		
		
	}

}
