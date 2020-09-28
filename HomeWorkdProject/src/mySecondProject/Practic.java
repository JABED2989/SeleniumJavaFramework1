package mySecondProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practic {

	public static void main(String[] args) {
		
		String baseUrl = "www.yahoo.com";
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(baseUrl);
		//driver.get("www.yahoo.com");
		
	}

}
