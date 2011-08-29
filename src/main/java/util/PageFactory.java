package util;

import org.openqa.selenium.WebDriver;

/**
 * @author Kristian Rosenvold
 */
public abstract class PageFactory
{
    private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();

    public static <T> T createPageObject(WebDriver webDriver, Class<T> clazz){
        threadLocal.set( webDriver);
        return org.openqa.selenium.support.PageFactory.initElements( webDriver, clazz );
    }
    public static <T> T createPageObject(Class<T> clazz){
        return org.openqa.selenium.support.PageFactory.initElements( threadLocal.get(), clazz );
    }


}
