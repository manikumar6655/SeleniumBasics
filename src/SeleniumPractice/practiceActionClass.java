package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practiceActionClass {

	public static void main(String[] args) {
		
		
	WebDriver driver=new ChromeDriver();	
	driver.get("http:/www.edureka.co/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Actions builder=new Actions(driver);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
