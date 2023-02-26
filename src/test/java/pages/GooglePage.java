package pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage 
{
   @FindBy(name="q")
   private WebElement searchbox;
   
   @FindBy(linkText="Gmail")
   private WebElement link1;
   
   @FindBy(linkText="Gmail")
   @CacheLookup
   private WebElement link2;
   
   public GooglePage(RemoteWebDriver driver) {
	PageFactory.initElements(driver,this);
   }
   public void fillsearchbox(String x) {
	   searchbox.sendKeys(x);
   }
   public long getTimeWithoutCacheLookup() {
	   long x=System.currentTimeMillis();
	   for(int i=1;i<=1000;i++)
	   {
		   link1.getText();
	   }
	   return(x);
   }
   public long getTimeWithCacheLookup() {
	   long y=System.currentTimeMillis();
	   for(int i=1;i<=1000;i++) {
		   link2.getText();
	   }
	   return(y);
   }
   
   
}
