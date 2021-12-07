package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramePage extends BasePage{

    public static final By CLICK_BUTTON_IFRAME = By.xpath("//a[@href='/iframe']a");

    public FramePage(WebDriver driver){
        super(driver);
    }
    public void open(){
        driver.get(URL + "iframe");
    }
    public WebElement clickFrame(){
        return driver.findElement(CLICK_BUTTON_IFRAME);
    }
}
