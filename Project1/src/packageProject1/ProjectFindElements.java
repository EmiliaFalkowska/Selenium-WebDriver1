package packageProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ProjectFindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/ajax.html");
		List<WebElement> elements = driver.findElements(By.name("name"));
		System.out.println("Number of elements:" +elements.size());
		
	
		for (int i=0; i<elements.size();i++) {
			System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
		}
	}

}
