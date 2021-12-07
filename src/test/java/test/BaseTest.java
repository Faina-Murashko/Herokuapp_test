package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import page.ContextMenuPage;
import page.DynamicControlsPage;
import page.FileUploadPage;
import page.FramePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    ContextMenuPage contextMenuPage;
    Actions actions;
    DynamicControlsPage dynamicControlsPage;
    FileUploadPage fileUploadPage;
    FramePage framePage;


    @BeforeTest
    public void herokuApp(){
        System.setProperty("webdriver.chrome.driver" , "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        contextMenuPage = new ContextMenuPage(driver);
        actions = new Actions(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        fileUploadPage = new FileUploadPage(driver);
        framePage = new FramePage(driver);

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
