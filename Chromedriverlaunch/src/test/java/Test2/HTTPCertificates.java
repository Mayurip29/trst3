package Test2;

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

public class HTTPCertificates {

public static void main(String[] args) throws InterruptedException, IOException {

			//HTTP/ssl  Certificates 
			
			
			
			DesiredCapabilities ch = DesiredCapabilities.chrome();
			ch.acceptInsecureCerts();
			ChromeOptions c = new ChromeOptions();
			c.merge(ch);
			ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			
			System.setProperty("webdriver.chrome.driver", "D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

			WebDriver driver = new ChromeDriver(c);
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().deleteAllCookies();
			
			//String s1 = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			//driver.findElement(By.id("usernmae")).sendKeys(s1);
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D://screenshot.png"));
			
			
	
		}

	}



