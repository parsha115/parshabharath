package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test97 {

	public static void main(String[] args)  throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.flipkart.com");
        WebElement e=driver.findElement(By.xpath("(//span[text()='Become a Seller'])[1]"));
        String s=e.getText();
        System.out.println(s);
        int w=e.getSize().getWidth();
        int h=e.getSize().getHeight();
        System.out.println(w+" "+h);
        int x=e.getLocation().getX();
        int y=e.getLocation().getY();
        System.out.println(x+" "+y);
        int w1=e.getRect().getWidth();
        int h1=e.getRect().getHeight();
        int x1=e.getRect().getX();
        int y1=e.getRect().getY();
        System.out.println(w1+" "+h1+" "+x1+" "+y1);
        driver.quit();
	}

}
