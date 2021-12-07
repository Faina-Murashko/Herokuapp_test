package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest{

    String textParagraf = "//*[@id='tinymce']/p";

    @Test
    public void textFrame(){

        framePage.open();
 //       framePage.clickFrame().click();
        WebDriver iFrame = driver.switchTo().frame(framePage.clickFrame());
        Assert.assertEquals(iFrame.findElement(By.xpath(textParagraf)).getText(),
                "Your content goes here.", "Error, test doesn't match.");
    }
}
