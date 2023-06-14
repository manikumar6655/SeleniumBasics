package SeleniumPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_01 {
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		WebElement all=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select slt=new Select(all);
		//slt.selectByIndex(2);
		slt.selectByValue("search-alias=appliances");
		
		
		
//		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Midnight']")).click();
//		Set<String> allwindows= driver.getWindowHandles();
//		for (String cw : allwindows) {
//			if(!cw.equals(allwindows))
//			{
//				driver.switchTo().window(cw);
//			}
//
//		}
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//		
	}
}
