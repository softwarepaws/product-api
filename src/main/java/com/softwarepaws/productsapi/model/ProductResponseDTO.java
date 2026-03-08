package com.softwarepaws.productsapi.model;

import lombok.Data;
import java.util.List;

@Data
public class ProductResponseDTO {
    private String ean13;
    private String upc12;
    private String title;
    private String brand;
    private String model;
    private String description;
    private String category;
    private List<String> imageUrls;
    private String weight;
    private String dimensions;
}


