import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.cssSelector("div[id='checkbox-example'] label")).click();
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(driver.findElements(By.cssSelector("div[id='checkbox-example'] label")).size());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
				
		//driver.findElement(By.cssSelector("input[id='checkBoxOption2']")).click();
				//Thread.sleep(2000);
				//driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).click();
				//Thread.sleep(2000);
		
		
		
	}

}
