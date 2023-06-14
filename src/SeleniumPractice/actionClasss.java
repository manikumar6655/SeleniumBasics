package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionClasss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		
		
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[@class=\"dropdown dropdown_category_list\"]"))).build().perform();
		Thread.sleep(3000);
		builder.click(driver.findElement(By.xpath("//ul[@id=\"nav\"]//a[text()='Cyber Security']"))).build().perform();
		WebElement search  =driver.findElement(By.xpath("//input[@type=\"text\"]"));
		builder.moveToElement(search).build().perform();
		Thread.sleep(3000);
		
		WebElement click=driver.findElement(By.linkText("Cloud Architect Masters Program"));
		builder.moveToElement(click).build().perform();
		Thread.sleep(3000);
		Action seriesofActions;
		seriesofActions=builder
				.sendKeys(search,"Cloud Architect Masters Program")
				.keyDown(click,Keys.SHIFT)
				.keyUp(click,Keys.SHIFT).build();
		seriesofActions.perform();
		
		        
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
