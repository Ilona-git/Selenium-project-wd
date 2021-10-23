package popup;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests{

    @Test
    public void testPopup(){
        var ContextPage = homePage.clickContextMenu();
        ContextPage.rightClickOnBox();
        String text = ContextPage.popup_getText();
        ContextPage.acceptAlertPopup();
        assertEquals(text, "You selected a context menu", "text incorrect");



    }
}
