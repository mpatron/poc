package org.jobjects.ihm.resource;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.application.Resource;
import javax.faces.application.ResourceHandler;
import javax.faces.application.ResourceHandlerWrapper;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.apache.commons.lang3.builder.ToStringBuilder;
/*
 * http://roguexz.blogspot.fr/2013/10/jsf-2-returning-resource-url-that-is.html
 */
public class AppResourceHandler extends ResourceHandlerWrapper {
  public static final String  WEBAPP_RESOURCES_DIRECTORY_PARAM_NAME= "javax.faces.WEBAPP_RESOURCES_DIRECTORY";
  private Logger log = Logger.getLogger(getClass().getName());
  
  private ResourceHandler wrapped;
  
  public AppResourceHandler(ResourceHandler wrapped) {
      //log.log(Level.INFO, "AppResourceHandler created.");
      this.wrapped = wrapped;      
  }
  
  @Override
  public ResourceHandler getWrapped() {
    return wrapped;
  }
  
  @Override
  public Resource createResource(String resourceName, String libraryName) {
	  log.log(Level.INFO, "AppResourceHandler#createResourc("+resourceName+","+libraryName+")"  );
      Resource resource = super.createResource(resourceName, libraryName);
      return getWrappedResource(resource);
  }
  
  /**
   * If the given resource object can be rendered locally, then do so by
   * returning a wrapped object, otherwise return the input as is.
   */
  private Resource getWrappedResource(Resource resource) {
      log.log(Level.INFO, "AppResourceHandler#getWrappedResource created."+ToStringBuilder.reflectionToString(resource)   );
      WebAppResource webAppResource = null;
      ExternalContext context = FacesContext.getCurrentInstance()
                                            .getExternalContext();
      // Get hold of the webapp resources directory name
      String resourcesRoot = null;
      if (resourcesRoot == null) {
          resourcesRoot = context.getInitParameter(WEBAPP_RESOURCES_DIRECTORY_PARAM_NAME);
          if (resourcesRoot == null) {
              resourcesRoot = "/resources";
          }
      }

      if (resource != null) {
          URL baseURL = resource.getURL();
          if (baseURL != null) {
              String extForm = baseURL.toExternalForm();
              int idx = extForm.indexOf(resourcesRoot);
              if (idx != -1) {
                  try {
                      extForm = extForm.substring(idx);
                      URL resourceURL = context.getResource(extForm);
                      if (resourceURL != null) {
                          webAppResource = new WebAppResource(extForm,
                                                              resource);
                      }
                  } catch (MalformedURLException e) {}
              }
          }
      }
      return webAppResource != null ? webAppResource : resource;
  }
}
