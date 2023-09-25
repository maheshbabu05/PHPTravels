package FirstPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupClass {
	
	
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();	
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.get("https://phptravels.com/");
	     driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/div/a[2]/strong")).click();
	     
	     // Personal info
	     driver.get("https://phptravels.org/register.php");
	     driver.findElement(By.xpath("//*[@id=inputFirstName]")).sendKeys("Mahesh");
	     driver.findElement(By.xpath("//*[@id=inputLastName]")).sendKeys("12345@Test");
	     driver.findElement(By.xpath("//*[@id=inputEmail]")).sendKeys("maheshbabuece143@gmail.com");
	     driver.findElement(By.xpath("//*[@id=inputPhone]")).sendKeys("454455445");
	     
	     
			
	}
}
