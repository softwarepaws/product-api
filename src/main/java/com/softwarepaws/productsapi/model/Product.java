package com.softwarepaws.productsapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "products", indexes = {
    @Index(name = "idx_ean_13", columnList = "ean13"),
    @Index(name = "idx_upc_12", columnList = "upc12")
})
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @Column(name="PK_PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // --- Identifiers ---
    @Column(unique = true, length = 13)
    private String ean13; // Primary global identifier (GTIN-13)

    @Column(length = 12)
    private String upc12; // North American 12-digit format

    private String asin;  // Amazon Standard Identification Number
    private String mpn;   // Manufacturer Part Number

    // --- Core Information ---
    @Column(nullable = false)
    private String title;
    
    private String brand;
    private String manufacturer;
    private String model;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String category;

    // --- Media (Stored as URLs) ---
    @ElementCollection
    @CollectionTable(name = "product_images", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "image_url")
    private List<String> imageUrls;

    // --- Physical Specifications ---
    private String weight;
    private String dimensions;
    private String color;
    private String size;

    // --- Metadata ---
    private String sourceUrl; // URL of the upcitemdb source or retailer link
    
    private LocalDateTime lastSyncedAt;

    @PrePersist
    @PreUpdate
    protected void onUpdate() {
        lastSyncedAt = LocalDateTime.now();
    }
}