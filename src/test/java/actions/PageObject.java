package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
}
