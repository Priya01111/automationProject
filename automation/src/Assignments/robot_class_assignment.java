package Assignments;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robot_class_assignment {
public static void main(String[] args) throws AWTException
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://paytm.com/");
	
	Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_I);
	
	
	
	
}
}
