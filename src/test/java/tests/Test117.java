package tests;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test117 {

	public static void main(String[] args) throws Exception
	{
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://shop.polymer-project.org");
        Thread.sleep(5000);
        //Way:1
        File dest1=new File("fullpage.png");
        File src1=driver.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src1, dest1);
        
        //Way:2
        String src2=driver.getScreenshotAs(OutputType.BASE64);
        System.out.println(src2);
        
        //Way:3
        byte src3[]=driver.getScreenshotAs(OutputType.BYTES);
        
	}

}
