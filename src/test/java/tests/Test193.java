package tests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.ScriptKey;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test193 {

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
	    driver.pin("return(window.frames.length);");
		driver.pin("var frames=window.frames;");
	    driver.pin("frame[0].location'https://www.india.com';");
		driver.pin("frame[1].location'https://www.hyderabad.com';");
		driver.pin("frame[2].location'https://www.magnitiait.com';");
		driver.pin("frame[3].location'https://www.bbc.com';");
		driver.pin("frame[4].location'https://www.amazon.in';");
		driver.pin("frame[5].location'https://www.google.co.in';");
	
		driver.pin("frames[3].location='https://www.bbc.com';");
		driver.pin("frames[5].location='https://www.google.com';");
		
    	Set<ScriptKey> l1=driver.getPinnedScripts(); //sequential collection
		ArrayList<ScriptKey> al1=new ArrayList<ScriptKey>(l1); //random collection
		System.out.println(al1.size());
		//unpin all statements and verify list
		for(ScriptKey sk:al1)
		{
			driver.unpin(sk);		
		}
		Set<ScriptKey> l2=driver.getPinnedScripts(); //sequential collection
		ArrayList<ScriptKey> al2=new ArrayList<ScriptKey>(l2); //random collection
		System.out.println(al2.size());
		
		driver.close();
	}

}
