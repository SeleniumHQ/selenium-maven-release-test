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
public class MiddagTest {
    WebDriver webDriver = new FirefoxDriver(new DesiredCapabilities(new HashMap<String, Object>(){{
        this.put("browserName", "firefox");
        this.put("marionette", false);
    }}));

    @Test
    public void testMiddag() {
        MiddagPageObject start = getStartSide();
        KvitteringPageObject kvittering =
                start.skrivNavn("kristia").skrivEpost("a@b.c")
                        .velgJa().sendInn();
     //  assertTrue(kvittering.isMiddagValgt());
    }

    private MiddagPageObject getStartSide() {
        webDriver.get("http://localhost:8083/middag.jspx");
        return new MiddagPageObject(new PageObjectContext(webDriver));
    }

    @After
    public void quit() {
        webDriver.quit();
    }

    static class JettyStart {
        public static void main(String[] args) {
            new EmbeddedJettyStarter().startJettyWithDefaultServlets("/", 8083);
        }
    }
}
