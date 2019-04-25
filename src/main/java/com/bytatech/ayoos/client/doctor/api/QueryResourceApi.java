/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.client.doctor.api;

import com.bytatech.ayoos.client.doctor.model.Doctor;
import com.bytatech.ayoos.client.doctor.model.PageOfReview;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-25T12:28:19.615+05:30[Asia/Calcutta]")

@Api(value = "QueryResource", description = "the QueryResource API")
public interface QueryResourceApi {

    @ApiOperation(value = "findAllReview", nickname = "findAllReviewUsingGET", notes = "", response = PageOfReview.class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PageOfReview.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/queries/review",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<PageOfReview> findAllReviewUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "findDoctor", nickname = "findDoctorUsingGET", notes = "", response = Doctor.class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Doctor.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/queries/doctor/{searchTerm}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Doctor> findDoctorUsingGET(@ApiParam(value = "searchTerm",required=true) @PathVariable("searchTerm") String searchTerm,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);

}
