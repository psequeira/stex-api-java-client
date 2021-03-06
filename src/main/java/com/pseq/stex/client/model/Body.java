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
import java.math.BigDecimal;

/**
 * Body
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-02T20:38:18.888Z[GMT]")public class Body {
  /**
   * order type (BUY / SELL / STOP_LIMIT_BUY / STOP_LIMIT_SELL)
   */
  public enum TypeEnum {
    BUY("BUY"),
    SELL("SELL"),
    STOP_LIMIT_BUY("STOP_LIMIT_BUY"),
    STOP_LIMIT_SELL("STOP_LIMIT_SELL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }
  @JsonProperty("type")

  private TypeEnum type = null;

  @JsonProperty("amount")

  private BigDecimal amount = null;

  @JsonProperty("price")

  private BigDecimal price = null;

  @JsonProperty("trigger_price")

  private BigDecimal triggerPrice = null;
  public Body type(TypeEnum type) {
    this.type = type;
    return this;
  }

  

  /**
  * order type (BUY / SELL / STOP_LIMIT_BUY / STOP_LIMIT_SELL)
  * @return type
  **/
  @Schema(required = true, description = "order type (BUY / SELL / STOP_LIMIT_BUY / STOP_LIMIT_SELL)")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }
  public Body amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  

  /**
  * Get amount
  * @return amount
  **/
  @Schema(required = true, description = "")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
  public Body price(BigDecimal price) {
    this.price = price;
    return this;
  }

  

  /**
  * Get price
  * @return price
  **/
  @Schema(required = true, description = "")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }
  public Body triggerPrice(BigDecimal triggerPrice) {
    this.triggerPrice = triggerPrice;
    return this;
  }

  

  /**
  * stop price for stop-limit orders. Required if the order is of type STOP_LIMIT_BUY or STOP_LIMIT_SELL
  * @return triggerPrice
  **/
  @Schema(description = "stop price for stop-limit orders. Required if the order is of type STOP_LIMIT_BUY or STOP_LIMIT_SELL")
  public BigDecimal getTriggerPrice() {
    return triggerPrice;
  }
  public void setTriggerPrice(BigDecimal triggerPrice) {
    this.triggerPrice = triggerPrice;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.type, body.type) &&
        Objects.equals(this.amount, body.amount) &&
        Objects.equals(this.price, body.price) &&
        Objects.equals(this.triggerPrice, body.triggerPrice);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(type, amount, price, triggerPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
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
