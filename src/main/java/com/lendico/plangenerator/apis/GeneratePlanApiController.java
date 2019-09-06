package com.lendico.plangenerator.apis;

import com.lendico.plangenerator.models.LoanDetails;
import com.lendico.plangenerator.models.RepaymentPlans;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-06T14:21:34.595+02:00")

@Controller
public class GeneratePlanApiController implements GeneratePlanApi {

    private static final Logger log = LoggerFactory.getLogger(GeneratePlanApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GeneratePlanApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<RepaymentPlans> preCalculateRepaymentPlans(@ApiParam(value = " Loan Details for generating pre-calculated repayment plans" ,required=true )  @Valid @RequestBody LoanDetails body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RepaymentPlans>(objectMapper.readValue("{  \"repaymentPlans\" : [ {    \"borrowerPaymentAmount\" : 0.8008282,    \"date\" : \"2000-01-23T04:56:07.000+00:00\",    \"principal\" : 5.962134,    \"remainingOutstandingPrincipal\" : 5.637377,    \"interest\" : 1.4658129,    \"initialOutstandingPrincipal\" : 6.0274563  }, {    \"borrowerPaymentAmount\" : 0.8008282,    \"date\" : \"2000-01-23T04:56:07.000+00:00\",    \"principal\" : 5.962134,    \"remainingOutstandingPrincipal\" : 5.637377,    \"interest\" : 1.4658129,    \"initialOutstandingPrincipal\" : 6.0274563  } ]}", RepaymentPlans.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RepaymentPlans>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RepaymentPlans>(HttpStatus.NOT_IMPLEMENTED);
    }

}
