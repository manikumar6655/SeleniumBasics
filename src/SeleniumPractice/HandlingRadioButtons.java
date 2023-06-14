package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	driver.manage().window().maximize();
	List<WebElement>ele=driver.findElements(By.xpath("//*[@type=\"radio\"]"));
	for (WebElement name : ele) {
		System.out.println(name.getAttribute(""));
		System.out.println(name.isSelected());
	
		if(name.getAttribute("value").equals("Male"))
		{
			name.click();
		}
		
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
