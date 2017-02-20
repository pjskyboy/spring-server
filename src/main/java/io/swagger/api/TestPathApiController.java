package io.swagger.api;


import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T22:07:44.510Z")

@Controller
public class TestPathApiController implements TestPathApi {

    public ResponseEntity<Void> testPathIdGet(
@ApiParam(value = "ID",required=true ) @PathVariable("id") String id


) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
