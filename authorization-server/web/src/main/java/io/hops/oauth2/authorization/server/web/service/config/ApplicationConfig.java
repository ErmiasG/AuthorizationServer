/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.oauth2.authorization.server.web.service.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author ermias
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> resources = new java.util.HashSet<>();
    addRestResourceClasses(resources);
    return resources;
  }

  /**
   * Do not modify addRestResourceClasses() method.
   * It is automatically populated with
   * all resources defined in the project.
   * If required, comment out calling this method in getClasses().
   */
  private void addRestResourceClasses(
      Set<Class<?>> resources) {
    resources.add(io.hops.oauth2.authorization.server.web.service.ClientDetailsFacadeREST.class);
    resources.add(io.hops.oauth2.authorization.server.web.service.OauthAccessTokenFacadeREST.class);
    resources.add(io.hops.oauth2.authorization.server.web.service.OauthClientDetailsFacadeREST.class);
    resources.add(io.hops.oauth2.authorization.server.web.service.OauthClientTokenFacadeREST.class);
    resources.add(io.hops.oauth2.authorization.server.web.service.user.service.GroupsFacadeREST.class);
    resources.add(io.hops.oauth2.authorization.server.web.service.user.service.PersonFacadeREST.class);
  }

}
