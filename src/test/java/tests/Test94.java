package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test94 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
		driver.switchTo().frame("iframeResult");
		WebElement e=driver.findElement(By.xpath("//label[text()='HTML']"));
        if(e.isDisplayed())
        {
        	System.out.println("Element is visible in page");
        	if(e.isEnabled())
        	{
        		System.out.println("Element is enabled in page");
        		if(e.isSelected())
        		{
        			System.out.println("Element is selected in page");
        		}
        		else
        		{
        			System.out.println("Element is not selected in page. selected now");
        			e.click();
        		}
        	}
        	else
        	{
        		System.out.println("Element is disabled in page");
        	}
        }
        else
        {
        	System.out.println("Element is not visisbled in page");
        }
	}

}
