package Test.US_203_Logout.TC_0301;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Positive extends BaseDriver {

    @Test
    public void Successful_exit_scenario_from_the_session(){

        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        driver.findElement(By.id("Email")).sendKeys("maurogs4@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("beşiktaş1903");
        driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();

        WebElement text=driver.findElement(By.xpath("//a[text()='maurogs4@gmail.com']"));
        Assert.assertTrue("Hatalı islem.",text.getText().toLowerCase().contains("maurogs4"));

        driver.findElement(By.xpath("//a[text()='Log out']")).click();

        WebElement login=driver.findElement(By.xpath("//a[text()='Log in']"));
        Assert.assertTrue("Hatalı islem",login.getText().toLowerCase().contains("log in"));

        BekleKapat();

    }
}
