package io.swagger.api;


import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T22:07:44.510Z")

@Api(value = "", description = "the  API")
public interface DefaultApi {

    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Echo GET", response = Void.class) })
    @RequestMapping(value = "/",
        method = RequestMethod.GET)
    ResponseEntity<Void> rootGet();


    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Echo POST", response = Void.class) })
    @RequestMapping(value = "/",
        method = RequestMethod.POST)
    ResponseEntity<Void> rootPost(


@ApiParam(value = "name" ) @RequestPart(value="name", required=false)  String name
,


@ApiParam(value = "year" ) @RequestPart(value="year", required=false)  String year
);

}
