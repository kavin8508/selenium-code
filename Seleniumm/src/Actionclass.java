import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kchandran25\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();//selenium
		dr.get("https://jqueryui.com/droppable/");
		dr.manage().window().maximize();
		dr.switchTo().frame(0);
		WebElement w= dr.findElement(By.id("draggable"));//source
		WebElement w1 = dr.findElement(By.id("droppable"));//target
		Actions a = new Actions(dr);
		//a.dragAndDrop(w, w1).build().perform();
		a.clickAndHold(w).moveToElement(w1).release().build().perform();
		

	}

}
