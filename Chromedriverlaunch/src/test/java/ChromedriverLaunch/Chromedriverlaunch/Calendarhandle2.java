package ChromedriverLaunch.Chromedriverlaunch;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Calendarhandle2  {

	static String day1= "23";

	public static void main(String[] args)  throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions/");
	    driver.manage().window().maximize();        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        
        
        WebElement fromair = driver.findElement(By.cssSelector("input[id='travel_from']"));
        fromair.sendKeys("HYD");
        
        addtoair(driver);
    	
       
        
   driver.findElement(By.id("travel_date")).click();
   
   
while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("Jul"))
  
{
	driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='next']")).click();

}




   
   List <WebElement> fromdate =   driver.findElements(By.cssSelector("td[class*='day']"));
      
   //List <WebElement> fromdate =   driver.findElements(By.xpath("//table[contains(@class,'table-condensed')] //td[contains(@class,'day')]"));
   
   int dayscount = fromdate.size();
   System.out.println(dayscount);
   
   for(int i=0;i<dayscount;i++)
	   
	   
	   
   {
	 String day =  fromdate.get(i).getText();
	 
	 
	 if(day.equalsIgnoreCase(day1)) {
		 
		fromdate.get(i).click();
		break; 
	 }
   }

	}

	
		   public static void addtoair(WebDriver driver){
		      
		      
		      WebElement toair = driver.findElement(By.cssSelector("input[id='travel_to']"));
		        toair.sendKeys("DEL");
		        
		   
		       List <WebElement> droptions = driver.findElements(By.cssSelector("div[id='ajax_listOfOptions'] div"));
		        
		        
		  for(WebElement droption : droptions)
		  {
		  	if(droption.getText().equalsIgnoreCase("Indira Gandhi International Airport (DEL) Delhi"))
		  	{
		  		droption.click();
		  		
		  		break;
		  		}
		  	
		  	else
		  	{
		  		System.out.println(droption.getText());
		  	}
		  }
		
	}

}

	