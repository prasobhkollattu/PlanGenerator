package com.company.plangenerator.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.company.plangenerator.models.RepaymentPlan;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RepaymentPlans
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-07T14:22:46.818+02:00")

public class RepaymentPlans   {
  @JsonProperty("repaymentPlans")
  @Valid
  private List<RepaymentPlan> repaymentPlans = null;

  public RepaymentPlans repaymentPlans(List<RepaymentPlan> repaymentPlans) {
    this.repaymentPlans = repaymentPlans;
    return this;
  }

  public RepaymentPlans addRepaymentPlansItem(RepaymentPlan repaymentPlansItem) {
    if (this.repaymentPlans == null) {
      this.repaymentPlans = new ArrayList<>();
    }
    this.repaymentPlans.add(repaymentPlansItem);
    return this;
  }

  /**
   * Get repaymentPlans
   * @return repaymentPlans
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RepaymentPlan> getRepaymentPlans() {
    return repaymentPlans;
  }

  public void setRepaymentPlans(List<RepaymentPlan> repaymentPlans) {
    this.repaymentPlans = repaymentPlans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepaymentPlans repaymentPlans = (RepaymentPlans) o;
    return Objects.equals(this.repaymentPlans, repaymentPlans.repaymentPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repaymentPlans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepaymentPlans {\n");
    
    sb.append("    repaymentPlans: ").append(toIndentedString(repaymentPlans)).append("\n");
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

