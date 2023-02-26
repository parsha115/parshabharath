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

public class Test138 {

	public static void main(String[] args)
	{
	   WebDriverManager.chromedriver().setup();
	   RemoteWebDriver driver=new ChromeDriver();
	   FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
	   wait.withTimeout(Duration.ofSeconds(20));
	   wait.pollingEvery(Duration.ofMillis(1000));
	   driver.get("https://www.cssscript.com/demo/generic-country-state-dropdown-list-countries-js");
	   String expected_country="Australia";
	   List<String> expected_states=new ArrayList<String>();
	   expected_states.add("New South Wales");
	   expected_states.add("Victoria");
	   expected_states.add("Western Australia");
	   expected_states.add("Tasmania");
	   expected_states.add("Queensland");
	   expected_states.add("Northern Territory");
	   expected_states.add("Australian Capital Territory");
	   expected_states.add("South Australia");
	   WebElement contry=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("country")));
	   Select cs=new Select(contry);
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
	   System.out.println("Count of states is : "+items.size());
	   System.out.println(ss.getWrappedElement().getText());
	   driver.close();
	}

}
