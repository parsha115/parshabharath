package tests;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test200 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.get("https://www.groupboard.com/demo/groupboard-online-whiteboard-demo.shtml");
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dont_show_again"))).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Got It!']"))).click();
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("centre"))).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("trash"))).click();
	    wait.until(ExpectedConditions.alertIsPresent()).accept();
	    
	    Point headorigin=new Point(450,250);
		Point leftEyeorigin=headorigin.moveBy(-50,-50);
		Point rightEyeorigin=headorigin.moveBy(50,-50);
		Point mouthorigin=headorigin.moveBy(0, 50);
		
		drawCircle(driver,headorigin,150,60,"full");
		drawCircle(driver,leftEyeorigin, 20, 20,"half");
		drawCircle(driver,rightEyeorigin, 20, 20,"full");
		drawCircle(driver,mouthorigin,40, 30,"half");
		Thread.sleep(5000);
		//Clear finished drawings
		wait.until(ExpectedConditions.elementToBeClickable(By.id("trash"))).click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		Thread.sleep(5000);
	}

	private static void drawCircle(RemoteWebDriver driver, Point origin, double radius, int steps, String style) 
	{
		Point firstPoint=new Point((int)(origin.x+radius),origin.y);
		PointerInput pi=new PointerInput(PointerInput.Kind.MOUSE,"mouse");
		Sequence circle=new Sequence(pi,0);
		Interaction a1=pi.createPointerMove(Duration.ofMillis(20), PointerInput.Origin.viewport(),
				                        firstPoint.x,firstPoint.y);
		circle.addAction(a1);
		//
		Interaction a2=pi.createPointerDown(PointerInput.MouseButton.LEFT.asArg());
		circle.addAction(a2);
		//
		int p=steps;
		if(style.equals("half"))
		{
			p=steps/2;
		}
		for(int i=1;i<=p; i++)
		{
			double theta=2*Math.PI*((double)i/steps);
		    int xoffset=(int)Math.floor(Math.cos(theta)*radius);
		    int yoffset=(int)Math.floor(Math.sin(theta)*radius);
		    Point nextpoint=new Point(origin.x + xoffset,origin.y + yoffset);
		    Interaction a3=pi.createPointerMove(Duration.ofMillis(50),
                    							PointerInput.Origin.viewport(), 
                    							nextpoint.x, 
                    							nextpoint.y);
	        circle.addAction(a3);
		}
		 Interaction a4=pi.createPointerUp(PointerInput.MouseButton.LEFT.asArg());
		 circle.addAction(a4);
		 driver.perform(Arrays.asList(circle));
	}

}
