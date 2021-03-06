import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CheckBoxesTest extends BaseTest {

    @Test
    public void checkCheckBoxes(){
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkBoxes  = driver.findElements(By.cssSelector("[type='checkbox']"));
        assertFalse(checkBoxes.get(0).isSelected(), "CheckBoxe 1 check");
        assertTrue(checkBoxes.get(1).isSelected(), "CheckBoxe 2 don't check");

        checkBoxes.get(0).click();
        assertTrue(checkBoxes.get(0).isSelected(), "CheckBoxe 1 don't check");

        checkBoxes.get(1).click();
        assertFalse(checkBoxes.get(1).isSelected(), "CheckBoxe 2 check");
    }

}
