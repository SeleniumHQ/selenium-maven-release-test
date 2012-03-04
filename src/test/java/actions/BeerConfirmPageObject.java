package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Kristian Rosenvold
 */
public class BeerConfirmPageObject extends PageObject
{

    WebElement kvittering;

    WebElement name;
    WebElement email;

    WebElement yes;

    WebElement fud;

    WebElement no;

    public BeerConfirmPageObject(PageObjectContext pageObjectContext) {
        super(pageObjectContext);
        this.kvittering = findElement(By.id("kvittering"));
        this.email = findElement(By.id("email"));
        this.name = findElement(By.id("name"));
        this.yes = findElement(By.id("yes"));
        this.no = findElement(By.id("no"));
    }


    public BeerConfirmPageObject enterName(String name){
        this.name.sendKeys( name );
        return this;
    }


    public BeerConfirmPageObject enterEmail(String email){
        this.email.sendKeys( email );
        return this;
    }


    public BeerConfirmPageObject velgYes(){
        yes.click();
        return this;
    }

    public BeerConfirmPageObject velgNo(){
        no.click();
        return this;
    }

    public BeerConfirmPageObject selectBeer()
    {
        velgYes();
        return this;
    }

    public void submit(){
        fud.submit();
    }
}
