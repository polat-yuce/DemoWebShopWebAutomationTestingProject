package Test.US_205_Login_Negative.TC_0501;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Negative extends BaseDriver {

    @Test
    public void Logging_attempt_to_log_in_using_non_defined_data_invalid_to_the_system_1() {

        // A) Empty email, empty password.
        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        driver.findElement(By.id("Email")).sendKeys("");
        driver.findElement(By.id("Password")).sendKeys("");
        driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();

        WebElement text = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        Assert.assertTrue("Hatalı işlem", text.getText().toLowerCase().contains("unsuccessful"));

        BekleKapat();
    }

    @Test
    public void Logging_attempt_to_log_in_using_non_defined_data_invalid_to_the_system_2(){

        // B) Current email, empty password
        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        driver.findElement(By.id("Email")).sendKeys("maurogs4@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("");


        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[class='button-1 login-button']")))).click();

        WebElement text = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        Assert.assertTrue("Hatalı işlem", text.getText().toLowerCase().contains("unsuccessful"));

        BekleKapat();
    }

    @Test
    public void Logging_attempt_to_log_in_using_non_defined_data_invalid_to_the_system_3(){
        // C) Empty email, valid password
        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        driver.findElement(By.id("Email")).sendKeys("");
        driver.findElement(By.id("Password")).sendKeys("beşiktaş1903");


        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[class='button-1 login-button']")))).click();

        WebElement text = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        Assert.assertTrue("Hatalı işlem", text.getText().toLowerCase().contains("unsuccessful"));

        BekleKapat();
    }

    @Test
    public void Logging_attempt_to_log_in_using_non_defined_data_invalid_to_the_system_4(){

        // D) invalid email, invalid password-
        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        driver.findElement(By.id("Email")).sendKeys("maurogss4@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("beşikdtaş1903");
        driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();

        WebElement text = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        Assert.assertTrue("Hatalı işlem", text.getText().toLowerCase().contains("unsuccessful"));

        BekleKapat();
    }
}
