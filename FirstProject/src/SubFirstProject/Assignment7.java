package SubFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());
		System.out.println(driver.findElements(By.cssSelector(".table-display tr th")).size());
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());

	}
	
}
