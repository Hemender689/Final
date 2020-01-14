package stepDefi;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;             /* CHECKING VALIDATION FOR  MULTIPLE USERS AND VERIFY THE USER */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class UserLogin {
	static WebDriver driver;
	//HERE WE LAUNCH OUR APPLICATION
	@Given("Application launched by user")
	public void Application_launched_by_user()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_d2.03.07\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		throw new cucumber.api.PendingException();
		
	}
	@Then("Click on login link")
    public void  Click_on_login_link()
   {
		driver.findElement(By.xpath(".//a[@href='login.htm']")).click();
	//	throw new cucumber.api.PendingException();
   }
	@Then("enter username ")
	public void enter_username(String string)
	{
		
		driver.findElement(By.name("userName")).sendKeys(string);
		//throw new cucumber.api.PendingException();
	}
	@Then("enter password ")
	public void enter_password(String string)
	{
	driver.findElement(By.name("password")).sendKeys(string);	
	//throw new cucumber.api.PendingException();
	}
	@Then("click on login link")
	public void click_on_login_button()
	{
		driver.findElement(By.name("Login")).click();
		//throw new cucumber.api.PendingException();
		
	}
	@Then("Verify the user")
	public void Verify_the_user()
	{
		String  s  = driver.findElement(By.xpath(".//a[@href = 'logout.htm']")).getText();
		Assert.assertTrue(s.contains("SignOut"));
		System.out.println("Expected page open");
		//throw new cucumber.api.PendingException();
	}

	
	
	
	
	
	
	
	

}
