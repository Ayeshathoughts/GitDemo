import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AyeshaSelIntro   {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://rahulshettyacademy.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
			driver.quit();
			
		 
	}

}
