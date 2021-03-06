/*
 * stex.com rest API description
 * This is API you can use to connect your application to stex.com exchange and utilize all available features. All requests should go to the https://api3.stex.com followed by the one of the endpoint described below. The enpoints placed inside the /public section do not require authentication, all others requests should be authenticated with credentials you can get in your profile at https://app.stex.com/en/profile We also have a web-socket API present that has a number of advantages and is recommended way to connect to get the updates of the trading information To test API using this tool, please specify https://apidocs.stex.com/oauth2-redirect.html as Redirect URL in your API v3 client at https://app.stex.com/en/profile/settings 
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.pseq.stex.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UserVerifications
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-02T20:38:18.888Z[GMT]")public class UserVerifications {

  @JsonProperty("cryptonomica")

  private Boolean cryptonomica = null;

  @JsonProperty("privatbank")

  private Boolean privatbank = null;

  @JsonProperty("stex")

  private Boolean stex = null;
  public UserVerifications cryptonomica(Boolean cryptonomica) {
    this.cryptonomica = cryptonomica;
    return this;
  }

  

  /**
  * Get cryptonomica
  * @return cryptonomica
  **/
  @Schema(description = "")
  public Boolean isCryptonomica() {
    return cryptonomica;
  }
  public void setCryptonomica(Boolean cryptonomica) {
    this.cryptonomica = cryptonomica;
  }
  public UserVerifications privatbank(Boolean privatbank) {
    this.privatbank = privatbank;
    return this;
  }

  

  /**
  * Get privatbank
  * @return privatbank
  **/
  @Schema(description = "")
  public Boolean isPrivatbank() {
    return privatbank;
  }
  public void setPrivatbank(Boolean privatbank) {
    this.privatbank = privatbank;
  }
  public UserVerifications stex(Boolean stex) {
    this.stex = stex;
    return this;
  }

  

  /**
  * Get stex
  * @return stex
  **/
  @Schema(description = "")
  public Boolean isStex() {
    return stex;
  }
  public void setStex(Boolean stex) {
    this.stex = stex;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserVerifications userVerifications = (UserVerifications) o;
    return Objects.equals(this.cryptonomica, userVerifications.cryptonomica) &&
        Objects.equals(this.privatbank, userVerifications.privatbank) &&
        Objects.equals(this.stex, userVerifications.stex);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(cryptonomica, privatbank, stex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserVerifications {\n");
    
    sb.append("    cryptonomica: ").append(toIndentedString(cryptonomica)).append("\n");
    sb.append("    privatbank: ").append(toIndentedString(privatbank)).append("\n");
    sb.append("    stex: ").append(toIndentedString(stex)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
