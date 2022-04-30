package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2CheckPage {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leafground.com/pages/checkbox.html");
	
	System.out.println(driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[1]")).isSelected());
	
	System.out.println(driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input")).isEnabled());
	
	System.out.println(driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input")).isSelected());
	
	
	}

}
