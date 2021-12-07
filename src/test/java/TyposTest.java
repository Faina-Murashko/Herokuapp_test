import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TyposTest extends BaseTest{
    @Test
    public void spellChecking(){
        driver.get("http://the-internet.herokuapp.com/typos");
        WebElement spellChecking = driver.findElement(By.cssSelector("div[class='example']"));
        assertEquals("Sometimes you'll see a typo, other times you won't.", spellChecking.getText(),"This text has an error");
    }
}
