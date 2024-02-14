    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.Test;

    public class Login {
    @Test

    public static void log() {
        WebDriver driver = new ChromeDriver();
        //  driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");

        // sing in
        WebElement sign = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
        sign.click();

        // email
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("gr@gfhn.com");

        // password
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("Aa_12345678");

        // sign up button

        WebElement signUp = driver.findElement(By.name("send"));
        signUp.click();









    }
}