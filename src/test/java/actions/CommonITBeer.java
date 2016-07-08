package actions;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CommonITBeer {
    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>(){
        @Override
        protected WebDriver initialValue() {
            Capabilities capabilitiesd = DesiredCapabilities.firefox();

            return new RemoteWebDriver(getHostUrl(), capabilitiesd);
        }
    };

    private static URL getHostUrl(){

        try {
            return new URL("http://office:8090/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testBeer()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver.get());
        CommonTest.runStdScript(start);
    }
    @Test
    public void testBeer1()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver.get());
        CommonTest.runStdScript(start);
    }
    @Test
    public void testBeer2()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver.get());
        CommonTest.runStdScript(start);
    }
    @Test
    public void testBeer3()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver.get());
        CommonTest.runStdScript(start);
    }
    @Test
    public void testBeer4()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver.get());
        CommonTest.runStdScript(start);
    }
    @Test
    public void testBeer5()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver.get());
        CommonTest.runStdScript(start);
    }
    @Test
    public void testBeer6()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver.get());
        CommonTest.runStdScript(start);
    }
    @Test
    public void testBeer7()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver.get());
        CommonTest.runStdScript(start);
    }

    @Test
    public void testBeer8()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver.get());
        CommonTest.runStdScript(start);
    }
    @Test
    public void testBeer9()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver.get());
        CommonTest.runStdScript(start);
    }
    @Test
    public void testBeer10()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver.get());
        CommonTest.runStdScript(start);
    }
    @Test
    public void testBeer11()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver.get());
        CommonTest.runStdScript(start);
    }
    @Test
    public void testBeer12()
    {
        BeerPageObject start = CommonTest.getStartSide(webDriver.get());
        CommonTest.runStdScript(start);
    }

    @AfterClass
    public static void closeDriver(){
        webDriver.get().quit();
        webDriver.remove();
    }
}
