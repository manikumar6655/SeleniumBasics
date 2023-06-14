package SeleniumPractice;
import java.time.Duration;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class practiceAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		        WebDriver driver=new ChromeDriver();
		
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				driver.manage().window().maximize();
			    driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
			    Alert alert=driver.switchTo().alert();
				String msg=driver.switchTo().alert().getText();
				System.out.println(msg);
				alert.accept();

				
				
				
				driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
				String msg1=driver.switchTo().alert().getText();
				System.out.println(msg1);
				alert.sendKeys("MAni");
				Thread.sleep(3000);
				alert.accept();



				
				
				
//				Actions act=new Actions(driver);
//				WebElement click=driver.findElement(By.xpath("//span[text()='right click me']"));
//				Thread.sleep(3000);
//				//act.moveToElement(click).contextClick().perform();
//				Thread.sleep(3000);
//				Action seriesofActions;
//				seriesofActions=(Action) act
//						.moveToElement(click)
//						.keyDown(click,Keys.SHIFT)
//						.keyUp(click,Keys.SHIFT).build();
//				((Actions) seriesofActions).perform();
				
		
		
		
		
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
//		driver.manage().window().maximize();
//				driver.switchTo().frame("iframeResult");
//				Thread.sleep(3000);
//				WebElement el=driver.findElement(By.xpath("//input[@id=\"field1\"]"));
//				el.clear();
//				el.sendKeys("mani");
//				
//				WebElement text=driver.findElement(By.xpath("//button[text()='Copy Text']"));
//				Actions act=new Actions(driver);
//				act.moveToElement(text).doubleClick().perform();
		
		
				
				
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//				WebElement dispp=driver.findElement(By.xpath("//span[text()='AUTOMATION PRACTICE ME']"));
//				if(dispp.isDisplayed())
//				{
//					System.out.println("Present");
//					String s=dispp.getText();
//					System.out.println(s);
//				}
//				else
//				{
//					System.out.println("not Present");
//				}
//				
//				
//				driver.findElement(By.name("firstname")).sendKeys("Mani Kumar");
//				driver.findElement(By.name("lastname")).sendKeys("Beemarapu");
//				driver.findElement(By.id("sex-0")).click();
//				driver.findElement(By.id("exp-1")).click();
//				driver.findElement(By.id("datepicker")).sendKeys("21/04/23");
//				
//				
				JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(0,600)");
//				
//				 
//				driver.findElement(By.xpath("//input[@id=\"profession-1\"]")).click();
//				driver.findElement(By.id("profession-1")).sendKeys("21/04/23");
//				
//				driver.findElement(By.id("tool-1")).click();
//				
//				WebElement ele=driver.findElement(By.id("continents"));
//				Select slt=new Select(ele);
//				slt.selectByVisibleText("Asia");
//				slt.selectByIndex(1);
//				
//				WebElement ele1=driver.findElement(By.id("selenium_commands"));
//				Select slt1=new Select(ele1);
//
//				slt1.selectByVisibleText("Browser Commands");
//				slt1.selectByIndex(3);
				
				
				
				
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//				driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//				JavascriptExecutor js=(JavascriptExecutor)driver;
//				 js.executeScript("window.scrollBy(0,600)");
//				WebElement ele=driver.findElement(By.xpath("//div[@class=\"col-md-12\"]"));
//				List<WebElement>rows=ele.findElements(By.xpath("//table[@id=\"customers-grid\"]"));
//				
//				
//			for(int i=0;i<rows.size();i++)
//			{
//				List<WebElement>cols=rows.get(i).findElements(By.xpath("//table[@id='customers-grid']"));
//				for(int j=0;j<cols.size()-2;j++)
//				{
//					String column=cols.get(j).getText(); 
//					System.out.print(column);
//					
//				}
//				System.out.println();
//			}
				
				
	}

}
