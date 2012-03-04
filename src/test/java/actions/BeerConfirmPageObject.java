package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Kristian Rosenvold
 */
public class BeerConfirmPageObject extends PageObject
{

    WebElement beer;


    public BeerConfirmPageObject(PageObjectContext pageObjectContext) {
        super(pageObjectContext);
        this.beer = waitForElement(By.id("beer"));
    }


    public BeerPageObject goBackToBeer()
    {
        beer.click();
        return new BeerPageObject(getPageObjectContext());
    }

}
