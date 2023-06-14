package Seleniumpractice_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import javax.management.Notification;
import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class practice01 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disabled--notifications");


		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.google.com");

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.id("APjFqb")).sendKeys("Gmail");
		Robot robot1=new Robot();
		robot1.keyPress(KeyEvent.VK_DOWN);
		robot1.keyRelease(KeyEvent.VK_DOWN);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//a[text()='Sign in to Gmail']")).click();
		driver.findElement(By.xpath("//a[text()='SIGN IN TO GMAIL']")).click();
		String CW=driver.getWindowHandle();
		Set<String>window=driver.getWindowHandles();
		for(String i:window)
		if(!CW.equals(i))
		{
			driver.switchTo().window(i);
		driver.findElement(By.xpath("//input[@type=\"email\"]"));
			 Robot robot = new Robot();
			 robot.keyPress(KeyEvent.VK_CAPS_LOCK);
			 robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
			    robot.keyPress(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_M);
			    robot.keyRelease(KeyEvent.VK_M);
			    robot.keyPress(KeyEvent.VK_A);
			    robot.keyRelease(KeyEvent.VK_A);
			    robot.keyPress(KeyEvent.VK_N);
			    robot.keyRelease(KeyEvent.VK_N);
			    robot.keyPress(KeyEvent.VK_I);
			    robot.keyRelease(KeyEvent.VK_I);
			    robot.keyPress(KeyEvent.VK_A);
			    robot.keyRelease(KeyEvent.VK_A);
			    robot.keyPress(KeyEvent.VK_N);
			    robot.keyRelease(KeyEvent.VK_N);
			    robot.keyPress(KeyEvent.VK_U);
			    robot.keyRelease(KeyEvent.VK_U);
			    robot.keyPress(KeyEvent.VK_M);
			    robot.keyRelease(KeyEvent.VK_M);
			    robot.keyPress(KeyEvent.VK_K);
			    robot.keyRelease(KeyEvent.VK_K);
			    robot.keyPress(KeyEvent.VK_AT);
			    robot.keyRelease(KeyEvent.VK_AT);
			    robot.keyPress(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_2);
			    robot.keyRelease(KeyEvent.VK_2);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_G);
			    robot.keyRelease(KeyEvent.VK_G);
			    robot.keyPress(KeyEvent.VK_M);
			    robot.keyRelease(KeyEvent.VK_M);
			    robot.keyPress(KeyEvent.VK_A);
			    robot.keyRelease(KeyEvent.VK_A);
			    robot.keyPress(KeyEvent.VK_I);
			    robot.keyRelease(KeyEvent.VK_I);
			    robot.keyPress(KeyEvent.VK_L);
			    robot.keyRelease(KeyEvent.VK_L);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			    
		driver.findElement(By.xpath("//div[@class=\"F9NWFb\"]//span[@jsname=\"V67aGc\"]")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7993844071");
		}
		//Select slt=new Select(driver);
		driver.findElement(By.xpath("//div[@data-disable-idom=\"true\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"F9NWFb\"]//div[@class=\"VfPpkd-RLmnJb\"]")).click();
		
		
		//WebElement table=driver.findElement(By.xpath("//table[@id=\":22\"]"));
		//table.findElements(By.xpath())

		



		

		

		
		
		
		
		
	}

}
