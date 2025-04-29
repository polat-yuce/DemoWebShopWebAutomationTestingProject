package Utlity;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriverLogin {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static JavascriptExecutor js;

    static {

        driver = new ChromeDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        js=(JavascriptExecutor)driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Login();
    }

    public static void BekleKapat() {  // tearDown
        MyFunc.Bekle(3);
        driver.quit();
    }

    public static void Login(){
        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        driver.findElement(By.id("Email")).sendKeys("maurogs4@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("beşiktaş1903");
        driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();

        WebElement text=driver.findElement(By.xpath("//a[text()='maurogs4@gmail.com']"));
        Assert.assertTrue("Hatalı islem.",text.getText().toLowerCase().contains("maurogs4"));
    }


}


