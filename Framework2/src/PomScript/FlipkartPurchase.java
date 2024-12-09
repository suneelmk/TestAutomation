package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPurchase
{
   @FindBy(xpath="(//div[@class='KzDlHZ'])[1]")
   private WebElement phone;
   @FindBy(xpath="//button[@class='QqFHMw vslbG+ In9uk2']")
   private WebElement addcart;
   @FindBy(xpath="//button[@class='QqFHMw zA2EfJ _7Pd1Fp']")
   private WebElement order;
    
   public FlipkartPurchase(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   public void p()
   {
	   phone.click();
   }
   public void ac()
   {
	   addcart.click();
   }
   public void o()
   {
	   order.click();
   }
  
}
