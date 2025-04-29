package Test.US_209_FaturaGoruntuleme.TC_0901;

import Utlity.BaseDriverLogin;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Positive extends BaseDriverLogin {

    @Test
    public void test() {
        driver.findElement(By.xpath("//a[text()='maurogs4@gmail.com']")).click();
        driver.findElement(By.xpath("//a[text()='Orders']")).click();
        driver.findElement(By.xpath("(//div[@class='buttons']/input)[2]")).click();
        driver.findElement(By.xpath("//a[text()='PDF Invoice']")).click();

        BekleKapat();
    }

}
