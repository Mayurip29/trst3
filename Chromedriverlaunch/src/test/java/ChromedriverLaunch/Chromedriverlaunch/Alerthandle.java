package ChromedriverLaunch.Chromedriverlaunch;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Alerthandle {

	public static void main(String[] args) throws IOException {
		
		

		System.setProperty("webdriver.chrome.driver", "D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		getscreenshotAs(driver);
		

		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

		List<WebElement> Checkbox = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(Checkbox.size());

		WebElement textbox = driver.findElement(By.cssSelector("#name"));
		textbox.sendKeys("hello");
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		textbox.sendKeys("text");
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		// driver.switchTo().alert();
		System.out.println(alert.getText());

		// TakesScreenshot scrShot =((TakesScreenshot)driver);

		// Call getScreenshotAs method to create image file

		alert.dismiss();

		// Assert.assertTrue((driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected()));
	}
	

	public static void getscreenshotAs(WebDriver driver) throws IOException {
		// TODO Auto-generated method stub
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File DestFile = new File("D:\\ECLIPSE\\screenshot\\New folder.png");

		FileUtils.copyFile(SrcFile, DestFile);
	}

}
