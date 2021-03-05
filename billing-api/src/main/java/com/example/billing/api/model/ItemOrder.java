package com.example.billing.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@Validated
@Getter
@Setter
public class ItemOrder {

  @JsonProperty("id" )
  @ApiModelProperty(required = true, value = "" )
  @NotNull
  private String id = null;

  @JsonProperty("name" )
  @ApiModelProperty(required = true, value = "" )
  @NotNull
  private String name = null;

  @JsonProperty("amount" )
  @ApiModelProperty(required = true, value = "" )
  @NotNull
  @Valid
  private BigDecimal amount = null;

  @JsonProperty("unitPrice" )
  @ApiModelProperty(required = true, value = "" )
  @NotNull
  @Valid
  private BigDecimal unitPrice = null;

  public ItemOrder id(String id) {
    this.id = id;
    return this;
  }

  public ItemOrder name(String name) {
    this.name = name;
    return this;
  }

  public ItemOrder amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  public ItemOrder unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemOrder itemOrder = (ItemOrder) o;
    return Objects.equals(this.id, itemOrder.id) &&
            Objects.equals(this.name, itemOrder.name) &&
            Objects.equals(this.amount, itemOrder.amount) &&
            Objects.equals(this.unitPrice, itemOrder.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, amount, unitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemOrder {\n" );

    sb.append("    id: " ).append(toIndentedString(id)).append("\n" );
    sb.append("    name: " ).append(toIndentedString(name)).append("\n" );
    sb.append("    amount: " ).append(toIndentedString(amount)).append("\n" );
    sb.append("    unitPrice: " ).append(toIndentedString(unitPrice)).append("\n" );
    sb.append("}" );
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
    return o.toString().replace("\n", "\n    " );
  }
}
