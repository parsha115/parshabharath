package tests;

import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Test119 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://shop.polymer-project.org");
        driver.findElement(By.xpath("//shop-app[@page='home']")).getShadowRoot().findElement(By.linkText("Men's T-Shirts")).click();
        AShot as=new AShot();
        ShootingStrategy shs=ShootingStrategies.viewportPasting(1000);
        Screenshot ss=as.shootingStrategy(shs).takeScreenshot(driver);
        File dest=new File("target\\fullpagescreenshotmen.png");
        ImageIO.write(ss.getImage(), "PNG", dest);
	}

}
