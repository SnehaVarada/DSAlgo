package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Stack_Page extends Base_Page{

	
	public Stack_Page(WebDriver driver)
	{
		super(driver);
	}
	@FindBy (xpath = "//a[@class='align-self-end btn btn-lg btn-block btn-primary']")
	WebElement stackstrt;
	@FindBy (xpath ="//a[@href='operations-in-stack']")
	WebElement stckoper;
	@FindBy (xpath = "//a[@href='implementation']")
	WebElement stckimpli;
	@FindBy (xpath = "//a[@href='stack-applications']")
	WebElement stckapp;
	@FindBy ()
	WebElement 
	@FindBy ()
	WebElement 
	@FindBy ()
	WebElement 
	
	@FindBy (xpath = "//div[@class='CodeMirror cm-s-default']")
	WebElement  StkTxtBx;
	
	public void StackGetStart()
	{
		stackstrt.click();
	}
	public void StackOperation(){
	stckoper.click();
	}
	public void StackImplimentation() {
		stckimpli.click();
	}
	public void StackApplication() {
		stckapp.click();
	}
}
