package com.github.vitalliuss.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogPage extends Page
{
	private final String URL = "http://catalog.onliner.by";

	private final By phonesLocator = By.linkText("Мобильные телефоны");

	public CatalogPage(WebDriver driver)
	{
		super(driver);
	}

	public void open()
	{
		getDriver().get(URL);
	}

	public void selectMobilePhones()
	{
		WebElement phones = getDriver().findElement(phonesLocator);
		phones.click();
	}
}
