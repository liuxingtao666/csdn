package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page {
	public static void login(String username,String password){


		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");             
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.csdn.net");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".userinfo    a:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#username")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.cssSelector(".logging")).click();
	}
}
