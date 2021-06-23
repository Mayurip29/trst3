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



public class FirstAssignment  {

	public static void main(String[] args)  throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
        
        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        System.out.println( driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        System.out.println( driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
        
        List <WebElement> Checkbox = driver.findElements(By.cssSelector("input[type='checkbox']"));
       System.out.println(Checkbox.size());
        
        
        // Assert.assertTrue((driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected()));
      
	}
	


}