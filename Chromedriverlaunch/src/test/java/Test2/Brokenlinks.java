package Test2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
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

public class Brokenlinks {

	public static void main(String[] args) throws InterruptedException, IOException, MalformedURLException {

		// HTTP/ssl Certificates

		System.setProperty("webdriver.chrome.driver", "D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "";

		
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());
		
			 Iterator<WebElement> it = links.iterator();
		        
		        while(it.hasNext()){
		            
		            url = it.next().getAttribute("href");
		            System.out.println(url);
		            
		       try {
			HttpURLConnection conn1 = (HttpURLConnection) new URL(url).openConnection();

			conn1.setRequestMethod("HEAD");
			conn1.connect();
			int respcode = conn1.getResponseCode();
			System.out.println(respcode);
			if (respcode >=400)

			{

				System.out.println("Link not working");
				Assert.assertTrue(true);
			}

			else 
			
			
			{
				System.out.println("Link  working");

			}

                    
            } 
		       catch (MalformedURLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
		       
		        
		        }
        }
        
		}
	

