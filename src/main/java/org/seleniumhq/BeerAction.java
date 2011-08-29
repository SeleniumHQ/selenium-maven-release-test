package org.seleniumhq;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Kristian Rosenvold
 */
public class BeerAction
    extends ActionSupport
{

    Boolean beer;
    String name;
    String email;

    public Boolean getBeer()
    {
        return beer;
    }

    public void setBeer( Boolean beer )
    {
        this.beer = beer;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    @Override
    public String execute()
    {
        return name == null ? "beer" : "confirm";
    }

}
