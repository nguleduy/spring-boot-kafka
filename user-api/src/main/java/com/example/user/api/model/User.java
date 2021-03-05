package com.example.user.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@Validated
public class User {

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

  public User id(String id) {
    this.id = id;
    return this;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  public User address(String address) {
    this.address = address;
    return this;
  }

  public User email(String email) {
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
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
            Objects.equals(this.name, user.name) &&
            Objects.equals(this.address, user.address) &&
            Objects.equals(this.email, user.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n" );

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
