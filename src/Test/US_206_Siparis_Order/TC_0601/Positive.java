package Test.US_206_Siparis_Order.TC_0601;

import Utlity.BaseDriver;
import Utlity.BaseDriverLogin;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Positive extends BaseDriverLogin {

    @Test
    public void ORDER_TEST_Scenario() {

        driver.findElement(By.cssSelector("[href='/computers']")).click();
        driver.findElement(By.xpath("(//h2[@class='title'])[2]")).click();
        driver.findElement(By.xpath("(//div[@class='buttons'])[2]")).click();
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();

        WebElement country = driver.findElement(By.id("CountryId"));
        Select UnitedStates = new Select(country);
        UnitedStates.selectByVisibleText("United States");
        WebElement state = driver.findElement(By.id("StateProvinceId"));
        Select Alabama = new Select(state);
        Alabama.selectByVisibleText("Alabama");
        driver.findElement(By.id("ZipPostalCode")).sendKeys("142513");
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();


//        WebElement country2=driver.findElement(By.id("BillingNewAddress_CountryId"));
//        Select UnitedStates2=new Select(country2);
//        UnitedStates2.selectByVisibleText("United States");
//        WebElement state2 = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
//        Select Alabama2 = new Select(state2);
//        Alabama2.selectByVisibleText("Alabama");

//        driver.findElement(By.xpath("(//div[@class='inputs'])[7]/input")).sendKeys("city");
//        driver.findElement(By.xpath("(//div[@class='inputs'])[8]/input")).sendKeys("fsadfsadf");
//        driver.findElement(By.xpath("(//div[@class='inputs'])[9]/input")).sendKeys("dsfadsfsaf");
//        driver.findElement(By.xpath("(//div[@class='inputs'])[10]/input")).sendKeys("123");
//        driver.findElement(By.xpath("(//div[@class='inputs'])[11]/input")).sendKeys("34123412");
//        driver.findElement(By.xpath("(//div[@class='inputs'])[12]/input")).sendKeys("12341");
//        driver.findElement(By.xpath("(//div[@class='inputs'])[12]/input")).sendKeys("12341");

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='buttons']/input)[2]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='buttons']/input)[3]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='buttons']/input)[4]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='buttons']/input)[5]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='buttons']/input)[6]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='buttons']/input)[7]")))).click();

        WebElement text=driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));
        Assert.assertTrue("Hatalı işlem",text.getText().contains("successfully"));
        BekleKapat();


    }
}
