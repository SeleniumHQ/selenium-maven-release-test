package org.seleniumhq;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.config.Namespace;
import org.apache.struts2.config.Result;

/**
 * @author Kristian Rosenvold
 */

public class MiddagAction extends ActionSupport {

  String navn;
  String epost;
  Boolean middag;

  public String getNavn() {
    return navn;
  }

  public void setNavn(String navn) {
    this.navn = navn;
  }

  public String getEpost() {
    return epost;
  }

  public void setEpost(String epost) {
    this.epost = epost;
  }

  public Boolean getMiddag() {
    return middag;
  }

  public void setMiddag(Boolean middag) {
    this.middag = middag;
  }

  @Override
  public String execute() {

    return navn != null ? "kvittering" : "middag";
  }

}
