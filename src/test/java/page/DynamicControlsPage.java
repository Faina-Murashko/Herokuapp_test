package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage extends BasePage {

    public static final By REMOVE_BUTTON = By.xpath("//form[@id='checkbox-example']/button");
    public static final By FIND_TEXT = By.xpath("//p[@id='message']");
    public static final By ENABLED_BUTTON = By.xpath("//form[@id='input-example']/button");
    public static final By FIND_TEXT_ENABLED = By.xpath("//p[@id='message']");
    public static final By DISABLED_BUTTON = By.xpath("//form[@id='input-example']/button");
    public static final By FIND_TEXT_DISABLED = By.xpath("//p[@id='message']");


    public DynamicControlsPage(WebDriver driver) {
        super(driver);

    }

    public void open(){
        driver.get(URL + "dynamic_controls");
    }
    public void clickButtonRemove(){
        driver.findElement(REMOVE_BUTTON).click();
    }
    public void findTextItsGone(){
        driver.findElement(FIND_TEXT).getText();
    }
    public void clickEnabledButton(){
        driver.findElement(ENABLED_BUTTON).click();
    }
    public void findTextEnabled(){
        driver.findElement(FIND_TEXT_ENABLED).getText();
    }
    public void clickDisabledButton(){
        driver.findElement(DISABLED_BUTTON).click();
    }
    public void findTextDisabled(){
        driver.findElement(FIND_TEXT_DISABLED).getText();
    }

}
//*[@id="checkbox-example"]/button
//*[@id="checkbox"]