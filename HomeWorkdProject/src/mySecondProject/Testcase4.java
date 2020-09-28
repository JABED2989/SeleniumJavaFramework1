package mySecondProject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {

	public static void main(String[] args) {
		
		//Lunch the Chrome Browser and enter https://amazon.com
		
		System.setProperty("webdrover.chrome.driver", "C:\\Software\\ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		WebElement SignInButton = driver.findElement(By.id("signIn"));
		SignInButton.click();
		//SignInButton.submit();
		driver.quit();
		//driver.close();
		//System.out.println("SignIn executed sussessfully");
		//System.exit(0);
	
	
		}

}
