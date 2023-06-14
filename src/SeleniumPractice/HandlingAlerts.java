package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		
		driver.findElement(By.id("alertBox")).click();
		Alert alert=driver.switchTo().alert();
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		Thread.sleep(3000);
		alert.accept();
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,600)");
		
		
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		alert.accept();
		
	
		driver.findElement(By.id("promptBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		alert.sendKeys("Mani kumar");
		driver.quit();
		

		
		
		
		
		
		
		
		
	}

}
