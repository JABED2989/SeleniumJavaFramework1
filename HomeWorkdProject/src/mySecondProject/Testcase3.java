package mySecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 
//Launch the Chrome Browser and enter https://google.com

{

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");
        
        
        searchBox.submit();
        driver.quit();
		
		
		
	}

}
