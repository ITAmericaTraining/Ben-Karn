package NetflixLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NetflixLogin extends BaseClass{
	
	public NetflixLogin(WebDriver driver) {
		super(driver);
	}
	
	public NetflixLogin ProvideUserInfo() {
		
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc");
		    driver.findElement(By.xpath("//button[contains(.,'Sign In')]")).click();
		    
		    return new NetflixLogin(driver);
		
	}

	public NetflixLogin LaunchTheWebsite() {
		driver.get("https://www.netflix.com");
		
		return new NetflixLogin(driver);
	
	}
	
	
	
	
	
}
