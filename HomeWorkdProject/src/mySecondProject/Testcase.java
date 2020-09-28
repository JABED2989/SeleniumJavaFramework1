package mySecondProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {

	public static void main(String[] args) {
		
	//Lunch the Chrome Browser and enter https://google.com
		
		System.setProperty("https//www.google.com","C:\\Software\\ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https/www.google.com");
		
		
	}

}
