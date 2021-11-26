import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {
    @Test
    public void variableInputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement variableInputsNumbers = driver.findElement(By.cssSelector("input[type = 'number']"));
        variableInputsNumbers.sendKeys("20");
        driver.findElement(By.cssSelector("input[type = 'number']")).click();
        variableInputsNumbers.sendKeys(Keys.ARROW_DOWN);
        assertEquals(variableInputsNumbers.getAttribute("value"), "19", " ");
        variableInputsNumbers.clear();
        Assert.assertTrue(true,"Input validation");

       /*WebElement variableInputsLetters = driver.findElement(By.cssSelector("input[type = 'number']"));
        variableInputsLetters.sendKeys("absd");
        driver.findElement(By.cssSelector("input[type='number']")).click();
        variableInputsLetters.sendKeys(Keys.ARROW_DOWN);
        assertEquals(variableInputsLetters.getAttribute("value"), "abs", " ");
        variableInputsLetters.clear();
        Assert.assertTrue(true, "Input Error");*/


    }
}

