package page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {
    public static final By FIND_CONTEXT_MENU = By.xpath("//div[@class='example']/h3");



    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(URL + "context_menu");
    }

    public String contextMenu(){
        return driver.findElement(FIND_CONTEXT_MENU).getText();
    }



}
