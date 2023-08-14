import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		// System.out.println(driver.findElement(By.cssSelector("label[for='benz']")).getText());
		String item = driver.findElement(By.cssSelector("label[for='honda']")).getText();
		driver.findElement(By.id("dropdown-class-example")).click();
		WebElement abc = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropdown = new Select(abc);
		List<WebElement> op = dropdown.getOptions();

		for (int i = 0; i < op.size(); i++) {
			String options = op.get(i).getText();
			System.out.println(options);
			if (op.get(i).getText().equalsIgnoreCase(item)) {
				op.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("name")).sendKeys(item);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		//String output=driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
		Assert.assertEquals(driver.switchTo().alert().getText(),"Hello"+item+", share this practice page and share your knowledge");
		//Assertion.assertEquals("Hello"+ item+", share this practice page and share your knowledge","output");
		driver.switchTo().alert().accept();

	}

}
