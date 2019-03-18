import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String today = null;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in");
		 
		 driver.manage().window().maximize();		
		driver.findElement(By.id("src")).sendKeys("Lucknow(All Locations)");
		driver.findElement(By.id("src")).click();
		
		try {
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("What's up people");
		}
		driver.findElement(By.id("dest")).sendKeys("Mathura");
		driver.findElement(By.id("dest")).click();
		try {
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		driver.findElement(By.xpath("//*[@class='fl search-box date-box gtm-onwardCalendar']")).click();       
	    String month="Apr 2019";        
	    String date="28";       
	    String getMonth=driver.findElement(By.xpath("//div[@class='rb-calendar']//td[@class='monthTitle']")).getText();         
	    System.out.println(getMonth);    
  
 try     
	    {       
	      while(true)   
	      {             
	      if(!(getMonth.equalsIgnoreCase(month))) 
	            {
	                driver.findElement(By.xpath("//div[@class='rb-calendar']/*//td[@class='next']")).click();
	                break;      
	            }       
	      }        
 driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody//td[text()='"+month+"']/../..//td[text()='"+date+"']")).click();         
	       }
	    catch(Exception e)      
	    {      
		 }
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	    driver.findElement(By.id("search_btn")).click(); 
	}
}
