package actions;

import com.thoughtworks.selenium.DefaultSelenium;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Kristian Rosenvold
 */
public class Se1Se2ServerTest {

  @Test
  @Ignore
  public void testSomething() {
    DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.google.com");
    selenium.start();
    selenium.open("/");
    selenium.type("q", "selenium rc");
    selenium.click("btnG");
    selenium.close();
    selenium.stop();
  }

  @Test
  @Ignore
  public void testWebDriverSomething() throws MalformedURLException {
    WebDriver webDriver = new RemoteWebDriver(new URL("http://localhost:4444//wd/hub"), DesiredCapabilities.firefox());
      webDriver.get("http://www.google.com");
    webDriver.findElement(By.name("q")).sendKeys("webdriver");
    webDriver.close();
    webDriver.quit();
  }
}
