package com.jalim.dev.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api(value = "JalimRestController")
@RestController
public class JalimRestController {

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success request")
    })
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public ResponseEntity<?> helloGet(
            @RequestParam(value="name",required=false,defaultValue="swagger_test") String name,
            @RequestParam(value="password",required=true) String password) {

        Map<String, String> datas = new HashMap<>();
        datas.put("data", "name : " + name + ", password" + password);

        return ResponseEntity.ok(datas);
    }

}