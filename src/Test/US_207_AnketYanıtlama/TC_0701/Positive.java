package Test.US_207_AnketYanıtlama.TC_0701;

import Utlity.BaseDriver;
import Utlity.BaseDriverLogin;
import org.junit.Test;
import org.openqa.selenium.By;

public class Positive extends BaseDriverLogin {

    @Test
    public void Survey_response_scenario() {

        driver.findElement(By.id("pollanswers-1")).click();
        driver.findElement(By.id("vote-poll-1")).click();

        BekleKapat();
    }
}
