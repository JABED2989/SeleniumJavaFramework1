package mySecondProject;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abs {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.xpath("//div[@class='pR49Ae gsfi']")).click();
		String tittle = driver.getTitle();
		System.out.println("Page Tittle is:' + tittle");
		
		
		
		
		}

}
