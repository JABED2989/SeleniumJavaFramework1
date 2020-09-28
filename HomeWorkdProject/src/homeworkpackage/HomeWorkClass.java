package homeworkpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWorkClass {

	public static void main(String[] args) {
		
		String appUrl = "https://www.google.com";
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		    driver.get(appUrl);
		    
		    WebElement googleSearchBox = driver.findElement(By.name("q"));
		    googleSearchBox.sendKeys("Weather");
		    googleSearchBox.submit();
		    //Thread.sleep(5000);  // Let the user actually see something!
		    driver.quit();
		
		
		
	}

}
