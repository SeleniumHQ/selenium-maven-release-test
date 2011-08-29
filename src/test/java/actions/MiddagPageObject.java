package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.PageFactory;

/**
 * @author Kristian Rosenvold
 */
public class MiddagPageObject {
  @FindBy(id="ja")
  WebElement ja;

  public MiddagPageObject velgJa(){
      ja.click( );
      return this;
  }

  WebElement navn;

  public MiddagPageObject skrivNavn(String navn){
      this.navn.sendKeys( navn);
      return this;
  }

  WebElement epost;

  public MiddagPageObject skrivEpost(String epost){
      this.epost.sendKeys( epost);
      return this;
  }

  @FindBy(tagName = "form")
  WebElement form;
  public KvitteringPageObject sendInn() {
    form.submit();
       return PageFactory.createPageObject( KvitteringPageObject.class );

  }
}
