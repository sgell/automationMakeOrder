import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.awt.*;



public class Order {
    @Test
    public static void makeOrder() throws AWTException, InterruptedException {
        String expectedTitle = "Home Page";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        String actualTitle = driver.getTitle();

        
        Assert.assertEquals(actualTitle,expectedTitle);
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

        // click to logo

        WebElement logo = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/a/img"));
        logo.click();

        // men products
        WebElement men = driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"));
        men.click();


       // jackets
        WebElement jackets = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div" +
                "[4]/div[2]/div[2]/div/ul[1]/li[2]/a"));
        jackets.click();

        // chosing jacket
        WebElement article = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div" +
                "[3]/div[1]/div[4]/ol/li[9]/div/div/strong/a"));
        article.click();
        Thread.sleep(5000);

        //size
        WebElement size = driver.findElement(By.cssSelector("#option-label-size-143-item-167"));
        size.click();

        // color
        WebElement color = driver.findElement(By.xpath("//div[@id='option-label-color-93-item-50']"));
        color.click();

         Actions act = new Actions(driver);
         act.scrollByAmount(0,500).perform();

        // add to cart button

        WebElement addToCartButton = driver.findElement(By.id("product-addtocart-button"));
        addToCartButton.click();
        Thread.sleep(5000);

        // cart
        WebElement cart = driver.findElement(By.xpath("//header/div[2]/div[1]/a[1]"));
        cart.click();
        // checkout button
        WebElement checkoutButton = driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']"));
        checkoutButton.click();
        Thread.sleep(10000);

        // radio shipping
        WebElement radioShippng = driver.findElement(By.xpath("//tbody/tr[1]/td[1]"));
        radioShippng.click();

        act.scrollByAmount(0,500).perform();

        // next button
        WebElement nextbutton = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        nextbutton.isDisplayed();
        nextbutton.isEnabled();
        nextbutton.isSelected();
        nextbutton.click();

        Thread.sleep(5000);


       // place order button
        WebElement placeOrderButton = driver.findElement(By.xpath("//button[@class='action primary checkout']"));
        placeOrderButton.isDisplayed();
        placeOrderButton.isEnabled();
        placeOrderButton.isSelected();
        placeOrderButton.click();

        driver.close();














    }
}
