package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Kristian Rosenvold
 */
public class BeerPageObject
{

    WebElement name;

    public BeerPageObject enterName(String name){
        this.name.sendKeys( name );
        return this;
    }


    WebElement email;

    public BeerPageObject enterEmail(String email){
        this.email.sendKeys( email );
        return this;
    }


    @FindBy(id="yes")
    WebElement yes;

    public BeerPageObject velgYes(){
        yes.click();
        return this;
    }

    @FindBy(id="no")
    WebElement no;

    public BeerPageObject velgNo(){
        no.click();
        return this;
    }

    public void selectBeer()
    {
        velgYes();
    }
}
