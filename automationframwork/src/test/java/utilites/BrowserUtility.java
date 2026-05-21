package utilites;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
public class BrowserUtility {
	
	public static void maximize(WebDriver driver){

		driver.manage().window().maximize();

		}

		public static void implicitWait(WebDriver driver){

		driver.manage().timeouts()
		.implicitlyWait(
		Duration.ofSeconds(10));

		}

}
