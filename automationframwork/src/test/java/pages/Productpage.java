package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productpage {

    WebDriver driver;

    By addProduct = By.id("add-to-cart-sauce-labs-backpack");
    By cart = By.className("shopping_cart_link");

    public Productpage(WebDriver driver) {
        this.driver = driver;
    }

    public void addProduct() {
        driver.findElement(addProduct).click();
    }

    public void openCart() {
        driver.findElement(cart).click();
    }
}