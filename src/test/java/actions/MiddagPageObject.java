package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.PageFactory;

/**
 * @author Kristian Rosenvold
 */
public class MiddagPageObject extends PageObject {

    WebElement ja;
    WebElement navn;
    WebElement epost;
    WebElement form;


    public MiddagPageObject(PageObjectContext pageObjectContext) {
        super(pageObjectContext);
        this.ja = findElement(By.id("ja"));
        this.navn = findElement(By.id("navn"));
        this.epost = findElement(By.id("epost"));
        this.form = findElement(By.tagName("form"));
    }


    public MiddagPageObject velgJa(){
      ja.click( );
      return this;
  }


  public MiddagPageObject skrivNavn(String navn){
      this.navn.sendKeys( navn);
      return this;
  }

  public MiddagPageObject skrivEpost(String epost){
      this.epost.sendKeys( epost);
      return this;
  }

  public KvitteringPageObject sendInn() {
    form.submit();
      return new KvitteringPageObject(getPageObjectContext());

  }
}
