package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class SliderTests extends BaseTests {
    @Test
    public void testSliderRange() {
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value);
    }
}
