package week2.day2.Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4NTCreateAccount {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		
		driver.findElement(By.id("currencyUomId")).sendKeys("INR");
		
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("XXX");
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		
		driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']")).sendKeys("Tamilnadu");
		
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("100000");
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		
		System.out.println(driver.findElement(By.xpath("//li[@class='errorMessage']")).getText());
		
		
		
	}

}
