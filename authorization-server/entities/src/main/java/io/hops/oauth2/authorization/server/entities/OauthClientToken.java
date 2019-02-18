/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.hops.oauth2.authorization.server.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ermias
 */
@Entity
@Table(name = "oauth_client_token",
    catalog = "oauth",
    schema = "")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "OauthClientToken.findAll",
      query = "SELECT o FROM OauthClientToken o"),
  @NamedQuery(name = "OauthClientToken.findByTokenId",
      query
      = "SELECT o FROM OauthClientToken o WHERE o.tokenId = :tokenId"),
  @NamedQuery(name = "OauthClientToken.findByAuthenticationId",
      query
      = "SELECT o FROM OauthClientToken o WHERE o.authenticationId = :authenticationId"),
  @NamedQuery(name = "OauthClientToken.findByUserName",
      query
      = "SELECT o FROM OauthClientToken o WHERE o.userName = :userName"),
  @NamedQuery(name = "OauthClientToken.findByClientId",
      query
      = "SELECT o FROM OauthClientToken o WHERE o.clientId = :clientId")})
public class OauthClientToken implements Serializable {

  private static final long serialVersionUID = 1L;
  @Column(name = "token_id")
  private String tokenId;
  @Lob
  @Column(name = "token")
  private byte[] token;
  @Id
  @Basic(optional = false)
  @Column(name = "authentication_id")
  private String authenticationId;
  @Column(name = "user_name")
  private String userName;
  @Column(name = "client_id")
  private String clientId;

  public OauthClientToken() {
  }

  public OauthClientToken(String authenticationId) {
    this.authenticationId = authenticationId;
  }

  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public byte[] getToken() {
    return token;
  }

  public void setToken(byte[] token) {
    this.token = token;
  }

  public String getAuthenticationId() {
    return authenticationId;
  }

  public void setAuthenticationId(String authenticationId) {
    this.authenticationId = authenticationId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (authenticationId != null ? authenticationId.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof OauthClientToken)) {
      return false;
    }
    OauthClientToken other = (OauthClientToken) object;
    if ((this.authenticationId == null && other.authenticationId != null) || (this.authenticationId != null
        && !this.authenticationId.equals(other.authenticationId))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "io.hops.oauth2.authorization.server.entities.OauthClientToken[ authenticationId=" + authenticationId + " ]";
  }

}
