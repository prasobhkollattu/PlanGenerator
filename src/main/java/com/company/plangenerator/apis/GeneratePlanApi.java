/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.company.plangenerator.apis;

import com.company.plangenerator.models.LoanDetails;
import com.company.plangenerator.models.RepaymentPlans;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-07T18:59:10.928+02:00")

@Api(value = "generate-plan", description = "the generate-plan API")
public interface GeneratePlanApi {

    Logger log = LoggerFactory.getLogger(GeneratePlanApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "pre-calculated repayment plans throughout the lifetime of a loan", nickname = "preCalculateRepaymentPlans", notes = "", response = RepaymentPlans.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "plan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful", response = RepaymentPlans.class),
        @ApiResponse(code = 400, message = "The given input has not the right format"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/generate-plan",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<RepaymentPlans> preCalculateRepaymentPlans(@ApiParam(value = " Loan Details for generating pre-calculated repayment plans" ,required=true )  @Valid @RequestBody LoanDetails body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"repaymentPlans\" : [ {    \"borrowerPaymentAmount\" : 0.8008281904610115,    \"date\" : \"2000-01-23T04:56:07.000+00:00\",    \"principal\" : 5.962133916683182,    \"remainingOutstandingPrincipal\" : 5.637376656633329,    \"interest\" : 1.4658129805029452,    \"initialOutstandingPrincipal\" : 6.027456183070403  }, {    \"borrowerPaymentAmount\" : 0.8008281904610115,    \"date\" : \"2000-01-23T04:56:07.000+00:00\",    \"principal\" : 5.962133916683182,    \"remainingOutstandingPrincipal\" : 5.637376656633329,    \"interest\" : 1.4658129805029452,    \"initialOutstandingPrincipal\" : 6.027456183070403  } ]}", RepaymentPlans.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default GeneratePlanApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
