package com.example.parcial02ncapas.Model.DTOs;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

import java.text.DecimalFormat;
import java.util.SplittableRandom;

public class MagicArticleDTO {


    private String name;

    @Pattern(regexp = "^[0-2]$")
    private Integer type;

    @Min(value = 1)
    private DecimalFormat price;

    private Long idMP;

}
