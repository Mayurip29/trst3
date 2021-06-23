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


public class Calendarhandle  {

	

	public static void main(String[] args)  throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		
		WebDriver  driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
	    driver.manage().window().maximize();        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
      
    WebElement departcity =   driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
    departcity.click();
    driver.findElement(By.cssSelector("a[value='HYD']")).click();
    
    
    WebElement returncity =   driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
    returncity.click();
    driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='DEL']")).click();
    
    driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
    
    
    driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
  WebElement datewidget =  driver.findElement(By.cssSelector("[id='ui-datepicker-div']"));
  
//This are the columns of the from date picker table
List<WebElement> columns = datewidget.findElements(By.cssSelector("[class='ui-state-default']"));

System.out.println(columns.size());
columns.get(25).click();
    
    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
    		{
    	
    		System.out.println("its enabled");
    		Assert.assertTrue(true);
    		}
    		
    		else
    		{
    			
    			System.out.println("disabled");
    			
    		}
    
    driver.findElement(By.cssSelector("[id='ui-datepicker-div']"));
    
    List<WebElement> columns2 = datewidget.findElements(By.cssSelector
    		("[class=' ui-datepicker-other-month ui-datepicker-unselectable ui-state-disabled ui-state-default']"));
   
    System.out.println(columns2.size());
    //columns.get(56).click();
    
    	WebElement INR =  driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select Currency = new Select(INR);
       // Currency.selectByVisibleText("USD");
        Currency.selectByIndex(2);
        System.out.println(Currency.getFirstSelectedOption().getText());
        
         WebElement Adultdropdown = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
         Adultdropdown.click();
     	Thread.sleep(2000);
     	//Text of adult dropdown before performing click
     	  System.out.println(Adultdropdown.getText());
       // int i = 1;
       // while(i<4)
     	  for(int i=1; i<=4; i++ )
        {
         driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click(); }


    //driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active']")).click();
    
  
  
		
	}

	}
	