package pages;

import org.openqa.selenium.*;

public class CartPage {

WebDriver driver;

By checkout=
By.id("checkout");

public CartPage(WebDriver driver){

this.driver=driver;

}

public void clickCheckout(){

driver.findElement(checkout)
.click();

}

}