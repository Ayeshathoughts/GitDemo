import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/angularpractice/shop");
		int i=0;
		driver.findElements(By.xpath("//div[@class='card-footer'] /button")).get(i).click();
		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();
	}

}
