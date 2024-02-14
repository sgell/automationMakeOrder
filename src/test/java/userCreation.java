import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class userCreation {
   @Test
    public static void form(){
        WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");

            // createAccout button
       WebElement createAccountButton = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
      createAccountButton.click();

            // first name
       WebElement firstName = driver.findElement(By.name("firstname"));
       firstName.sendKeys("go60");

            // last name
       WebElement lastName = driver.findElement(By.id("lastname"));
       lastName.sendKeys("gruev");

            // email
       WebElement email = driver.findElement(By.name("email"));
       email.sendKeys("gr@gfhn.com");

            // password
       WebElement pass = driver.findElement(By.name("password"));
       pass.sendKeys("Aa_12345678");

            // password confirm
       WebElement passConfirm = driver.findElement(By.id("password-confirmation"));
       passConfirm.sendKeys("Aa_12345678");

       // registerButton
       WebElement register = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span"));
       register.click();







    }
}
