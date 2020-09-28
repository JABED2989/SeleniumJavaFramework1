package mySecondProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkFirst {

	public static void main(String[] args) {
		//Launch the chrome Browser and enter https://google.com
		//System.setProperty("webdriver.chrome.driver", "C:/Software/ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http;//www.google.com/");
		
		//Enter search value as "Training" and click on Search button
		
		String appUrl = "https://Traning.google.com";
		
		driver.get(appUrl);
		
		
	}

}
