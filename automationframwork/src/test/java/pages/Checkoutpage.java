package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage {

    WebDriver driver;

    By checkoutButton =
            By.id("checkout");

    By firstName =
            By.id("first-name");

    By lastName =
            By.id("last-name");

    By postalCode =
            By.id("postal-code");

    By continueButton =
            By.id("continue");

    By finishButton =
            By.id("finish");

    public Checkoutpage(WebDriver driver) {

        this.driver = driver;
    }

    public void checkout(
            String fname,
            String lname,
            String zip) {

        driver.findElement(checkoutButton)
              .click();

        driver.findElement(firstName)
              .sendKeys(fname);

        driver.findElement(lastName)
              .sendKeys(lname);

        driver.findElement(postalCode)
              .sendKeys(zip);

        driver.findElement(continueButton)
              .click();

        driver.findElement(finishButton)
              .click();
    }
}