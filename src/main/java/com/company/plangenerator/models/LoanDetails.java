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
 * LoanDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-07T18:35:38.073+02:00")

public class LoanDetails   {
  @JsonProperty("loanAmount")
  private Double loanAmount = null;

  @JsonProperty("nominalRate")
  private Double nominalRate = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  public LoanDetails loanAmount(Double loanAmount) {
    this.loanAmount = loanAmount;
    return this;
  }

  /**
   * Get loanAmount
   * @return loanAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(Double loanAmount) {
    this.loanAmount = loanAmount;
  }

  public LoanDetails nominalRate(Double nominalRate) {
    this.nominalRate = nominalRate;
    return this;
  }

  /**
   * Get nominalRate
   * @return nominalRate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getNominalRate() {
    return nominalRate;
  }

  public void setNominalRate(Double nominalRate) {
    this.nominalRate = nominalRate;
  }

  public LoanDetails duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public LoanDetails startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanDetails loanDetails = (LoanDetails) o;
    return Objects.equals(this.loanAmount, loanDetails.loanAmount) &&
        Objects.equals(this.nominalRate, loanDetails.nominalRate) &&
        Objects.equals(this.duration, loanDetails.duration) &&
        Objects.equals(this.startDate, loanDetails.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanAmount, nominalRate, duration, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanDetails {\n");
    
    sb.append("    loanAmount: ").append(toIndentedString(loanAmount)).append("\n");
    sb.append("    nominalRate: ").append(toIndentedString(nominalRate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

