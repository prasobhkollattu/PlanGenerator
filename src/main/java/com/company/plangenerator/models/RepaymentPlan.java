package com.company.plangenerator.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RepaymentPlan
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-07T14:22:46.818+02:00")

public class RepaymentPlan   {
  @JsonProperty("borrowerPaymentAmount")
  private Double borrowerPaymentAmount = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("initialOutstandingPrincipal")
  private Double initialOutstandingPrincipal = null;

  @JsonProperty("interest")
  private Double interest = null;

  @JsonProperty("principal")
  private Double principal = null;

  @JsonProperty("remainingOutstandingPrincipal")
  private Double remainingOutstandingPrincipal = null;

  public RepaymentPlan borrowerPaymentAmount(Double borrowerPaymentAmount) {
    this.borrowerPaymentAmount = borrowerPaymentAmount;
    return this;
  }

  /**
   * Get borrowerPaymentAmount
   * @return borrowerPaymentAmount
  **/
  @ApiModelProperty(value = "")


  public Double getBorrowerPaymentAmount() {
    return borrowerPaymentAmount;
  }

  public void setBorrowerPaymentAmount(Double borrowerPaymentAmount) {
    this.borrowerPaymentAmount = borrowerPaymentAmount;
  }

  public RepaymentPlan date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public RepaymentPlan initialOutstandingPrincipal(Double initialOutstandingPrincipal) {
    this.initialOutstandingPrincipal = initialOutstandingPrincipal;
    return this;
  }

  /**
   * Get initialOutstandingPrincipal
   * @return initialOutstandingPrincipal
  **/
  @ApiModelProperty(value = "")


  public Double getInitialOutstandingPrincipal() {
    return initialOutstandingPrincipal;
  }

  public void setInitialOutstandingPrincipal(Double initialOutstandingPrincipal) {
    this.initialOutstandingPrincipal = initialOutstandingPrincipal;
  }

  public RepaymentPlan interest(Double interest) {
    this.interest = interest;
    return this;
  }

  /**
   * Get interest
   * @return interest
  **/
  @ApiModelProperty(value = "")


  public Double getInterest() {
    return interest;
  }

  public void setInterest(Double interest) {
    this.interest = interest;
  }

  public RepaymentPlan principal(Double principal) {
    this.principal = principal;
    return this;
  }

  /**
   * Get principal
   * @return principal
  **/
  @ApiModelProperty(value = "")


  public Double getPrincipal() {
    return principal;
  }

  public void setPrincipal(Double principal) {
    this.principal = principal;
  }

  public RepaymentPlan remainingOutstandingPrincipal(Double remainingOutstandingPrincipal) {
    this.remainingOutstandingPrincipal = remainingOutstandingPrincipal;
    return this;
  }

  /**
   * Get remainingOutstandingPrincipal
   * @return remainingOutstandingPrincipal
  **/
  @ApiModelProperty(value = "")


  public Double getRemainingOutstandingPrincipal() {
    return remainingOutstandingPrincipal;
  }

  public void setRemainingOutstandingPrincipal(Double remainingOutstandingPrincipal) {
    this.remainingOutstandingPrincipal = remainingOutstandingPrincipal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepaymentPlan repaymentPlan = (RepaymentPlan) o;
    return Objects.equals(this.borrowerPaymentAmount, repaymentPlan.borrowerPaymentAmount) &&
        Objects.equals(this.date, repaymentPlan.date) &&
        Objects.equals(this.initialOutstandingPrincipal, repaymentPlan.initialOutstandingPrincipal) &&
        Objects.equals(this.interest, repaymentPlan.interest) &&
        Objects.equals(this.principal, repaymentPlan.principal) &&
        Objects.equals(this.remainingOutstandingPrincipal, repaymentPlan.remainingOutstandingPrincipal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borrowerPaymentAmount, date, initialOutstandingPrincipal, interest, principal, remainingOutstandingPrincipal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepaymentPlan {\n");
    
    sb.append("    borrowerPaymentAmount: ").append(toIndentedString(borrowerPaymentAmount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    initialOutstandingPrincipal: ").append(toIndentedString(initialOutstandingPrincipal)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    remainingOutstandingPrincipal: ").append(toIndentedString(remainingOutstandingPrincipal)).append("\n");
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

