package tests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test136 {

	public static void main(String[] args) 
	{
	    WebDriverManager.chromedriver().setup();
	    RemoteWebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
	    wait.withTimeout(Duration.ofSeconds(20));
	    wait.pollingEvery(Duration.ofMillis(1000));
	    driver.get("https://www.cssscript.com/demo/generic-country-state-dropdown-list-countries-js");
	    String expected_country = "India";
	    List<String> expected_states = new ArrayList<String>();
	    expected_states.add("Andaman and Nicobar Islands");
        expected_states.add("Andhra Pradesh");
        expected_states.add("Arunachal Pradesh");
        expected_states.add("Assam");
        expected_states.add("Bihar");
        expected_states.add("Chandigarh");
        expected_states.add("Chhattisgarh");
        expected_states.add("Dadra and Nagar Haveli");
        expected_states.add("Daman and Diu");
        expected_states.add("Delhi");
        expected_states.add("Goa");
        expected_states.add("Gujarat");
        expected_states.add("Haryana");
        expected_states.add("Himachal Pradesh");
        expected_states.add("Jammu and Kashmir");
        expected_states.add("Jharkhand");
        expected_states.add("Karnataka");
        expected_states.add("Kerala");
        expected_states.add("Lakshadweep");
        expected_states.add("Madhya Pradesh");
        expected_states.add("Maharashtra");
        expected_states.add("Manipur");
        expected_states.add("Meghalaya");
        expected_states.add("Mizoram");
        expected_states.add("Nagaland");
        expected_states.add("Orissa");
        expected_states.add("Pondicherry");
        expected_states.add("Punjab");
        expected_states.add("Rajasthan");
        expected_states.add("Sikkim");
        expected_states.add("Tamil Nadu");
        expected_states.add("Tripura");
        expected_states.add("Uttar Pradesh");
        expected_states.add("Uttaranchal");
        expected_states.add("West Bengal");
	    WebElement country=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("country")));
	    Select cs=new Select(country);
	    cs.selectByVisibleText(expected_country); 
	    WebElement states=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("state")));
	    Select ss=new Select(states);
	    List<WebElement> items=ss.getOptions();
	    List<String> actual_states=new ArrayList<String>();
	    for(int i=1;i<items.size();i++)
	    {
	    	 actual_states.add(items.get(i).getText());
	    }
	    Collections.sort(actual_states);
	    Collections.sort(expected_states);
	    if(expected_states.equals(actual_states))
	    {
	    	System.out.println("Correct states are visible for selected country");
	    }
	    else
	    {
	    	System.out.println("Incorrect states are visible for selected country");
	    }
	    
	    System.out.println("count of states is : "+actual_states.size());
	    
   	    System.out.println("states of india :----- "); 
   	    System.out.println(ss.getWrappedElement().getText());
	   // driver.close();
	    
	}

}
