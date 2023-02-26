package tests;

import java.time.Duration;
import java.util.Arrays;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test199 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		WebElement e=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail")));
		int x=e.getLocation().getX();
		int y=e.getLocation().getY();
		PointerInput pi=new PointerInput(PointerInput.Kind.MOUSE,"mouse");
	    Sequence s=new Sequence(pi,0); //initial count is 0
	    Interaction a1=pi.createPointerMove(Duration.ofMillis(5000),PointerInput.Origin.viewport(),x,y);
	    s.addAction(a1);
	    Interaction a2=pi.createPointerDown(PointerInput.MouseButton.LEFT.asArg());
	    s.addAction(a2);
	    Interaction a3=pi.createPointerUp(PointerInput.MouseButton.LEFT.asArg());
	    s.addAction(a3);
	    driver.perform(Arrays.asList(s));
	    
	}

}
