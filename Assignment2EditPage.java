package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2EditPage {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		

		//Title
		
		System.out.println("Title is " +driver.getTitle());
		
		//CurrentURL
		System.out.println("Current URL is "+driver.getCurrentUrl());
		
		//PageSource
		
		System.out.println("Page Source is "+driver.getPageSource());
		
		
		//Get value
		
		System.out.println("Value is "+driver.findElement(By.xpath("//label[contains(text(),'Append a text and press keyboard tab')]/following-sibling::input")).getAttribute("Value"));		
		
		
		//Get CssValue
		
		System.out.println("CSS Value is "+driver.findElement(By.xpath("(//label[@for='email'])[1]")).getCssValue("color"));
		
		//Get Location
		
		System.out.println("Location is "+driver.findElement(By.xpath("(//label[@for='email'])[1]")).getLocation());
		
		System.out.println("X axis of Location is "+driver.findElement(By.xpath("//label[contains(text(),'Append a text and press keyboard tab')]/following-sibling::input")).getLocation().getX());
		
		
		//GetSize
		
		System.out.println("Size is "+driver.findElement(By.xpath("(//label[@for='email'])[1]")).getSize());
		
		
		// Get TagName
		
		System.out.println(driver.findElement(By.id("content")).getTagName());	
		
		//isDisplayed
		
		System.out.println(driver.findElement(By.id("content")).isDisplayed());	
		
		System.out.println(driver.findElement(By.id("content1")).isDisplayed());	
		
		//driver.close();
		
		}

}
