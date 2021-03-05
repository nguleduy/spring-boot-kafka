package com.example.billing.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Validated
@Getter
@Setter
public class Bill {

  @JsonProperty("id" )
  @ApiModelProperty(required = true, value = "" )
  @NotNull
  private String id = null;

  @JsonProperty("createdDate" )
  @ApiModelProperty(required = true, value = "" )
  @NotNull
  private String createdDate = null;

  @JsonProperty("customer" )
  @ApiModelProperty(required = true, value = "" )
  @NotNull
  @Valid
  private Customer customer = null;

  @JsonProperty("order" )
  @ApiModelProperty(required = true, value = "" )
  @NotNull
  @Valid
  private List<ItemOrder> order = new ArrayList<>();

  public Bill id(String id) {
    this.id = id;
    return this;
  }

  public Bill createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  public Bill order(List<ItemOrder> order) {
    this.order = order;
    return this;
  }

  public Bill addOrderItem(ItemOrder orderItem) {
    this.order.add(orderItem);
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
    Bill bill = (Bill) o;
    return Objects.equals(this.id, bill.id) &&
            Objects.equals(this.createdDate, bill.createdDate) &&
            Objects.equals(this.customer, bill.customer) &&
            Objects.equals(this.order, bill.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdDate, customer, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bill {\n" );

    sb.append("    id: " ).append(toIndentedString(id)).append("\n" );
    sb.append("    createdDate: " ).append(toIndentedString(createdDate)).append("\n" );
    sb.append("    customer: " ).append(toIndentedString(customer)).append("\n" );
    sb.append("    order: " ).append(toIndentedString(order)).append("\n" );
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
