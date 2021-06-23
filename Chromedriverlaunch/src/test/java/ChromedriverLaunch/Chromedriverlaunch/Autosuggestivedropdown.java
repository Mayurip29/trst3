package ChromedriverLaunch.Chromedriverlaunch;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import junit.framework.Assert;

public class Autosuggestivedropdown  {

	public static void main(String[] args)  throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        
        
	    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click(); 
      driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
     
      Thread.sleep(2000);
      List <WebElement> droptions = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
      
      
for(WebElement droption : droptions)
{
	if(droption.getText().equalsIgnoreCase("indonesia"))
	{
		droption.click();
		
		break;
		}
	
	else
	{
		System.out.println(droption.getText());
	}

	 
}}}
