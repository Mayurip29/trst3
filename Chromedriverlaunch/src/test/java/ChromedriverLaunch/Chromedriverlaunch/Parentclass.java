


	package ChromedriverLaunch.Chromedriverlaunch;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class Parentclass {
		
		
	
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
								
			System.setProperty("webdriver.gecko.driver","D://ECLIPSE//Drivers//geckodriver-v0.29.1-win64//geckodriver.exe");			
			WebDriver driver = new FirefoxDriver();

			driver.get("http://google.com");
			
		    driver.manage().window().maximize();
		    
			 String title = driver.getTitle();
			 
				System.out.println(title);
			 
		
			String actualtitle = "Google";	//m.Validateheader();
			
			if (title.equals(actualtitle))
				System.out.println("pass");
			else
				System.out.println("fail");
			
			Methodsclass m = new Methodsclass();
			System.out.println(m.Validateheader());
		
			driver.close();

}
}