package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kristian
 * Date: 3/4/12
 * Time: 8:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class PageObject {
    private final PageObjectContext pageObjectContext;

    public PageObject(PageObjectContext pageObjectContext) {
        this.pageObjectContext = pageObjectContext;
    }

    protected PageObjectContext getPageObjectContext() {
        return pageObjectContext;
    }

    protected WebElement findElement(By by){
        return pageObjectContext.getWebDriver().findElement(by);
    }

    protected WebElement waitForElement(By by){
        List<WebElement> elements = pageObjectContext.getWebDriver().findElements(by);
        int i = 0;
        while ( i < 10 && elements.size() == 0){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            elements = pageObjectContext.getWebDriver().findElements(by);
            i++;

        }
        if (i == 10) throw new RuntimeException("Timed out waiting for element");
        return elements.get(0);
    }

}
