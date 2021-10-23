package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyTest extends BaseTests {

    @Test
    public void testBackSpace(){
        var keyPage = homePage.clickPressKey();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE!");
    }
    @Test
    public void testPi(){
        var keyPage = homePage.clickPressKey();
        keyPage.enterPi();
    }

}
