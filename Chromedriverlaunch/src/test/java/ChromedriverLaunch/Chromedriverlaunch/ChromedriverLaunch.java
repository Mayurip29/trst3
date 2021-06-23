package ChromedriverLaunch.Chromedriverlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromedriverLaunch  {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.gecko.driver","D://ECLIPSE//Drivers//geckodriver-v0.29.1-win64//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		
		//WebDriver driver = new FirefoxDriver();
		WebDriver  driver = new ChromeDriver();
		driver.get("http://google.com");
	    driver.manage().window().maximize();
	    driver.navigate().to("http://facebook.com");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mandalmp2907@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("cutemayu07");
	    driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();
	    
	    //driver.navigate().back();
	    //driver.navigate().refresh();
	    
		 String title = driver.getTitle();
		System.out.println(title);
		
		 String Currenturl = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//driver.getPageSource();
		System.out.println(driver.getPageSource());
		
		if(Currenturl.equals(title) );
		System.out.println("correct  url header");
		
		
		//driver.close();
		
		
	}

}
