package com.example.billing.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@Validated
@Getter
@Setter
public class Customer {

  @JsonProperty("id" )
  @ApiModelProperty(required = true, value = "" )
  @NotNull
  private String id = null;

  @JsonProperty("name" )
  @ApiModelProperty(required = true, value = "" )
  @NotNull
  private String name = null;

  @JsonProperty("address" )
  @ApiModelProperty(required = true, value = "" )
  @NotNull
  private String address = null;

  @JsonProperty("email" )
  @ApiModelProperty(required = true, value = "" )
  @NotNull
  private String email = null;

  public Customer id(String id) {
    this.id = id;
    return this;
  }

  public Customer name(String name) {
    this.name = name;
    return this;
  }

  public Customer address(String address) {
    this.address = address;
    return this;
  }

  public Customer email(String email) {
    this.email = email;
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
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
            Objects.equals(this.name, customer.name) &&
            Objects.equals(this.address, customer.address) &&
            Objects.equals(this.email, customer.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n" );

    sb.append("    id: " ).append(toIndentedString(id)).append("\n" );
    sb.append("    name: " ).append(toIndentedString(name)).append("\n" );
    sb.append("    address: " ).append(toIndentedString(address)).append("\n" );
    sb.append("    email: " ).append(toIndentedString(email)).append("\n" );
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
