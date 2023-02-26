package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test91 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.worldometers.info/world-population");
        WebElement e=driver.findElement(By.xpath("//span[contains(@rel,'current_population')]"));
        String x=e.getText();
        System.out.println(x);
        driver.quit();
	}

}
