package actions;

import org.openqa.selenium.WebDriver;
import util.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: kristian
 * Date: 3/4/12
 * Time: 8:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommonTest {

    public static  BeerPageObject getStartSide(WebDriver webDriver)
    {
        webDriver.get( "http://office:8083/beer.jspx");
        return new BeerPageObject(new PageObjectContext(webDriver));
    }

    public static void runStdScript(BeerPageObject start){
            BeerPageObject beerPageObject = start.enterName("Kristian Rosenvold").enterEmail("kristian.rosenvold@gmail.com").selectBeer();
            beerPageObject.submit();
    }

}
