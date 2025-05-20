// Q. Write a Program to the facebook handle that Day, Month, year drop by using select class method.

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookSelectClassMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
	    WebElement element = driver.findElement(By.id("day"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("5");
		Thread.sleep(4000);
		dropdown.selectByValue("3");
		Thread.sleep(4000);
		dropdown.selectByIndex(22);
		Thread.sleep(4000);
		if(dropdown.isMultiple()==true) {
			System.out.println("Dropdown is Multiple");
		}
		else {
			System.out.println("Dropdown is Not Multiple");
		}
		List<WebElement> alldropdownOptions = dropdown.getOptions();
		for(WebElement ele : alldropdownOptions) {
			System.out.println(ele.getText());
		}
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	
	}

}
