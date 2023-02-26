package tests;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args)
	{
		// take browser name from keyboard
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter browser name");
        String bn=sc.nextLine();
        sc.close();
        //open browser depends upon given name
        if(bn.equals("chrome"))
        {
        	WebDriverManager.chromedriver().setup();
        	ChromeDriver driver=new ChromeDriver();
        }
        else if(bn.equals("firefox"))
        {
        	WebDriverManager.firefoxdriver().setup();
        	FirefoxDriver driver=new FirefoxDriver();
        }
        else if(bn.equals("opera"))
        {
        	WebDriverManager.operadriver().setup();
        	OperaDriver driver=new OperaDriver();
        }
        else if(bn.equals("edge"))
        {
        	WebDriverManager.edgedriver().setup();
            EdgeDriver driver=new EdgeDriver();
        }
        else
        {
        	System.out.println("Wrong browser name");
        }
	   
	}

}
