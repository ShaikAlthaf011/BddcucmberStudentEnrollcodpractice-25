package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import TechnicalComponents.ComponentTechnical;
public class LoginpageTest {
    public WebDriver driver;
    ComponentTechnical componentTechnical;
@BeforeMethod
    public void Enviornment(){
    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
}
  @Given("Navigate to Student Enroll Application")
    public void navigate_to_student_enroll_application() {
      driver=new ChromeDriver();
    driver.navigate().to("https://qastdenroll.ccbp.tech/");
    driver.manage().window().maximize();
    componentTechnical=new ComponentTechnical(driver);

    }
    @When("Verify the Enroll Button")
    public void verify_the_enroll_button() {
    componentTechnical.Verify_Enroll_button();
    }
    @Then("Verify the poop Student Enroll")
    public void verify_the_poop_student_enroll() {
    componentTechnical.Verify_pop_up();
    }
    @Then("Close the browser")
    public void close_the_browaser() {
    driver.quit();
    }
  @When("Verify the Register Name")
  public void verify_the_register_name() {
  componentTechnical.Verify_Enter_Name();
}
@Then("Verify The Register Email")
  public void verify_the_register_email() {
  componentTechnical.Verify_Enter_email();
  }
}
