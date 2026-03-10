package com.softwarepaws.productsapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "products", indexes = { @Index(name = "idx_ean_13", columnList = "ean13"),
		@Index(name = "idx_upc_12", columnList = "upc12") })
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@Column(name = "PK_PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, length = 13)
	private String ean13;

	@Column(unique = true, length = 12)
	private String upc12;

	@Column(unique = true, length = 10)
	private String asin;

	private String mpn;
	
	@Column(nullable = false)
	private String title;

	private String brand;
	private String manufacturer;
	private String model;

	@Column(columnDefinition = "TEXT")
	private String description;

	private String category;

	@ElementCollection
	@CollectionTable(name = "product_images", joinColumns = @JoinColumn(name = "product_id"))
	@Column(name = "image_url")
	private List<String> imageUrls;

	private String weight;
	private String dimensions;
	private String color;
	private String size;

	private String sourceUrl; // URL of the upcitemdb source or retailer link

	private LocalDateTime lastSyncedAt;

	@PrePersist
	@PreUpdate
	protected void onUpdate() {
		lastSyncedAt = LocalDateTime.now();
	}
}