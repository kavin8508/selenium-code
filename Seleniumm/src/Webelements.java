import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kchandran25\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();//selenium
	    dr.get("https://www.facebook.com/");
	    boolean a = dr.findElement(By.id("email")).isDisplayed();
	    System.out.println(a);
//	    dr.findElement(By.id("email")).isEnabled();
//	    dr.findElement(By.id("email")).clear();
//	    dr.findElement(By.id("email")).sendKeys("Kavin");
//	    Thread.sleep(3000);
//	    dr.findElement(By.name("pass")).sendKeys("1233sds");
//	    dr.findElement(By.name("login")).click();
//	    Thread.sleep(3000);
//	    dr.quit();
	    dr.findElement(By.linkText("Help")).click();
	    
	}
	

}
