/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.oauth2.authorization.server.ejb;

import io.hops.oauth2.authorization.server.entities.OauthClientToken;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ermias
 */
@Stateless
public class OauthClientTokenFacade extends AbstractFacade<OauthClientToken> {

  @PersistenceContext(unitName = "oauth2_PU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public OauthClientTokenFacade() {
    super(OauthClientToken.class);
  }

}
