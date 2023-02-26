package tests;

import java.time.Duration;

import org.openqa.selenium.ScriptKey;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test192 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.get("https://users.cs.cf.ac.uk/Dave.Marshall/Internet/FRAMES/nested_frame.html");
		Thread.sleep(5000);
		//write JavaScript statements individually
		ScriptKey sk1=driver.pin("return(window.frames.length);");
		ScriptKey sk2=driver.pin("var frames=window.frames;");
		ScriptKey sk11=driver.pin("frames[1].location='https://www.hyderabad.com';");
		ScriptKey sk22=driver.pin("frames[2].location='https://www.google.co.in';");
		ScriptKey sk3=driver.pin("frames[3].location='https://www.bbc.com';");
		ScriptKey sk4=driver.pin("frames[4].location='https://www.magnitia.com';");
		ScriptKey sk0=driver.pin("frames[0].location='https://www.india.com';");
		//Scenario-1:
		long n=(long) driver.executeScript(sk1);
		System.out.println(n);
		//Scenario-2:
		driver.executeScript(sk2); //collect frames
		driver.executeScript(sk0); //go to 1stframe
		//Scenario-3:
		driver.executeScript(sk2); //collect frames
		driver.executeScript(sk3); //go to 4th frame
		//Scenario-4:
		driver.executeScript(sk2); //collect frames
		driver.executeScript(sk4); //go to 5th frame
				
	}

}
