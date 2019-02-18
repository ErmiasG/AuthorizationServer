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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ermias
 */
@Entity
@Table(name = "ClientDetails",
    catalog = "oauth",
    schema = "")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "ClientDetails.findAll",
      query = "SELECT c FROM ClientDetails c"),
  @NamedQuery(name = "ClientDetails.findByAppId",
      query = "SELECT c FROM ClientDetails c WHERE c.appId = :appId"),
  @NamedQuery(name = "ClientDetails.findByResourceIds",
      query
      = "SELECT c FROM ClientDetails c WHERE c.resourceIds = :resourceIds"),
  @NamedQuery(name = "ClientDetails.findByAppSecret",
      query
      = "SELECT c FROM ClientDetails c WHERE c.appSecret = :appSecret"),
  @NamedQuery(name = "ClientDetails.findByScope",
      query = "SELECT c FROM ClientDetails c WHERE c.scope = :scope"),
  @NamedQuery(name = "ClientDetails.findByGrantTypes",
      query
      = "SELECT c FROM ClientDetails c WHERE c.grantTypes = :grantTypes"),
  @NamedQuery(name = "ClientDetails.findByRedirectUrl",
      query
      = "SELECT c FROM ClientDetails c WHERE c.redirectUrl = :redirectUrl"),
  @NamedQuery(name = "ClientDetails.findByAuthorities",
      query
      = "SELECT c FROM ClientDetails c WHERE c.authorities = :authorities"),
  @NamedQuery(name = "ClientDetails.findByAccessTokenValidity",
      query
      = "SELECT c FROM ClientDetails c WHERE c.accessTokenValidity = :accessTokenValidity"),
  @NamedQuery(name = "ClientDetails.findByRefreshTokenValidity",
      query
      = "SELECT c FROM ClientDetails c WHERE c.refreshTokenValidity = :refreshTokenValidity"),
  @NamedQuery(name = "ClientDetails.findByAdditionalInformation",
      query
      = "SELECT c FROM ClientDetails c WHERE c.additionalInformation = :additionalInformation"),
  @NamedQuery(name = "ClientDetails.findByAutoApproveScopes",
      query
      = "SELECT c FROM ClientDetails c WHERE c.autoApproveScopes = :autoApproveScopes")})
public class ClientDetails implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "appId")
  private String appId;
  @Column(name = "resourceIds")
  private String resourceIds;
  @Column(name = "appSecret")
  private String appSecret;
  @Column(name = "scope")
  private String scope;
  @Column(name = "grantTypes")
  private String grantTypes;
  @Column(name = "redirectUrl")
  private String redirectUrl;
  @Column(name = "authorities")
  private String authorities;
  @Column(name = "access_token_validity")
  private Integer accessTokenValidity;
  @Column(name = "refresh_token_validity")
  private Integer refreshTokenValidity;
  @Column(name = "additionalInformation")
  private String additionalInformation;
  @Column(name = "autoApproveScopes")
  private String autoApproveScopes;

  public ClientDetails() {
  }

  public ClientDetails(String appId) {
    this.appId = appId;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(String resourceIds) {
    this.resourceIds = resourceIds;
  }

  public String getAppSecret() {
    return appSecret;
  }

  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }

  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public String getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(String grantTypes) {
    this.grantTypes = grantTypes;
  }

  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public String getAuthorities() {
    return authorities;
  }

  public void setAuthorities(String authorities) {
    this.authorities = authorities;
  }

  public Integer getAccessTokenValidity() {
    return accessTokenValidity;
  }

  public void setAccessTokenValidity(Integer accessTokenValidity) {
    this.accessTokenValidity = accessTokenValidity;
  }

  public Integer getRefreshTokenValidity() {
    return refreshTokenValidity;
  }

  public void setRefreshTokenValidity(Integer refreshTokenValidity) {
    this.refreshTokenValidity = refreshTokenValidity;
  }

  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public String getAutoApproveScopes() {
    return autoApproveScopes;
  }

  public void setAutoApproveScopes(String autoApproveScopes) {
    this.autoApproveScopes = autoApproveScopes;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (appId != null ? appId.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof ClientDetails)) {
      return false;
    }
    ClientDetails other = (ClientDetails) object;
    if ((this.appId == null && other.appId != null) || (this.appId != null && !this.appId.equals(other.appId))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "io.hops.oauth2.authorization.server.entities.ClientDetails[ appId=" + appId + " ]";
  }

}
