package com.example.echo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoordinateController {

    @PostMapping("/echo_coordinates")
    public CoordinateDTO echoCoordinates(@RequestBody CoordinateDTO coordinateDTO) {
        return coordinateDTO;
    }

}