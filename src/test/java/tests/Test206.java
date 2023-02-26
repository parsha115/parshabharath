package tests;

import java.time.Duration;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.performance.Performance;
import org.openqa.selenium.devtools.v95.performance.model.Metric;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test206 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		DevTools dt=(((ChromeDriver) driver).getDevTools());
		dt.close();
	
		Command cmd1=Performance.enable(Optional.empty());
	    dt.send(cmd1);
        List<Metric> ms=dt.send(Performance.getMetrics());
        for(Metric m:ms)
        {
        	System.out.println(m.getName()+"="+m.getValue());
        }
	}

}
