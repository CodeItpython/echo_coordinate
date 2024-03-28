package com.example.echo.data;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CoordinateDTO {
    private String location;

    private String spot;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private String comment;
}