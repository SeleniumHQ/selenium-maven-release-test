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
public class MiddagTest {
  WebDriver webDriver = new FirefoxDriver();

  @Test
  public void testMiddag() {
    MiddagPageObject start = getStartSide();
    KvitteringPageObject kvittering =
    start.skrivNavn("kristia").skrivEpost("a@b.c")
            .velgJa().sendInn();
    assertTrue( kvittering.isMiddagValgt());
  }

  private MiddagPageObject getStartSide() {
    webDriver.get("http://localhost:8080/middag");
    return PageFactory.createPageObject(webDriver, MiddagPageObject.class);
  }

  @After
  public void quit() {
    webDriver.quit();
  }

  static class JettyStart {
    public static void main(String[] args) {
      new EmbeddedJettyStarter().startJettyWithDefaultServlets("/", 8080);
    }
  }
}
