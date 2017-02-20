package io.swagger.api;


import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T22:07:44.510Z")

@Api(value = "test-path", description = "the test-path API")
public interface TestPathApi {

    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Echo test-path", response = Void.class) })
    @RequestMapping(value = "/test-path/{id}",
        method = RequestMethod.GET)
    ResponseEntity<Void> testPathIdGet(
@ApiParam(value = "ID",required=true ) @PathVariable("id") String id


);

}
