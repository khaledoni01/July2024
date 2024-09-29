package tests;

import org.testng.annotations.Test;
import pages.FirstPage;

public class FirstPageTest extends TestBase{

    @Test
    public void monthDropDownSelection() {
        FirstPage fp = new FirstPage();
        fp.selectDropDown("Mar");

    }
}
