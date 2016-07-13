import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String appUrl = "https://accounts.google.com";
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.getTitle();
		
		String expectedTitle = "Sign in - Google Accounts";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Verification Successful - The correct title is displayed on the web page.");
		}
		else 
		{
			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
		}
	
		WebElement username = driver.findElement(By.id("Email"));
			username.clear();
			username.sendKeys("paula.chesser@gmail.com");
		
		WebElement nextButton = driver.findElement(By.id("next"));
		nextButton.click();	
		Thread.sleep(1000);
			
		WebElement password = driver.findElement(By.id("Passwd"));
		password.clear();
		password.sendKeys("#GLouise81$");
		
		WebElement SignInButton = driver.findElement(By.id("signIn"));
		SignInButton.click();
		
		driver.close();
		System.out.println("Test script executed successfully.");
		
		System.exit(0);
	}
}


