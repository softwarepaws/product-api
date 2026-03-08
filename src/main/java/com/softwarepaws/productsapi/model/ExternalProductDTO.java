package com.softwarepaws.productsapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ExternalProductDTO {
    private String ean;
    private String upc;
    private String title;
    private String brand;
    private String model;
    private String description;
    private String category;
    
    @JsonProperty("images")
    private List<String> imageUrls;
    
    // upcitemdb uses specific keys for specs
    private String weight;
    private String dimension; 
}