package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingslider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		List<WebElement>list=driver.findElements(By.tagName("iframe"));
		
		System.out.println(list.size());

		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//div[@id=\"slider\"]"));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);	
		act.moveToElement(slider).dragAndDropBy(slider, 100, 0).build().perform();
		
		
	}

}
