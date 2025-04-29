package Test.US_202_RegisterNegative.TC_0201;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Negative extends BaseDriver {

    @Test
    public void FAILED_ACCOUNT_CREATING_Scenario(){

        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[text()='Register']")).click();

        driver.findElement(By.cssSelector("[id='gender-male']")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Mauro");
        driver.findElement(By.id("LastName")).sendKeys("Icardi");
        driver.findElement(By.id("Email")).sendKeys("maurogs4@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("beşiktaş1903");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("beşiktaş1903");
        driver.findElement(By.id("register-button")).click();

        WebElement text=driver.findElement(By.xpath("//*[text()='The specified email already exists']"));

        Assert.assertTrue("Hatalı işlem.",text.getText().toLowerCase().contains("already"));

        BekleKapat();
    }
}
