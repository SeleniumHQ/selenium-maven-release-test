package actions;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.*;

import java.util.HashMap;

import static junit.framework.Assert.*;

/**
 * @author Kristian Rosenvold
 */
public class BeerTest
{
    WebDriver webDriver = new ChromeDriver();

    @Test
    public void testBeer()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver);
        start.enterName("Kristian Rosenvold").enterEmail("kristian.rosenvold@gmail.com").selectBeer();
    }

    @After
    public void quit()
    {
        webDriver.quit();
    }
}
