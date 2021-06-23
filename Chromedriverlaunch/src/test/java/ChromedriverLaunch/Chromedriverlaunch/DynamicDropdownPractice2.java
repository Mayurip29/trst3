package ChromedriverLaunch.Chromedriverlaunch;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DynamicDropdownPractice2  {

	public static void main(String[] args)  throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.manage().window().maximize();        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
        
       // driver.findElement(By.cssSelector("a[id='hlnkholidaypacks']")).click();
      WebElement Fromcity = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
    //input[@id='ctl00_mainContent_ddl_originStation1_CTXT']
      Fromcity.click();
        
      
    WebElement Selectfromcity =   driver.findElement(By.cssSelector("[text='Hyderabad (HYD)']"));
    Selectfromcity.click();
    
    
    WebElement tocity = driver.findElement(By.cssSelector("[id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
      tocity.click();
      
      
//XPATH FOR PARENT CHILD RELATIONSHIP--WRITE PARENT XPATH THEN ADD ONE SPACE AND THEN ADD CHILD XPATH
      WebElement Selecttocity = driver.findElement(By.xpath("//div[@id= 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXL']"));
      Selecttocity.click();
  
 // System.out.println(Adultdropdown.getText());
 // driver.close();
  
		
	}

	}
	


