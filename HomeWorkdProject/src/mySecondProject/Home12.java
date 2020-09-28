package mySecondProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home12 {

	public static void main(String[] args) {
		
		
		// Set the property for the driver to recognize the chromedriver.exe path location.
		
		System.setProperty("webdriver.chrome.driver","C:\\Software\\ChromeDriver");
		
		// Step 1 : Launch the Browser and navigate to the Google URL
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		

	}

}
