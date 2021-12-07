package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DynamicControlsTest extends BaseTest{
    @Test
    public void clickButtonRemove(){
        dynamicControlsPage.open();
        dynamicControlsPage.clickButtonRemove();
        dynamicControlsPage.findTextItsGone();
        dynamicControlsPage.clickEnabledButton();
        dynamicControlsPage.findTextEnabled();
        dynamicControlsPage.clickDisabledButton();
        dynamicControlsPage.findTextDisabled();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



}
