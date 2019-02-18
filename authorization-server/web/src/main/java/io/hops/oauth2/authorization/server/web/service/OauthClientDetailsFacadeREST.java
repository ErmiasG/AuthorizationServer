/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.oauth2.authorization.server.web.service;

import io.hops.oauth2.authorization.server.ejb.OauthClientDetailsFacade;
import io.hops.oauth2.authorization.server.entities.OauthClientDetails;
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
@Path("oauthclientdetails")
public class OauthClientDetailsFacadeREST {

@EJB
private OauthClientDetailsFacade oauthClientDetailsFacade;

  @POST
  @Consumes({MediaType.APPLICATION_JSON})
  public void create(OauthClientDetails entity) {
    oauthClientDetailsFacade.create(entity);
  }

  @PUT
  @Path("{id}")
  @Consumes({MediaType.APPLICATION_JSON})
  public void edit(@PathParam("id") String id, OauthClientDetails entity) {
    oauthClientDetailsFacade.edit(entity);
  }

  @DELETE
  @Path("{id}")
  public void remove(@PathParam("id") String id) {
    oauthClientDetailsFacade.remove(oauthClientDetailsFacade.find(id));
  }

  @GET
  @Path("{id}")
  @Produces({MediaType.APPLICATION_JSON})
  public OauthClientDetails find(@PathParam("id") String id) {
    return oauthClientDetailsFacade.find(id);
  }

  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public List<OauthClientDetails> findAll() {
    return oauthClientDetailsFacade.findAll();
  }

  @GET
  @Path("{from}/{to}")
  @Produces({MediaType.APPLICATION_JSON})
  public List<OauthClientDetails> findRange(
      @PathParam("from") Integer from,
      @PathParam("to") Integer to) {
    return oauthClientDetailsFacade.findRange(new int[]{from, to});
  }

  @GET
  @Path("count")
  @Produces(MediaType.TEXT_PLAIN)
  public String countREST() {
    return String.valueOf(oauthClientDetailsFacade.count());
  }

}
