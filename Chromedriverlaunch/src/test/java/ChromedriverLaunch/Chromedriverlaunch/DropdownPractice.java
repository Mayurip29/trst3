package ChromedriverLaunch.Chromedriverlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//import junit.framework.Assert;

public class DropdownPractice {                 //handlinhg static dropdowns where dropdown options re fixed

	public static void main(String[] args)  throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.manage().window().maximize();
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

  
         //Text of adultdropdown after performing click.    
         driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
         Assert.assertEquals("driver.findElement(By.xpath(\"//span[@id='hrefIncAdt']\"))", "5 adult");
 // System.out.println(Adultdropdown.getText());
 // driver.close();
  
		
	}
	}


