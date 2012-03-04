package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Kristian Rosenvold
 */
public class KvitteringPageObject extends PageObject {
  WebElement kvittering;


    public KvitteringPageObject(PageObjectContext pageObjectContext) {
        super(pageObjectContext);
        this.kvittering = pageObjectContext.getWebDriver().findElement(By.id("kvittering"));
    }

    public boolean isMiddagValgt(){
      return this.kvittering.getText().contains("Ja");
  }
}
