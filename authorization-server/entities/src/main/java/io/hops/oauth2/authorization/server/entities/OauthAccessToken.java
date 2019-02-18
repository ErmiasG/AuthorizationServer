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
@Table(name = "oauth_access_token",
    catalog = "oauth",
    schema = "")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "OauthAccessToken.findAll",
      query = "SELECT o FROM OauthAccessToken o"),
  @NamedQuery(name = "OauthAccessToken.findByTokenId",
      query
      = "SELECT o FROM OauthAccessToken o WHERE o.tokenId = :tokenId"),
  @NamedQuery(name = "OauthAccessToken.findByAuthenticationId",
      query
      = "SELECT o FROM OauthAccessToken o WHERE o.authenticationId = :authenticationId"),
  @NamedQuery(name = "OauthAccessToken.findByUserName",
      query
      = "SELECT o FROM OauthAccessToken o WHERE o.userName = :userName"),
  @NamedQuery(name = "OauthAccessToken.findByClientId",
      query
      = "SELECT o FROM OauthAccessToken o WHERE o.clientId = :clientId"),
  @NamedQuery(name = "OauthAccessToken.findByRefreshToken",
      query
      = "SELECT o FROM OauthAccessToken o WHERE o.refreshToken = :refreshToken")})
public class OauthAccessToken implements Serializable {

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
  @Lob
  @Column(name = "authentication")
  private byte[] authentication;
  @Column(name = "refresh_token")
  private String refreshToken;

  public OauthAccessToken() {
  }

  public OauthAccessToken(String authenticationId) {
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

  public byte[] getAuthentication() {
    return authentication;
  }

  public void setAuthentication(byte[] authentication) {
    this.authentication = authentication;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
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
    if (!(object instanceof OauthAccessToken)) {
      return false;
    }
    OauthAccessToken other = (OauthAccessToken) object;
    if ((this.authenticationId == null && other.authenticationId != null) || (this.authenticationId != null
        && !this.authenticationId.equals(other.authenticationId))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "io.hops.oauth2.authorization.server.entities.OauthAccessToken[ authenticationId=" + authenticationId + " ]";
  }

}
