package com.github.vitalliuss;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.vitalliuss.pages.CatalogPage;
import com.github.vitalliuss.pages.MainPage;

@RunWith(JUnit4.class)
public class SmokeTest extends TestCase
{

	private WebDriver driver;

	@Before
	public void initBrowser()
	{
		driver = new FirefoxDriver();
	}

	@Test
	public void oneCanSelectPhonesPageInCatalog()
	{
		// Open main page
		MainPage mainPage = new MainPage(driver);
		mainPage.open();
		// Select Catalog
		CatalogPage catalogPage = mainPage.selectCatalog();
		// Select mobile phones from catalog
		catalogPage.selectMobilePhones();
	}

	@After
	public void destroyBrowser()
	{
		driver.quit();
	}
}
