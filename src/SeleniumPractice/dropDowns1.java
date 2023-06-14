package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropDowns1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		Actions action =new Actions(driver);
		Thread.sleep(3000);
		
		WebElement element1=driver.findElement(By.id("draggable"));
		WebElement element2=driver.findElement(By.id("droppable"));

		Thread.sleep(3000);

		action.dragAndDrop(element1, element2).build().perform();
		Thread.sleep(3000);
		driver.quit();
	
	}

}
