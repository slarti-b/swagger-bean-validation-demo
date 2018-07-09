package com.carus.api.bug.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Child object to body
 */
@ApiModel(description = "Child object to body")
@Validated

public class DemoSub  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("x")
  private String x = null;

  @JsonProperty("y")
  private String y = null;

  public DemoSub x(String x) {
    this.x = x;
    return this;
  }

  /**
   * Required string X
   * @return x
  **/
  @ApiModelProperty(required = true, value = "Required string X")
  @NotNull


  public String getX() {
    return x;
  }

  public void setX(String x) {
    this.x = x;
  }

  public DemoSub y(String y) {
    this.y = y;
    return this;
  }

  /**
   * Optional string Y
   * @return y
  **/
  @ApiModelProperty(value = "Optional string Y")


  public String getY() {
    return y;
  }

  public void setY(String y) {
    this.y = y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemoSub demoSub = (DemoSub) o;
    return Objects.equals(this.x, demoSub.x) &&
        Objects.equals(this.y, demoSub.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemoSub {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

