package Test.US_204_Login.TC_0401;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Positive extends BaseDriver {

    @Test
    public void SuccessfulLoginScenario(){

        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        driver.findElement(By.id("Email")).sendKeys("maurogs4@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("beşiktaş1903");
        driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();

        WebElement text=driver.findElement(By.xpath("//a[text()='maurogs4@gmail.com']"));
        Assert.assertTrue("Hatalı islem.",text.getText().toLowerCase().contains("maurogs4"));

        BekleKapat();

    }
}
