package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.LoginPage;

public class loginTest extends Baseclass {

    LoginPage login;

    @BeforeMethod
    public void start() {

        setup();

        login = new LoginPage(driver);
    }

    @Test
    public void validLogin() {

        login.loginMethod(
                "standard_user",
                "secret_sauce");
    }

    @AfterMethod
    public void close() {

        tearDown();
    }
}