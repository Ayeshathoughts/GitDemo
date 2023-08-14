package SubFirstProject;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class MultipleTabsandWindow {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//driver.findElement(By.cssSelector("[name='name']"));
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.get("https://www.rahulshettyacademy.com/");
		String username=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		driver.switchTo().window(parentId);
		//driver.findElement(By.cssSelector("[name='name']")).sendKeys(username);
		// to take screenshot
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(username);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("F:\\basha\\Selenium course Udemy\\screenshots\\logo.png"));
		
		//driver.quit();
		// get height and width
		System.out.println(name.getRect().getDimension().getHeight());
		
		System.out.println(name.getRect().getDimension().getWidth());
		
		
	}

}
