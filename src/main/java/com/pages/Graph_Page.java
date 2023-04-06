package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Graph_Page extends Base_Page {

	public Graph_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//a[@href='graph']")  WebElement started;
	@FindBy(xpath="") WebElement 

}
