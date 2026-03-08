package com.softwarepaws.productsapi.model;

import java.util.List;

import lombok.Data;

@Data
public class UpcProductDbResponse {
    private String code;
    private List<ExternalProductDTO> items;
}