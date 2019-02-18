/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.oauth2.authorization.server.web.service.user.service;

import io.hops.oauth2.authorization.server.ejb.GroupsFacade;
import io.hops.oauth2.authorization.server.entities.Groups;
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
@Path("groups")
public class GroupsFacadeREST {

  @EJB
  private GroupsFacade groupsFacade;

  @POST
  @Consumes({MediaType.APPLICATION_JSON})
  public void create(Groups entity) {
    groupsFacade.create(entity);
  }

  @PUT
  @Path("{id}")
  @Consumes({MediaType.APPLICATION_JSON})
  public void edit(@PathParam("id") Integer id, Groups entity) {
    groupsFacade.edit(entity);
  }

  @DELETE
  @Path("{id}")
  public void remove(@PathParam("id") Integer id) {
    groupsFacade.remove(groupsFacade.find(id));
  }

  @GET
  @Path("{id}")
  @Produces({MediaType.APPLICATION_JSON})
  public Groups find(@PathParam("id") Integer id) {
    return groupsFacade.find(id);
  }

  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public List<Groups> findAll() {
    return groupsFacade.findAll();
  }

  @GET
  @Path("{from}/{to}")
  @Produces({MediaType.APPLICATION_JSON})
  public List<Groups> findRange(
      @PathParam("from") Integer from,
      @PathParam("to") Integer to) {
    return groupsFacade.findRange(new int[]{from, to});
  }

  @GET
  @Path("count")
  @Produces(MediaType.TEXT_PLAIN)
  public String countREST() {
    return String.valueOf(groupsFacade.count());
  }

}
