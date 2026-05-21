package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.*;

import utilites.ReportUtility;
import utilites.ScreenshotUtility;

import base.Baseclass;
import pages.LoginPage;

public class loginTest extends Baseclass {

    ExtentReports report;
    ExtentTest test;

    @BeforeClass
    public void startReport() {

        report = ReportUtility.setupReport();
    }

    @BeforeMethod
    public void start() throws Exception {

        setup();
    }

    @AfterMethod
    public void close() {

        tearDown();
    }

    @AfterClass
    public void endReport() {

        report.flush();
    }

    @Test
    public void validLogin() throws Exception {

        test = report.createTest("Valid Login");

        LoginPage lp = new LoginPage(driver);

        lp.loginMethod(
                "standard_user",
                "secret_sauce");

        ScreenshotUtility.capture(
                driver,
                "LoginSuccess");

        test.pass("Valid Login Passed");

        String title = driver.getTitle();

        Assert.assertEquals(
                title,
                "Swag Labs");
    }

    @Test(priority=1)
    public void validLogin1() throws Exception {

        test = report.createTest("Valid Login1");

        LoginPage lp = new LoginPage(driver);

        lp.loginMethod(
                "standard_user",
                "secret_sauce");

        ScreenshotUtility.capture(
                driver,
                "ValidLogin1");

        test.pass("Valid Login1 Passed");
    }

    @Test(priority=2)
    public void invalidLogin() throws Exception {

        test = report.createTest("Invalid Login");

        LoginPage lp = new LoginPage(driver);

        lp.loginMethod(
                "invalid_user",
                "wrong123");

        ScreenshotUtility.capture(
                driver,
                "InvalidLogin");

        test.pass("Invalid Login Executed");
    }

    @Test(priority=3)
    public void emptyLogin() throws Exception {

        test = report.createTest("Empty Login");

        LoginPage lp = new LoginPage(driver);

        lp.loginMethod(
                "",
                "");

        ScreenshotUtility.capture(
                driver,
                "EmptyLogin");

        test.pass("Empty Login Executed");
    }
}