package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test90 {

	public static void main(String[] args) throws Exception
	{
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://gmail.com");
        WebElement e=driver.findElement(By.name("hiddenPassword"));
        String x=e.getText();
        System.out.println(x);
       
        String y=(String) driver.executeScript("return(arguments[0].textContent);",e);
        System.out.println(y);
        driver.quit();
        
	}

}
