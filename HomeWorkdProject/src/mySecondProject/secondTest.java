package mySecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondTest {

public static void main(String[] args) {
		
		String appUrl = "https://www.google.com";

		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		    driver.get(appUrl);
		    
		   WebElement googleSearchBox = driver.findElement(By.name("q"));
		   googleSearchBox.sendKeys("Stock Market");
		   googleSearchBox.submit();
		    //Thread.sleep(5000);  // Let the user actually see something!
		   driver.quit();
		
		   
            
		
		              
		               

		

	}

	
	
}
