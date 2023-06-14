package Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitExplicity {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(30));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
         driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		



	}

}
