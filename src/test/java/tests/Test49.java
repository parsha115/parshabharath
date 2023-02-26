package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test49 {

	public static void main(String[] args) throws Exception
	{
			WebDriverManager.chromedriver().setup();
            RemoteWebDriver driver=new ChromeDriver();
            driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
            Thread.sleep(5000);
            driver.switchTo().frame("iframeResult");
            driver.findElement(By.xpath("//button[text()='Try it']")).click();
            Thread.sleep(5000);
            Alert a=driver.switchTo().alert();
            String  e=a.getText();
            System.out.println(e);
            a.dismiss();
            Thread.sleep(3000);
            driver.quit();
	}

}
