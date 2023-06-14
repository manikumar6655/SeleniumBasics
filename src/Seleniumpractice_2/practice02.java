package Seleniumpractice_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;


public class practice02 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disabled--notifications");


		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.google.com");


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.findElement(By.id("APjFqb")).sendKeys("outlook");
		Robot robot1=new Robot();
		robot1.keyPress(KeyEvent.VK_DOWN);
		robot1.keyRelease(KeyEvent.VK_DOWN);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//h3[contains(text(),'Outlook – free personal email and calendar from Microsoft')]")).click();
		driver.findElement(By.xpath("//div[@class='bound']//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("mani.b@kairostech.com");
		driver.findElement(By.xpath("//input[@id=\"idSIButton9\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='i0118']")).sendKeys("Kumar@123");
		driver.findElement(By.xpath("//input[@id=\"idSIButton9\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"table-row\"]//div[text()='Text +XX XXXXXXXX48‎']")).click();
		Thread.sleep(8000);
		String curl=driver.getTitle();
		System.out.println(curl);
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Sent Items']")).click();
	    String cwurl=driver.getCurrentUrl();
	    String exurl="https://outlook.office365.com/mail/sentitems";
	    
	    	
		List<WebElement>l=driver.findElements(By.xpath("//div[@class=\"W3BHj gy2aJ Dc0o9 Ejrkd\"]"));
		for (WebElement s : l) {
			
			
			System.out.println(s.getText());
			
		}
		
		
		
	



}
}
