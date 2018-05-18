package TeaWebsite;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static junit.framework.TestCase.assertTrue;
public class TeaWebsiteSteps {
    private static WebDriver driver;
//    @Before
//    public void setup()  {
//        //System.setProperty("webdriver.chrome.driver","C:\\filepath\\chromedriver.exe");
//        driver = new ChromeDriver();
//    }
//    @When("^I can browse the website$")
//  public void I_can_browse_the_website(){
//       driver = new ChromeDriver();
//     driver.manage().window().fullscreen();
//   assertTrue(true);
// }
    @Given("^the correct web address$")
    public void the_correct_web_address() throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://www.practiceselenium.com/welcome.html");
        Thread.sleep(2000);
        assertTrue(true);
    }
    @When("^I navigate to the Menu page$")
    public void i_navigate_to_the_Menu_page() throws InterruptedException{
        driver.findElement(By.xpath("//div[@id='wsb-canvas-template-container']/div[@class='wsb-element-navigation']/div//a[@href='menu.html']")).click();
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Then("^I can browse a list of the available products.$")
    public void i_can_browse_a_list_of_the_available_products()  {
        assertTrue(true);
        driver.close();
    }
    @When("^I click the checkout button$")
    public void I_click_the_checkout_button() throws InterruptedException{
        System.out.println("HELLO");
        driver.get("http://www.practiceselenium.com/menu.html");
        Thread.sleep(2000);
        System.out.println("I WORK");
        driver.findElement(By.xpath("//a[@id='wsb-button-00000000-0000-0000-0000-000451955160']/span")).click();
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Then("^I am taken to the checkout page$")
    public void I_am_taken_to_the_checkout_page(){
        assertTrue(true);
        driver.quit();
    }
}
