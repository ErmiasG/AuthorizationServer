/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.oauth2.authorization.server.ejb;

import io.hops.oauth2.authorization.server.entities.OauthClientDetails;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ermias
 */
@Stateless
public class OauthClientDetailsFacade extends AbstractFacade<OauthClientDetails> {

  @PersistenceContext(unitName = "oauth2_PU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public OauthClientDetailsFacade() {
    super(OauthClientDetails.class);
  }

}
