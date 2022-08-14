package POMkitenew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fourthpage 
{
 @FindBy(xpath="//label[@for='traveller_1']") private WebElement peoplecount;
 @FindBy(xpath="//select[@id='feet']") private WebElement selectAge;
 @FindBy(xpath="//option[@value='30']") private   WebElement  age;
 @FindBy(xpath="//button[text()='Next']") private  WebElement Nexbutton;
 
 public fourthpage(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 public void selectpeople()
 {
	 peoplecount.click();
 }
 public void clickonselectage()
 {
	 selectAge.click();
 }
 public void selectage()
 {
	 age.click();
 }
 public void clickonnextbutton()
 {
	 Nexbutton.click();
 }
}
