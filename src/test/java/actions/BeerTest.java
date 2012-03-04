package actions;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.*;

import static junit.framework.Assert.*;

/**
 * @author Kristian Rosenvold
 */
public class BeerTest
{
    WebDriver webDriver = new FirefoxDriver();

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

    static class JettyStart
    {
        public static void main( String[] args )
        {
            new EmbeddedJettyStarter().startJettyWithDefaultServlets( "/", 8083 );
        }
    }
}
