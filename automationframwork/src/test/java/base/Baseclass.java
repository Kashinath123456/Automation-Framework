package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

    public static WebDriver driver;

    public void setup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();   // Opens browser
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
    }

    public void tearDown() {

        if(driver != null) {
            driver.quit();   // Closes browser automatically
        }
    }
}