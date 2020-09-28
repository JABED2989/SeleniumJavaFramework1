package mySecondProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		//driver.switchTo().frame("iframeResult");
		
		//driver.switchTo().frame(1);
		
		WebElement iframe = driver.findElement(By.xpath("//iFrame[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("AZ");
		
		driver.switchTo().parentFrame();

		Thread.sleep(5000);
		
		
		driver.close();
		
		
		
		
		

	}

}
