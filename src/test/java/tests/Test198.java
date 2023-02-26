package tests;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test198 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.get("https://www.groupboard.com/demo/groupboard-online-whiteboard-demo.shtml");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dont_show_again"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Got It!']"))).click();
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("trash"))).click();
	    wait.until(ExpectedConditions.alertIsPresent()).accept();
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("centre"))).click();
	    PointerInput pi=new PointerInput(PointerInput.Kind.MOUSE,"mouse");
	    Sequence s=new Sequence(pi,0);  //initial count is 0
	    //1.move to first point
	    Interaction a1=pi.createPointerMove(Duration.ofMillis(5000),PointerInput.Origin.viewport(),200,25);
	    s.addAction(a1);
	    //2. click and hold mouse left button
	    Interaction a2=pi.createPointerDown(PointerInput.MouseButton.LEFT.asArg());
	    s.addAction(a2);
	    //3. move to 2nd point
	    Interaction a3=pi.createPointerMove(Duration.ofMillis(5000),PointerInput.Origin.viewport(),500,25);
	    s.addAction(a3);	    
		//4. release mouse left button
	    Interaction a4=pi.createPointerUp(PointerInput.MouseButton.LEFT.asArg());
	    s.addAction(a4);
	    //5.Perform all defined actions
	    driver.perform(Arrays.asList(s));
	    Thread.sleep(5000);
		//Clear finished drawings
		wait.until(ExpectedConditions.elementToBeClickable(By.id("trash"))).click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		Thread.sleep(5000); 
		//Close site
				driver.switchTo().defaultContent();
			  	driver.close();
	}

}
