package actions;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import util.*;

import java.util.HashMap;

import static junit.framework.Assert.*;

/**
 * @author Kristian Rosenvold
 */
public class BeerTest
{
    WebDriver webDriver = new FirefoxDriver(new DesiredCapabilities(new HashMap<String, Object>(){{
        this.put("browserName", "firefox");
        this.put("marionette", false);
    }}));

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
