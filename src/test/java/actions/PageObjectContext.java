package actions;

import org.openqa.selenium.WebDriver;

public class PageObjectContext {
    private final WebDriver webDriver;

    public PageObjectContext(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
