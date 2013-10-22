package com.epam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

public class ClaccTest {

	protected WebDriver driver;
	protected String baseUrl;
	LoginPage loginPage;
	UserPage userpage;
	InternalPage internalpage;

	@BeforeClass
	public void setUp() throws Exception {
		driver = WebDriverFactory.getDriver(DesiredCapabilities.firefox());
		baseUrl = "http://www.rambler.ru";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public LoginPage goToMainPage() {

		driver.get(baseUrl + "/");

		return MyPageFactory.getPage(driver, LoginPage.class);
	}
}
