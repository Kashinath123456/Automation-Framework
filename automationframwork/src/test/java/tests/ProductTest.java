package tests;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.LoginPage;
import pages.Productpage;

public class ProductTest extends Baseclass{

@Test
public void addToCart() throws Exception{

setup();

LoginPage lp=
new LoginPage(driver);

lp.loginMethod(
"standard_user",
"secret_sauce");

Productpage pp=
new Productpage(driver);

pp.addProduct();

pp.openCart();

tearDown();

}
}