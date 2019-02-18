/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.oauth2.authorization.server.web.service;

import io.hops.oauth2.authorization.server.ejb.OauthClientTokenFacade;
import io.hops.oauth2.authorization.server.entities.OauthClientToken;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ermias
 */
@Stateless
@Path("oauthclienttoken")
public class OauthClientTokenFacadeREST {

  @EJB
  private OauthClientTokenFacade oauthClientTokenFacade;

  @POST
  @Consumes({MediaType.APPLICATION_JSON})
  public void create(OauthClientToken entity) {
    oauthClientTokenFacade.create(entity);
  }

  @PUT
  @Path("{id}")
  @Consumes({MediaType.APPLICATION_JSON})
  public void edit(@PathParam("id") String id, OauthClientToken entity) {
    oauthClientTokenFacade.edit(entity);
  }

  @DELETE
  @Path("{id}")
  public void remove(@PathParam("id") String id) {
    oauthClientTokenFacade.remove(oauthClientTokenFacade.find(id));
  }

  @GET
  @Path("{id}")
  @Produces({MediaType.APPLICATION_JSON})
  public OauthClientToken find(@PathParam("id") String id) {
    return oauthClientTokenFacade.find(id);
  }

  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public List<OauthClientToken> findAll() {
    return oauthClientTokenFacade.findAll();
  }

  @GET
  @Path("{from}/{to}")
  @Produces({MediaType.APPLICATION_JSON})
  public List<OauthClientToken> findRange(
      @PathParam("from") Integer from,
      @PathParam("to") Integer to) {
    return oauthClientTokenFacade.findRange(new int[]{from, to});
  }

  @GET
  @Path("count")
  @Produces(MediaType.TEXT_PLAIN)
  public String countREST() {
    return String.valueOf(oauthClientTokenFacade.count());
  }

}
