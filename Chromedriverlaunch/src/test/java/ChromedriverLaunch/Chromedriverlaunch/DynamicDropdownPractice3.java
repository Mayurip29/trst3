package ChromedriverLaunch.Chromedriverlaunch;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class DynamicDropdownPractice3  {

	public static void main(String[] args)  throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
        
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
   
         Assert.assertTrue((driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected()));
      
        
        
        List <WebElement> dropdowns = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(dropdowns.size());
        
        
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
         driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
         
         }


         //Text of adultdropdown after performing click.    
         driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
         Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "5 Adult");
         System.out.println(driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).getText());
     

        
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
      
     
       
       

      
      
  
  System.out.println(Adultdropdown.getText());
 // driver.close();
  
		
	}

	private static boolean assertfalse(boolean selected) {
		// TODO Auto-generated method stub
		return false;
	}

	}
	


