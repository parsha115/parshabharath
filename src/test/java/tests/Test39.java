package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test39 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        Thread.sleep(3000);
        driver.findElement(By.name("url")).click();
        driver.findElement(By.xpath("//option[text()='Books']")).click();
        driver.findElement(By.name("field-keywords")).sendKeys("hard work book",Keys.ENTER);
        driver.findElement(By.xpath("(//img[@class='s-image']/parent::div)[4]")).click();
        Thread.sleep(3000);
        Set<String> s=driver.getWindowHandles();
        List<String> l=new ArrayList<String>(s);
        driver.switchTo().window(l.get(1));
        Thread.sleep(3000);
        driver.findElement(By.id("addToCart")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("proceedToRetailCheckout")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("parsharam115@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("siri1234");
        Thread.sleep(3000);
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(3000);
        driver.quit();
        Thread.sleep(2000);
	}

}
