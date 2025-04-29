package Test.US_208_CouponGiftCardNEGATIVE.TC_0801;

import Utlity.BaseDriverLogin;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Negative extends BaseDriverLogin {

    @Test
    public void Ifyouwanttobeusedeventhoughthereisnocouponandgiftcardthescenarioofwhatkindoferrormessageappears() {
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

        driver.findElement(By.xpath("(//div[@class='coupon-code']/input)[2]")).click();
        WebElement text=driver.findElement(By.xpath("//div[@class='message']"));
        Assert.assertTrue("Hatalı islem",text.getText().contains("entered couldn't be"));


        WebElement addGirftCard=driver.findElement(By.xpath("(//div[@class='coupon-code']/input)[4]"));
        wait.until(ExpectedConditions.elementToBeClickable(addGirftCard)).click();
        WebElement text2=driver.findElement(By.xpath("//div[@class='message']"));
        Assert.assertTrue("Hatalı islem",text2.getText().contains("entered couldn't be"));

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("termsofservice")))).click();
        driver.findElement(By.id("checkout")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='buttons']/input)[2]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='buttons']/input)[3]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='buttons']/input)[4]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='buttons']/input)[5]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='buttons']/input)[6]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='buttons']/input)[7]")))).click();

        WebElement text3=driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));
        Assert.assertTrue("Hatalı işlem",text3.getText().contains("successfully"));
        BekleKapat();
    }
}
