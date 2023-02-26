package tests;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("http://www.gmail.com");

	}

}
