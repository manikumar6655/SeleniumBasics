package Seleniumpractice_2;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class Basic_Controls {

	public static org.openqa.selenium.interactions.Action seriesofActions;
    public static WebDriver driver;
    public static Actions act;
    
    
    
    private static final By all=By.id("nav-hamburger-menu");
    private static final By mobile=By.id("//a[@data-menu-id=\"8\"]//*[text()='Mobiles, Computers']");
    private static final By game=By.xpath("//a[text()='Game Zone']");
    
    
    
    
    
    
    
    
    
    private static WebElement all()
    {
    	return driver.findElement(all);
    }
    private static WebElement mobile()
    {
    	return driver.findElement(mobile);
    }
    private static WebElement game()
    {
    	return driver.findElement(game);
    }
    
    
    //////////////////Actions//////////////////
    
    
    private static void all1()
    {
    	all().click();
    }
    private static void mobile1()
    {
    	act=new Actions(driver);
    	act.moveToElement( mobile()).build().perform();
    	 seriesofActions=act
 				.keyDown(mobile(),Keys.SHIFT)
 				.keyUp(mobile(),Keys.SHIFT).build();
 		         seriesofActions.perform();
    	
    }
    private static void game1()
    {
    	act=new Actions(driver);
    	act.moveToElement( game()).build().perform();
    }
    
    private static void m1() throws InterruptedException
    {
    	all1();
    	Thread.sleep(3000);
    	mobile1();
    	
    	
    	
    	
    	
    	
    }
    
    
    
    
    
    
    
	public static void main(String[] args) throws InterruptedException {
		
		
		getDriver();
		 m1();
		
		
		
		
	}

	public static void getDriver()
	{
	   driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

//	public static void sendkeys(WebElement mobile)
//	{
//		
//		         seriesofActions=act
//				.keyDown(mobile,Keys.SHIFT)
//				.keyUp(mobile,Keys.SHIFT).build();
//		         seriesofActions.perform();
//
//	}
	

