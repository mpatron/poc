package org.jobjects.ihm.tag;

import java.io.IOException;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

public class TotoComposantType extends UIComponentBase {
  @Override
  public String getFamily() {
    return "org.jobjects.ihm.tag";
  }

  @Override
  public void encodeBegin(FacesContext context) throws IOException {
    if (context == null) {
      throw new NullPointerException();
    }
    String strMsg = (String) getAttributes().get("msg");
    ResponseWriter writer = context.getResponseWriter();
    writer.startElement("p", this);
    writer.writeText("This is a test: " + strMsg, null);
  }

  @Override
  public void encodeEnd(FacesContext context) throws IOException {
    if (context == null) {
      throw new NullPointerException();
    }
    ResponseWriter writer = context.getResponseWriter();
    writer.endElement("p");
  }
}