package mySecondProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class DropdownTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //Step 1: Launch the Browser and navigate to the Google URL
		
		driver.manage().window().maximize(); //This step maximize the chrome Browser
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://facebook.com");//This step gets the URL
		
		WebElement element=driver.findElement(By.id("month"));
		Select se=new Select(element);
		List originalList=new ArrayList();
		List<WebElement>=se.getoptions();
		
		getoptions();
				
		
		
		
		driver.close();
		
		
	}

}
