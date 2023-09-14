package com.fdmgroup.testscripts;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.data.DataFile;
import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.pages.UserIndexPage;
import com.fdmgroup.util.DriverUtilities;

public class LoginTest {
	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Before
	public void setUp() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}

	@Test
	public void testLoginFunctionality() {
		driver.manage().window().maximize();
		driver.get(DataFile.url);
		if (HomePage.signInButton(driver).isDisplayed()) {
			HomePage.signInButton(driver).click();
		}
		assertEquals(DataFile.loginPageHeader, LoginPage.loginPageHeader(driver).getText());

		LoginPage.usernameField(driver).sendKeys(DataFile.usr);
		LoginPage.passwordField(driver).sendKeys(DataFile.psw);
		LoginPage.signInButton(driver).click();

		driver.navigate().back();

		assertEquals(DataFile.usr, UserIndexPage.usernameDropDown(driver).getText());
	}

}
