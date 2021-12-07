package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage{

    public static final By CLICK_BUTTON_CHOICE = By.id("file-upload");
    public static final By CLICK_BUTTON_UPLOAD = By.id("file-submit");
    public static final By TEXT_FILE = By.xpath("//[@id='uploaded-files']");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }
    public void open(){
        driver.get(URL + "upload");
    }
    public void buttonChoice(){
        driver.findElement(CLICK_BUTTON_CHOICE);
    }
    public void buttonUpload(){
        driver.findElement(CLICK_BUTTON_UPLOAD).click();
    }
    public void textFile(){
        driver.findElement(TEXT_FILE).getText();
    }
}
