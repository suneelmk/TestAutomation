package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	@FindBy(id="email")
	private WebElement us;
	@FindBy(id="pass")
	private WebElement psw;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement log;
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void user(String UN)
	{
		us.sendKeys(UN);
	}
	public void password(String ps)
	{
		psw.sendKeys(ps);
	}
	public void button()
	{
		log.click();
	}
	

}
