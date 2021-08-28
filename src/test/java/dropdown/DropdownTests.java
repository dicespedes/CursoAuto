package dropdown;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void TestSelectOption(){
        var dropDowbPage =homePage.clickDropdown();
        String option = "Option 1";
        dropDowbPage.selectFromDropdown(option);
        var selectedOptions = dropDowbPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"Option not selected");

    }
}
