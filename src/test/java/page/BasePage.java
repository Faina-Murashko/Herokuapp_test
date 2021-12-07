package page;

import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;

    String URL = "http://the-internet.herokuapp.com/";

    public BasePage (WebDriver driver){
        this.driver = driver;
    }




}
