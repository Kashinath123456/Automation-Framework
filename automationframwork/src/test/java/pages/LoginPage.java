package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

WebDriver driver;

By username=By.id("user-name");

By password=By.id("password");

By login=By.id("login-button");

public LoginPage(WebDriver driver){

this.driver=driver;

}

public void loginMethod(String user,String pass){

driver.findElement(username).sendKeys(user);

driver.findElement(password).sendKeys(pass);

driver.findElement(login).click();

}

}