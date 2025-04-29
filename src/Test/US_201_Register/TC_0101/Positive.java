package Test.US_201_Register.TC_0101;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;


public class Positive extends BaseDriver {

    @Test
    public void SUCCESSFUL_ACCOUNTING_Scenario(){

        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[text()='Register']")).click();

        driver.findElement(By.cssSelector("[id='gender-male']")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Mauro");
        driver.findElement(By.id("LastName")).sendKeys("Icardi");
        driver.findElement(By.id("Email")).sendKeys("maurogs4@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("beşiktaş1903");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("beşiktaş1903");
        driver.findElement(By.id("register-button")).click();

        BekleKapat();
    }
}
