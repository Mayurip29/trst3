package ChromedriverLaunch.Chromedriverlaunch;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		
		
		WebElement Alerttext = driver.findElement(By.cssSelector("a[class='blinkingText']"));
		Alerttext.click();
		
		
		
		String parent = driver.getWindowHandle();
		
		
		Set <String> Windows = driver.getWindowHandles();
		
		Iterator<String> it = Windows.iterator();
		
		
		

		
		while(it.hasNext())
		{

		String child_id =it.next();


		if(!parent.equals(child_id))
		{
		driver.switchTo().window(child_id);

		System.out.println(driver.switchTo().window(child_id).getTitle());
		
		WebElement emailtext = driver.findElement(By.xpath("//p[@class='im-para red']"));
		
	String emailid =	emailtext.getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(emailid);
		

		//driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys("mentor@rahulshettyacademy.com");
		
		
		
	}
	

}