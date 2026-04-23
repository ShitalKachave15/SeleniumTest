package SampleTest.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver;
		DesiredCapabilities cap= new DesiredCapabilities();
		   
	cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		driver=new RemoteWebDriver(new URL("http://192.168.127.1:5555/wd/hub"),cap);
		 String url="https://www.facebook.com/"; 
		  driver.get(url); // fetch the url or  get the url
		//driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shital");  //used the id locator
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
	}

}
