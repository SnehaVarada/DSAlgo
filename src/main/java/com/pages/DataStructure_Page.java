package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataStructure_Page extends Base_Page{
	
	public DataStructure_Page(WebDriver driver)
	{
		super(driver);
	}

	
  @FindBy(xpath = "(//a[@class='align-self-end btn btn-lg btn-block btn-primary'])[1]") 
   WebElement started;
  @FindBy(xpath = "//a[@class= 'list-group-item']") WebElement tcmplxty;
  @FindBy(linkText = "Data Structures-Introduction") WebElement DSIntro;
  @FindBy(xpath = "//a[@href='/tryEditor']") WebElement DSTryHr;
  @FindBy(linkText="Time Complexity") WebElement DSTMCmp;
  @FindBy(xpath="//div[@class='CodeMirror cm-s-default']") WebElement Txtbx;
  @FindBy(xpath="//button[@type='button']") WebElement Rn;
 
  public void DSstart()
  {
	  started.click();
  }
  public void TimeComplexity() {
	  tcmplxty.click();
  }
  public void DSIntroduction() {
	  DSIntro.click();
  }
  public void DSTryHere()
  {
	  DSTryHr.click();
  }
  public void TextBox()
  {
	//  Txtbx.sendKeys("print("Hello")");
  }
  public void Run()
    {
	  Rn.click();
	  }
 

}
