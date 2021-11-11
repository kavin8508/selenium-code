import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kchandran25\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		WebElement scroll = driver.findElement(By.linkText("Buy"));
		// WebElement iframe = driver.findElement(By.xpath("//iframe[@id='content']"));
		// driver.switchTo().frame(iframe);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoview", scroll);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement iframe = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/iframe"));
		driver.switchTo().frame(iframe);
		WebElement ifm2 = driver.findElement(By.xpath("//*[@id=\"content\"]"));
		driver.switchTo().frame(ifm2);
		WebElement src = driver.findElement(By.xpath("//*[@id=\"treeSource\"]/ul/li[1]/ul/li[1]/ul/li[5]/div/span"));
		WebElement dest = driver.findElement(By.xpath("//*[@id=\"treeTarget\"]/ul/li[2]"));
		act.clickAndHold(src).moveToElement(dest).release().build().perform();

	}

}
