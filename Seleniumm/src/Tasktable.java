import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasktable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kchandran25\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		//*[@class='tsc_table_s13']/tbody/tr[1]/th
		//*[@class='tsc_table_s13']/tbody/tr[2]/th
		//*[@class='tsc_table_s13']/tbody/tr[3]/th
		//*[@class='tsc_table_s13']/tbody/tr[4]/th
		List<WebElement> l= driver.findElements(By.xpath("//*[@class='tsc_table_s13']/tbody/tr/th"));
		int row_size=l.size();
		System.out.println(row_size);
		String beforepath="//*[@class='tsc_table_s13']/tbody/tr[";
		String afterpath = "]/th";
		for(int i=1;i<=row_size;i++) {
			String path =beforepath+i+afterpath;
			WebElement w=driver.findElement(By.xpath(path));
			System.out.println(w.getText());	
		}
		
		
		//*[@class='tsc_table_s13']/tbody/tr[1]/td
		//*[@class='tsc_table_s13']/tbody/tr[2]/td
//		List<WebElement> l4= driver.findElements(By.xpath("//*[@class='tsc_table_s13']/tbody/tr/td"));
//		int row_size3=l4.size();
//		System.out.println(row_size3);
//		String beforepath3="//*[@class='tsc_table_s13']/tbody/tr[";
//		String afterpath3= "]/td";
//		for(int i=1;i<=row_size3;i++) {
//			String path4 =beforepath3+i+afterpath3;
//			WebElement w4=driver.findElement(By.xpath(path4));
//			System.out.println(w4.getText());	
//		}
		
		
		
		//*[@class='tsc_table_s13']/tbody/tr[1]/td[1]
		//*[@class='tsc_table_s13']/tbody/tr[1]/td[2]
		
		List<WebElement> l1= driver.findElements(By.xpath("//*[@class='tsc_table_s13']/tbody/tr[1]/td"));
		int row_size1=l1.size();
		System.out.println(row_size1);
		String beforepath1="//*[@class='tsc_table_s13']/tbody/tr[1]/td[";
		String afterpath1 = "]";
		for(int i=1;i<=row_size1;i++) {
			String path1 =beforepath1+i+afterpath1;
			WebElement w1=driver.findElement(By.xpath(path1));
			System.out.println(w1.getText());
			
		}
		
		
		
		//column name
		//*[@class='tsc_table_s13']/thead/tr[1]/th[1]
		//*[@class='tsc_table_s13']/thead/tr[1]/th[2]........
		//*[@class='tsc_table_s13']/thead/tr[1]/th[6]
		List<WebElement> l2= driver.findElements(By.xpath("//*[@class='tsc_table_s13']/thead/tr[1]/th"));
		int col_size=l2.size();
		System.out.println(col_size);
		String beforepath2="//*[@class='tsc_table_s13']/thead/tr[1]/th[";
		String afterpath2 = "]";
		for(int i=1;i<=col_size;i++) {
			String path2 =beforepath2+i+afterpath2;
			WebElement w2=driver.findElement(By.xpath(path2));
			System.out.println(w2.getText());
			
		}

	}

}
