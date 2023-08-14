import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			driver.findElement(By.name("name")).sendKeys("Ayesha");
			driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid")).sendKeys("ayeshaBasha@gmail.com");
			driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("ayesha123");
			driver.findElement(By.id("exampleCheck1")).click();
			driver.findElement(By.id("exampleFormControlSelect1"));	
			
			WebElement staticDropdown=driver.findElement(By.id("exampleFormControlSelect1"));
			Select dropdown=new Select(staticDropdown);
			dropdown.selectByIndex(1);
			//System.out.println(dropdown.getFirstSelectedOption().getText());
			//dropdown.selectByValue("AED");
			driver.findElement(By.id("inlineRadio1")).click();
			
			driver.findElement(By.xpath("//input[@type='date']")).sendKeys("09.02.1995");
			driver.findElement(By.cssSelector("input.btn.btn-success")).click();
			System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

			
	}

}
