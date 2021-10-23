package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStartButton();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

    @Test
    public void testWaitUntilDisappeared(){
        var  loadingExample2Page = homePage.clickDynamicLoading().clickExample2();
        loadingExample2Page.clickStart();
        assertEquals(loadingExample2Page.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
