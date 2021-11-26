import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;

import java.util.List;

public class DropDownTest extends BaseTest{
    @Test
    public void dropDown(){
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdown"));

        WebElement dropDownOne = driver.findElement(By.cssSelector("[value='1']"));
        dropDownOne.click();
        assertTrue(dropDownOne.isSelected());
        //assertTrue(dropDownOne.isSelected(), "");

        WebElement dropDownTwo = driver.findElement(By.cssSelector("[value = '2']"));
        dropDownTwo.click();
        assertTrue(dropDownTwo.isSelected());
    }
}
