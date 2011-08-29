package actions;

import org.openqa.selenium.WebElement;

/**
 * @author Kristian Rosenvold
 */
public class KvitteringPageObject {
  WebElement kvittering;

  public boolean isMiddagValgt(){
      return this.kvittering.getText().contains("Ja");
  }
}
