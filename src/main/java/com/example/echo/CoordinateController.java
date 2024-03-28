package com.example.echo;

import com.example.echo.data.CoordinateDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoordinateController {

    @GetMapping("/api/get_all_data")
    public CoordinateDTO getData(@RequestBody CoordinateDTO coordinateDTO) {
        return coordinateDTO;
    }

    @GetMapping("/api/response_ok")
    public ResponseEntity<String> alwaysOK() {
        return ResponseEntity.ok().build(); //return 200ok
    }

    @GetMapping("/api/response_bad")
    public ResponseEntity<String> alwaysBadRequest() {
        return ResponseEntity.badRequest().build(); //return Bad Request
    }

}