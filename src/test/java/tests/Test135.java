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

public class Test135 {

	public static void main(String[] args) 
	{
	   WebDriverManager.chromedriver().setup();
	   RemoteWebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
	   wait.withTimeout(Duration.ofSeconds(20));
	   wait.pollingEvery(Duration.ofMillis(1000));
	   driver.get("https://www.cssscript.com/demo/generic-country-state-dropdown-list-countries-js");
	   String expected_country="Cuba";
	   List<String> expected_states=new ArrayList<String>();
	   expected_states.add("Camaguey");
	   expected_states.add("Granma");
	   expected_states.add("Holguin");
	   expected_states.add("Guantanamo");
	   expected_states.add("Ciego de Avila");
	   expected_states.add("Cienfuegos");
	   expected_states.add("La Habana");
	   expected_states.add("Las Tunas");
	   expected_states.add("Pinar del Rio");
	   expected_states.add("Villa Clara");
	   expected_states.add("Santiago de Cuba");
	   expected_states.add("Sancti Spiritus");
	   expected_states.add("Matanzas");
	   expected_states.add("Isla de la Juventud");
	   expected_states.add("Ciudad de La Habana");
	   WebElement country=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("country")));
       Select cs=new Select(country);
       cs.selectByVisibleText(expected_country); 
       //Get sates and observe as per that selected country
       WebElement states=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("state")));
       Select ss=new Select(states);
       List<WebElement> items=ss.getOptions();
       //Copy all items except first item(default item) into array
       List<String> actual_states=new ArrayList<String>();
       for(int i=1;i<items.size();i++)
       {
       	actual_states.add(items.get(i).getText());
       }
       //sort both actual and expected
       Collections.sort(actual_states);
       Collections.sort(expected_states);
       //Compare both lists
       if(expected_states.equals(actual_states))
       {
       	System.out.println("Correct states are visible for selected country");
       }
       else
       {
       	System.out.println("Incorrect states are visible for selected country");
       }
       //close site
       driver.close();
	}

}
