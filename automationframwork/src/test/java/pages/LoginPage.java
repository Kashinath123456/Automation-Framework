package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void loginMethod(String username, String password) {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("user-name")));

        driver.findElement(By.id("user-name"))
                .sendKeys(username);

        driver.findElement(By.id("password"))
                .sendKeys(password);

        driver.findElement(By.id("login-button"))
                .click();
    }
}