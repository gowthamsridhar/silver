import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Juneyao {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-11\\Desktop\\gow\\AirLineDomain\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://global.juneyaoair.com");
		driver.findElement(By.xpath("(//span[@class='el-radio__inner'])[2]")).click();
		WebElement from = driver.findElement(By.xpath("(//input[@placeholder='From'])[1]"));
		from.sendKeys("Changchun(CGQ) , China(CN)");
		WebElement to = driver.findElement(By.xpath("(//input[@placeholder='To'])[1]"));
		to.sendKeys("Bangkok(BKK) , Thailand(TH)");
		WebElement date = driver.findElement(By.xpath("(//input[@placeholder='Departure'])[1]"));
		date.sendKeys("2019-11-25");
		WebElement e1 = driver.findElement(By.xpath("//input[@class='form-button button']"));
		e1.click();
		
		
		
	}

}
