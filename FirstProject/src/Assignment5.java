import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame(1);
		//driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
	
		
		
	
		
		

	}

}
