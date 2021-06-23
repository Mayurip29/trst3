package ChromedriverLaunch.Chromedriverlaunch;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

//import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class linksTest {

	public static void main(String[] args) throws InterruptedException, IOException {

		//HTTP/ssl  Certificates 
		
		
		
		System.setProperty("webdriver.chrome.driver", "D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());

		List<WebElement> row = driver.findElements(By.xpath("//div[@id='gf-BIG']//table//tbody//tr"));
		System.out.println("row size " + row.size());

		List<WebElement> col = driver.findElements(By.xpath("//div[@id='gf-BIG']//table//tbody//tr//td"));
		System.out.println("col size " + col.size());
		
		
		///driver.findElement(By.xpath("//td[contains(text(),'Will')]//preceding-sibling::td//input[@type='checkbox']")) .click();
		

		WebElement Footer = driver.findElement(By.cssSelector("div[id='gf-BIG']"));

		System.out.println(Footer.findElements(By.tagName("a")).size());
		

		WebElement Column1 = Footer.findElement(By.xpath("//table//tbody//tr//td[1]//ul"));

		List<WebElement> column1Links = Column1.findElements(By.tagName("a"));

		for (int i = 1; i < column1Links.size(); i++)

		{
		
			//NOTE--WE WILL NOT USE BACK BECAUSE IF WE HAVE 30 LINKS IN PREVIOUS PAGE THEN IT WILL GO BACK 3O TIMS AND SCRIPT WILL BE SLOW,
			//INSTEAD WE WILL PASS CTRL+CLICK TO CLICK ON ANY LINKS PRESENT.

			
			String clicklink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		     column1Links.get(i).sendKeys(clicklink);
		     Thread.sleep(5000);
			
		}
		
		
				
				
				Set <String> Windows = driver.getWindowHandles();
				
				Iterator<String> it = Windows.iterator();
				
				
				

			////below code is used when we have multiple child windows present and we are not switching from parent to single child windows	
				while(it.hasNext())
				{

				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				

			

		
		
		
		

		

	}
}
}


