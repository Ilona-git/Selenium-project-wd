package frame;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NestedFramesPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {
    @Test
    public void testWysing(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.cleanEditArea();

        String text1 = "hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text from editor is incorrect");
    }

        @Test
        public void testFrameText() {
            var nestedFramesPage = homePage.clickFrame().clickNestedFrames();
            assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
            assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");
        }
}
