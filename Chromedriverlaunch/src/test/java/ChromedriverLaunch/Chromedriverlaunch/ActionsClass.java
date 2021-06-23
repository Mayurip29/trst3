package ChromedriverLaunch.Chromedriverlaunch;




//import static org.junit.Assert.assertEquals;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
 
public class ActionsClass {
 
 public static void main(String[] args) {
 
        // Initialize ChromeDriver
	 System.setProperty("webdriver.chrome.driver", "D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       
        //Navigate to the demo site
        driver.get("https://demoqa.com/text-box");
        
        //Create object of the Actions class
        Actions actions = new Actions(driver);
       
        
        // Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");
        
        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");
        
        
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
        
        
        // Select the Current Address using CTRL + A
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        // Copy the Current Address using CTRL + C
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        //Press the TAB Key to Switch Focus to Permanent Address
        actions.sendKeys(Keys.TAB);
        actions.build().perform();
        
        //Paste the Address in the Permanent Address field using CTRL + V
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        
        //Compare Text of current Address and Permanent Address
        
        
        
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        Assert.assertNotSame(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
        
        
        //driver.close();
 
 }
 
}





/*import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions seriesofaction = new Actions(driver);
		
		
		WebElement account1= driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));

		
		
		//NoTE 1:---BY USING BUILD WE ARE SETTING UP THE ACTION METHOD, AND BY ADDING PERFORM WE CAN PERFFORM THAT ACTION.
		
		//NOTE 2: - TO SEND CAPITAL LETTER IN ACTIONS-WE USE KEYDOWN(KEYS.SHIFT)
		
		
		//NOTE3-- FOR SELECTING ANY TEXT WE NEED TO USE DOUBLECLICK MRTHOD.
		WebElement searchBox = driver.findElement(By.cssSelector("[id='twotabsearchtextbox']"));
		seriesofaction.moveToElement(searchBox)
		.click()
		.keyDown(Keys.SHIFT)
		.sendKeys("gel pen")
		.doubleClick()
		.build()
		.perform();
		
		
		///----TO DELETE ANY VALUES ENTERED IN TEXTBOX,
		//KEYDOWN OS USED TO HOLD ANY KEY ENTERED THROUGH KEYBOARD WHILE KEYUP IS USED TO RELEASE ANY KEY ENTERED
		
		
		seriesofaction.click(searchBox)
			    .keyDown(Keys.CONTROL)
			    .sendKeys("a")
			    .keyUp(Keys.CONTROL)
			    .sendKeys(Keys.BACK_SPACE)
			    .build()
			    .perform();
		
		
		
		//nOTE 4--BY USING CONTEXT CLICK WE CAN RIGHT CLICK ON  ANY ELEMENT
		

		seriesofaction.moveToElement(account1)
		.contextClick()
		.build()
		.perform();
		
		
		
		
		
		
		
		

	}

}


*/
