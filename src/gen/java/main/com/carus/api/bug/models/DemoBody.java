package com.carus.api.bug.models;

import java.util.Objects;
import com.carus.api.bug.models.DemoSub;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Demo body object
 */
@ApiModel(description = "Demo body object")
@Validated

public class DemoBody  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("foo")
  private String foo = null;

  /**
   * Required Enum property
   */
  public enum BarEnum {
    A("A"),
    
    B("B");

    private String value;

    BarEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BarEnum fromValue(String text) {
      for (BarEnum b : BarEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("bar")
  private BarEnum bar = null;

  @JsonProperty("baz")
  private String baz = null;

  /**
   * optional enum propert
   */
  public enum QuxEnum {
    C("C"),
    
    D("D");

    private String value;

    QuxEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static QuxEnum fromValue(String text) {
      for (QuxEnum b : QuxEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("qux")
  private QuxEnum qux = null;

  @JsonProperty("reqSub")
  private DemoSub reqSub = null;

  @JsonProperty("optSub")
  private DemoSub optSub = null;

  public DemoBody foo(String foo) {
    this.foo = foo;
    return this;
  }

  /**
   * Required string property
   * @return foo
  **/
  @ApiModelProperty(required = true, value = "Required string property")
  @NotNull


  public String getFoo() {
    return foo;
  }

  public void setFoo(String foo) {
    this.foo = foo;
  }

  public DemoBody bar(BarEnum bar) {
    this.bar = bar;
    return this;
  }

  /**
   * Required Enum property
   * @return bar
  **/
  @ApiModelProperty(required = true, value = "Required Enum property")
  @NotNull


  public BarEnum getBar() {
    return bar;
  }

  public void setBar(BarEnum bar) {
    this.bar = bar;
  }

  public DemoBody baz(String baz) {
    this.baz = baz;
    return this;
  }

  /**
   * optional string property
   * @return baz
  **/
  @ApiModelProperty(value = "optional string property")


  public String getBaz() {
    return baz;
  }

  public void setBaz(String baz) {
    this.baz = baz;
  }

  public DemoBody qux(QuxEnum qux) {
    this.qux = qux;
    return this;
  }

  /**
   * optional enum propert
   * @return qux
  **/
  @ApiModelProperty(value = "optional enum propert")


  public QuxEnum getQux() {
    return qux;
  }

  public void setQux(QuxEnum qux) {
    this.qux = qux;
  }

  public DemoBody reqSub(DemoSub reqSub) {
    this.reqSub = reqSub;
    return this;
  }

  /**
   * Get reqSub
   * @return reqSub
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DemoSub getReqSub() {
    return reqSub;
  }

  public void setReqSub(DemoSub reqSub) {
    this.reqSub = reqSub;
  }

  public DemoBody optSub(DemoSub optSub) {
    this.optSub = optSub;
    return this;
  }

  /**
   * Get optSub
   * @return optSub
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DemoSub getOptSub() {
    return optSub;
  }

  public void setOptSub(DemoSub optSub) {
    this.optSub = optSub;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemoBody demoBody = (DemoBody) o;
    return Objects.equals(this.foo, demoBody.foo) &&
        Objects.equals(this.bar, demoBody.bar) &&
        Objects.equals(this.baz, demoBody.baz) &&
        Objects.equals(this.qux, demoBody.qux) &&
        Objects.equals(this.reqSub, demoBody.reqSub) &&
        Objects.equals(this.optSub, demoBody.optSub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foo, bar, baz, qux, reqSub, optSub);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemoBody {\n");
    
    sb.append("    foo: ").append(toIndentedString(foo)).append("\n");
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
    sb.append("    baz: ").append(toIndentedString(baz)).append("\n");
    sb.append("    qux: ").append(toIndentedString(qux)).append("\n");
    sb.append("    reqSub: ").append(toIndentedString(reqSub)).append("\n");
    sb.append("    optSub: ").append(toIndentedString(optSub)).append("\n");
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

