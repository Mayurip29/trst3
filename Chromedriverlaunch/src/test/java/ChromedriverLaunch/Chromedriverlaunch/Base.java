package ChromedriverLaunch.Chromedriverlaunch;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String[] items = { "Cucumber", "Brocolli", "Mushroom", "Carrot", "Tomato" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		additems(driver, items);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//div[@class='cart-preview active']//div[2]/button")).click();

		WebDriverWait w = new WebDriverWait(driver, 5);

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));

		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("button.promoBtn")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();

		Select select = new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']/div/select")));
		select.selectByVisibleText("India");

		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		driver.findElement(By.xpath("//div[@class='wrapperTwo']//button")).click();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),\"Thank you, your order has been placed successfully\")]")).getText());

	}

	public static void additems(WebDriver driver, String[] items) {

		int j = 0;
		List<WebElement> cartProducts = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < cartProducts.size(); i++) {
			String[] productname = cartProducts.get(i).getText().split("-");
			String formatname = productname[0].trim();
			// System.out.println(cartProducts.get(i).getText());

			List itemslist = Arrays.asList(items);
			if (itemslist.contains(formatname))

			{
				j++;
				// System.out.println("test");
				//// put findelements as there are multiple add to cart and we need to clcik on
				//// i index one
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// System.out.println("t2");
				if (j == items.length) {

					// System.out.println("t2");
					break;
				}

			}

		}
	}
}
