package ChromedriverLaunch.Chromedriverlaunch;


import java.awt.Window;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import junit.framework.Assert;

public class Javascripttest1  {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        
  
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,520)");
		Thread.sleep(5000);
		
		
		List<WebElement> amt = driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
		 int sum =0;
		 
		for (int i = 0; i<amt.size(); i++)
		{
			System.out.println(Integer.parseInt(amt.get(i).getText()));
			int val1 = Integer.parseInt(amt.get(i).getText());
			
			sum = sum + val1;
			
			System.out.println(sum);
			//return;
			
		}
		
		int n1 =  Integer.parseInt(driver.findElement(By.cssSelector("[class='totalAmount']")).getText().split(":")[1].trim());
		
		
		 System.out.println(n1);
		 
		 if (sum==n1){
			 {
					js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 1px solid red;');", amt);
					//WebElement ele = driver.findElement(By.cssSelector("div[class='tableFixHead']"));
					//js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
			 }
		 }
		 
		 else {
			 
			 System.out.println("fail"); ;
		 }
				
		
		
		
	//	
		
		
	
	
   
	}
	
}
