package org.jobjects.ihm.resource;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.application.Resource;
import javax.faces.application.ResourceWrapper;
import javax.faces.context.FacesContext;

public class WebAppResource extends ResourceWrapper {

  private Logger log = Logger.getLogger(getClass().getName());

  private Resource wrapped;
  private String path;

  public WebAppResource(String path, Resource wrapped) {
    this.wrapped = wrapped;
    this.path = path;
    //log.log(Level.INFO, "WebAppResource created.");
  }

  @Override
  public String getRequestPath() {
    String returnValue=null;
    FacesContext context = FacesContext.getCurrentInstance();
    returnValue=context.getApplication().getViewHandler().getResourceURL(context, path);
    //log.log(Level.INFO, "WebAppResource#getRequestPath : "+ returnValue);
    return returnValue;
  }

  @Override
  public Resource getWrapped() {
    return wrapped;
  }
}
