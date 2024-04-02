package com.example.echo;

import com.example.echo.data.CoordinateDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoordinateController {

    @PostMapping("/api/get_all_data")
    public CoordinateDTO getData(@RequestBody CoordinateDTO coordinateDTO) {
        return coordinateDTO;
    }

    @PostMapping("/api/response_ok")
    public ResponseEntity<String> alwaysOK() {
        return ResponseEntity.ok().build(); //return 200ok
    }

    @PostMapping("/api/response_bad")
    public ResponseEntity<String> alwaysBadRequest() {
        return ResponseEntity.badRequest().build(); //return Bad Request
    }

}