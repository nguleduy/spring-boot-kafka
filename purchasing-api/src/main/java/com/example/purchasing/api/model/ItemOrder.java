package com.example.purchasing.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.Objects;

@Validated
@Getter
@Setter
public class ItemOrder {

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("unitPrice")
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
  public boolean equals(Object o) {
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
    sb.append("class ItemOrder {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
