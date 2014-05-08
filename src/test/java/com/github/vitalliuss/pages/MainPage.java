package com.github.vitalliuss.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends Page
{
	private final String URL = "http://www.onliner.by";

	private final By navigationPaneLocator = By.className("b-main-navigation");
	private final By catalogLocator = By.linkText("Каталог и цены");

	public MainPage(WebDriver driver)
	{
		super(driver);
	}

	public void open()
	{
		getDriver().get(URL);
	}

	public CatalogPage selectCatalog()
	{
		WebElement navigationPane = getDriver().findElement(navigationPaneLocator);
		WebElement catalog = navigationPane.findElement(catalogLocator);

		catalog.click();
		return new CatalogPage(driver);
	}

}
