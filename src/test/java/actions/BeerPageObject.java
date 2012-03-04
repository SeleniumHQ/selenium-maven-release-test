package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Kristian Rosenvold
 */
public class BeerPageObject extends PageObject
{

    WebElement name;

    WebElement yes;

    WebElement fud;

    WebElement no;

    WebElement email;


    public BeerPageObject(PageObjectContext pageObjectContext) {
        super(pageObjectContext);
        this.name = waitForElement(By.id("name"));
        this.yes = findElement(By.id("yes"));
        this.no = findElement(By.id("no"));
        this.fud = findElement(By.id("fud"));
        this.email = findElement(By.id("email"));
    }


    public BeerPageObject enterName(String name){
        this.name.sendKeys( name );
        return this;
    }


    public BeerPageObject enterEmail(String email){
        this.email.sendKeys( email );
        return this;
    }

    public BeerPageObject velgYes(){
        yes.click();
        return this;
    }


    public BeerPageObject velgNo(){
        no.click();
        return this;
    }

    public BeerPageObject selectBeer()
    {
        velgYes();
        return this;
    }

    public BeerConfirmPageObject submit(){
        fud.submit();
        return new BeerConfirmPageObject(getPageObjectContext());

    }
}
