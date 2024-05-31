package WorkingWithLaunchBroswer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Empty_browser {
	public static void main(String[] args) {
	
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String need=driver.getCurrentUrl();
		System.out.println(need);
	}

}
