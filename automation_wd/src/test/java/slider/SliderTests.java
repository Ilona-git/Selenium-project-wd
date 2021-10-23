package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;
import static org.testng.Assert.*;

public class SliderTests extends BaseTests {
@Test
    public void testSlider(){
        String value = "4";
        HorizontalSliderPage horizontalSliderPage = homePage.clickSlider();
        horizontalSliderPage.setSliderValue(value);
        assertEquals(horizontalSliderPage.getSliderValue(), value, "Slider value is incorrect");
    }
}