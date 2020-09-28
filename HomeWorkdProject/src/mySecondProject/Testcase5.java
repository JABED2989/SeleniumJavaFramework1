package mySecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase5 {

	public static void main(String[] args) {
		
	//Lunch the Chrome Browser and enter https://amazon.com
		System.setProperty("https:/google.com", "C:\\Software\\ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
	//Select "cart" Button
	
		WebElement CartButton = driver.findElement(By.id("cart"));
		CartButton.click();
		
	//Close the browser
		driver.close();
		driver.quit();
		
		
		WebElement SignInButton = driver.findElement(By.id("signIn"));
		SignInButton.click();
		//SignInButton.submit();
		driver.quit();
		//driver.close();
		//System.out.println("SignIn executed sussessfully");
		//System.exit(0);
		
			}
		
		
}