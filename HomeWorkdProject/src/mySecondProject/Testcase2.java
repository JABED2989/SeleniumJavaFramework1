package mySecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) 
	
	//Launch the chrome Browser and enter https://google.com
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		// Enter search value as "Traning" and click on Search button
		
		WebElement googleSearchBox = driver.findElement(By.name("q"));
	    googleSearchBox.sendKeys("Traning");
	    googleSearchBox.submit();
	    driver.quit();
	

		
	}

}
