package steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefination {
	@Before
	public void Start() {
		System.out.println("Started Chrome");
	}
	@After
	public void tearDown() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
	@AfterStep
	public void screenshot() {
		System.out.println("Screenshot");
	}
	
	WebDriver driver;
	@Given("user Start {string} broswer")
	public void user_start_broswer(String BroswerName) {
	   if(BroswerName.equals("Chrome")) {
		   
		   driver=new ChromeDriver();
	   } else if (BroswerName.equals("firefox")){
		   driver=new FirefoxDriver();
	   }else if(BroswerName.equals("edge")){
		   driver= new EdgeDriver();
	   }
		
	}

	@Given("user launch app using Url {string}")
	public void user_launch_app_using_url(String url) {
   driver.get(url);
	}

	@When("user enters text {string} username textbox by using xpath {string}")
	public void user_enters_text_username_textbox_by_using_xpath(String Username, String xpath) {
	    driver.findElement(By.xpath(xpath)).sendKeys(Username);
	}
	@When("user enters text {string} Password textbox by using xpath {string}")
	public void user_enters_text_password_textbox_by_using_xpath(String password, String xpath) {
		 driver.findElement(By.xpath(xpath)).sendKeys(password);
	}

	@When("User clicks  button using xpath {string}")
	public void user_clicks_button_using_xpath(String xpath) {
	  driver.findElement(By.xpath(xpath)).click();
	}

	@Then("User Verifies tittle to be {string}")
	public void user_verifies_tittle_to_be(String Title) {
	    Assert.assertEquals(Title, driver.getTitle());
	 
	}
	@When("user clicks on link using xpath {string}")
	public void user_clicks_on_link_using_xpath(String xpath) {
	driver.findElement(By.xpath(xpath)).click();
	}
	@When("user enters details in Reg form")
	public void user_enters_details_in_reg_form(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> alllist= dataTable.asLists();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(alllist.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(alllist.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(alllist.get(0).get(2));
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(alllist.get(0).get(3));
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(alllist.get(0).get(4));
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(alllist.get(0).get(5));
		

	}
	@When("user enters details in Reg forms")
	public void user_enters_details_in_reg_forms(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String,String>> all=dataTable.asMaps();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(all.get(0).get("Username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(all.get(0).get("Password"));
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(all.get(0).get("ConfirMpass"));
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(all.get(0).get("fullname"));
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(all.get(0).get("gamail"));
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(all.get(0).get("Capctch"));
	}


}
