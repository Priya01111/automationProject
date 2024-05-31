package JS_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithHiddenElement {
	public static void main(String[] args)
	{
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.facebook.com/r.php");
  WebElement hiddenWebelement=driver.findElement(By.xpath("//input[@name='custom_gender']"));
  JavascriptExecutor js=(JavascriptExecutor )driver;
  js.executeScript("arguments[0].value='Transgender'", hiddenWebelement);

}
}

