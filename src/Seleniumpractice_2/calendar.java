package Seleniumpractice_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.ous.jtoml.ParseException;

public class calendar {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");


		driver.findElement(By.id("first_date_picker")).click();
		int x[]=selectDate(driver, "05/June/2015");
		Thread.sleep(3000);
		int targetMonth=x[0];
		int targetYear=x[2];
		int currentMonth=x[1];
		int currentYear=x[3];

		whilecondtion(driver,currentMonth,currentMonth,currentYear,targetYear);
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}

	}

	public static   int[] selectDate(WebDriver driver, String date) throws Exception {
		int []ar=new int[4];
		Calendar calendar = Calendar.getInstance();

		try {
			SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
			targetDateFormat.setLenient(false);
			Date formattedTargetDate = targetDateFormat.parse(date);
			calendar.setTime(formattedTargetDate);
		} catch (Exception e) 
		{
			throw new Exception("Invalid date is provided, please check the input date!!");
		}

		ar[0] = calendar.get(Calendar.MONTH);
		ar[2]= calendar.get(Calendar.YEAR);
		int targetDay = calendar.get(Calendar.DAY_OF_MONTH);

		String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
		calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
		ar[1] = calendar.get(Calendar.MONTH);
		ar[3]= calendar.get(Calendar.YEAR);
		return ar;
		
	}

	public static int[] whilecondtion(WebDriver driver,int currentMonth,int targetMonth ,int currentYear,int targetYear ) throws ParseException, java.text.ParseException
	{
		Calendar calendar = Calendar.getInstance();
		int []res=new int[2];
		while(currentMonth > targetMonth || currentYear > targetYear)
		{
			driver.findElement(By.className("ui-datepicker-prev")).click();
			String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
			res[0]=currentMonth = calendar.get(Calendar.MONTH);
			res[1]=currentYear = calendar.get(Calendar.YEAR);

		}
		return res;




	}
}
