package TechnicalComponents;
import TechnicalComponents.ComponentTechnical;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComponentTechnical {
    public WebDriver driver;


    @FindBy(xpath="//button[@type='submit']")
    public WebElement Enroll;

    @FindBy(xpath="//input[@id='name']")
    public WebElement Input_name;

    @FindBy(xpath="//*[@id='email']")
    public WebElement Input_email;
    public ComponentTechnical(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void Verify_Enroll_button(){
        Enroll.click();
    }
    public void Verify_pop_up(){
        Alert ac=driver.switchTo().alert();
        ac.accept();
    }
    public void Verify_Enter_Name(){
        Input_name.sendKeys("John");
    }
    public void Verify_Enter_email(){
        Input_email.sendKeys("john@gmail.com");
    }




}
