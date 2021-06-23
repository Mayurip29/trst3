package ChromedriverLaunch.Chromedriverlaunch;




import java.util.List;
import java.util.concurrent.TimeUnit;

//import static org.junit.Assert.assertEquals;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
 
public class Frame1 {
 
 public static void main(String[] args) {
 
	 System.setProperty("webdriver.chrome.driver", "D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> Frame =driver.findElements(By.tagName("iframe")) ;
		System.out.println(Frame.size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
	
		
		
		
		WebElement Drag = driver.findElement(By.id("draggable"));
		boolean b = Drag.isDisplayed();
		System.out.println(b);
		System.out.println("v");
		
		
		
		WebElement Drop = driver.findElement(By.id("droppable"));
		
        


   Actions Act1 = new Actions(driver);
   Act1.dragAndDrop(Drag, Drop).build().perform();
   driver.switchTo().defaultContent();
 
 
 
 
 
 
 
 
 
 
 }
 
}