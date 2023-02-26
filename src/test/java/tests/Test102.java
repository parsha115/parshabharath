package tests;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test102 {

	public static void main(String[] args) throws Exception
	{
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
       driver.switchTo().frame("iframeResult");
       WebElement e=driver.findElement(By.name("lname"));
    // Way:1
       Thread.sleep(5000);
       File dest1=new File("disabledpic.png");
       File src1=e.getScreenshotAs(OutputType.FILE);
       FileHandler.copy(src1, dest1);
    // Way:2
       Thread.sleep(5000);
       String src2=e.getScreenshotAs(OutputType.BASE64);
       System.out.println(src2);
    // Way:3
       byte src3[]=e.getScreenshotAs(OutputType.BYTES);
       
       driver.quit();
	}

}
