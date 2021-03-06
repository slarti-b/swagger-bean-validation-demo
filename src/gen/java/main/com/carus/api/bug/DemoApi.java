/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.carus.api.bug;

import com.carus.api.bug.models.DemoBody;
import io.swagger.annotations.*;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Api(value = "demo", description = "the demo API")
public interface DemoApi {

    DemoApiDelegate getDelegate();

    @ApiOperation(value = "Demo of bug", nickname = "postDemo", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Invalid") })
    @RequestMapping(value = "/demo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default CompletableFuture<ResponseEntity<Void>> postDemo(@ApiParam(value = "Body param" ,required=true )  @Valid @RequestBody DemoBody bodyObj) {
        return getDelegate().postDemo(bodyObj);
    }

}
