package com.lendico.plangenerator.models;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-06T20:48:55.910+02:00")

public class RepaymentPlan   {
  @JsonProperty("borrowerPaymentAmount")
  private Float borrowerPaymentAmount = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("initialOutstandingPrincipal")
  private Float initialOutstandingPrincipal = null;

  @JsonProperty("interest")
  private Float interest = null;

  @JsonProperty("principal")
  private Float principal = null;

  @JsonProperty("remainingOutstandingPrincipal")
  private Float remainingOutstandingPrincipal = null;

  public RepaymentPlan borrowerPaymentAmount(Float borrowerPaymentAmount) {
    this.borrowerPaymentAmount = borrowerPaymentAmount;
    return this;
  }

  /**
   * Get borrowerPaymentAmount
   * @return borrowerPaymentAmount
  **/
  @ApiModelProperty(value = "")


  public Float getBorrowerPaymentAmount() {
    return borrowerPaymentAmount;
  }

  public void setBorrowerPaymentAmount(Float borrowerPaymentAmount) {
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

  public RepaymentPlan initialOutstandingPrincipal(Float initialOutstandingPrincipal) {
    this.initialOutstandingPrincipal = initialOutstandingPrincipal;
    return this;
  }

  /**
   * Get initialOutstandingPrincipal
   * @return initialOutstandingPrincipal
  **/
  @ApiModelProperty(value = "")


  public Float getInitialOutstandingPrincipal() {
    return initialOutstandingPrincipal;
  }

  public void setInitialOutstandingPrincipal(Float initialOutstandingPrincipal) {
    this.initialOutstandingPrincipal = initialOutstandingPrincipal;
  }

  public RepaymentPlan interest(Float interest) {
    this.interest = interest;
    return this;
  }

  /**
   * Get interest
   * @return interest
  **/
  @ApiModelProperty(value = "")


  public Float getInterest() {
    return interest;
  }

  public void setInterest(Float interest) {
    this.interest = interest;
  }

  public RepaymentPlan principal(Float principal) {
    this.principal = principal;
    return this;
  }

  /**
   * Get principal
   * @return principal
  **/
  @ApiModelProperty(value = "")


  public Float getPrincipal() {
    return principal;
  }

  public void setPrincipal(Float principal) {
    this.principal = principal;
  }

  public RepaymentPlan remainingOutstandingPrincipal(Float remainingOutstandingPrincipal) {
    this.remainingOutstandingPrincipal = remainingOutstandingPrincipal;
    return this;
  }

  /**
   * Get remainingOutstandingPrincipal
   * @return remainingOutstandingPrincipal
  **/
  @ApiModelProperty(value = "")


  public Float getRemainingOutstandingPrincipal() {
    return remainingOutstandingPrincipal;
  }

  public void setRemainingOutstandingPrincipal(Float remainingOutstandingPrincipal) {
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

