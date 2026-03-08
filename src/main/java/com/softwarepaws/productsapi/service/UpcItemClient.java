package com.softwarepaws.productsapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import com.softwarepaws.productsapi.model.UpcProductDbResponse;

@FeignClient(name = "upcitemdb-client", url = "${upcitemdb.api.url}")
public interface UpcItemClient {
	UpcProductDbResponse getProductByUpc(String upc);
}
