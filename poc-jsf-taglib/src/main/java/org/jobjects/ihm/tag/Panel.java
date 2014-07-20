package org.jobjects.ihm.tag;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

public class Panel extends UIComponentBase {

  @Override
  public String getFamily() {
    return "org.jobjects.ihm.tag";
  }

  @Override
  public void encodeBegin(FacesContext context) throws IOException {
    if (context == null) {
      throw new NullPointerException();
    }
    ResponseWriter localResponseWriter = context.getResponseWriter();
    Object localObject2 = getAttributes().get("look");
    Object localObject1 = getAttributes().get("title");
    localResponseWriter.startElement("div", this);
    localResponseWriter.writeAttribute("id", getClientId(context), "id");
    if (localObject2 != null) {
      localResponseWriter.writeAttribute("class", "panel panel-" + (String) localObject2, "class");
    } else {
      localResponseWriter.writeAttribute("class", "panel panel-default", "class");
    }
    if (((localObject2 = getFacet("heading")) != null) || (localObject1 != null)) {
      localResponseWriter.startElement("div", this);
      localResponseWriter.writeAttribute("class", "panel-heading", "class");
      if (localObject1 != null) {
        localResponseWriter.startElement("h4", this);
        localResponseWriter.writeText(localObject1, null);
        localResponseWriter.endElement("h4");
      } else {
        ((UIComponent) localObject2).encodeAll(context);
      }
      localResponseWriter.endElement("div");
    }
    localResponseWriter.startElement("div", this);
    localResponseWriter.writeAttribute("class", "panel-body", "class");
  }

  @Override
  public void encodeEnd(FacesContext context) throws IOException {
    if (context == null) {
      throw new NullPointerException();
    }
    ResponseWriter localResponseWriter;
    (localResponseWriter = context.getResponseWriter()).endElement("div");
    UIComponent localUIComponent;
    if ((localUIComponent = getFacet("footer")) != null) {
      localResponseWriter.startElement("div", this);
      localResponseWriter.writeAttribute("class", "panel-footer", "class");
      localUIComponent.encodeAll(context);

      localResponseWriter.endElement("div");
    }
    localResponseWriter.endElement("div");
  }

}
