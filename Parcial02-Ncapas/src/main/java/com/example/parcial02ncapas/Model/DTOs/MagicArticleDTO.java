package com.example.parcial02ncapas.Model.DTOs;

import jakarta.validation.constraints.Min;

import java.text.DecimalFormat;
import java.util.SplittableRandom;

public class MagicArticleDTO {


    private String name;

    private Enum type;

    @Min(value = 1)
    private DecimalFormat price;

    private Long idMP;

}
