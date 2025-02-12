package com.scaler.productservicejan31capstone.controllers;

import com.scaler.productservicejan31capstone.dtos.ProductResponseDto;
import com.scaler.productservicejan31capstone.models.Product;
import com.scaler.productservicejan31capstone.services.FakeStoreProductService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController
{

    FakeStoreProductService fakeStoreProductService;

    public ProductController(FakeStoreProductService fakeStoreProductService)
    {
        this.fakeStoreProductService = fakeStoreProductService;
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductResponseDto> getProductById(@PathVariable long id)
    {
        Product product = fakeStoreProductService.getProductById(id);
        ProductResponseDto productResponseDto = ProductResponseDto.from(product);

        ResponseEntity<ProductResponseDto> responseEntity =
                new ResponseEntity<>(productResponseDto, HttpStatus.FORBIDDEN);

        return responseEntity;
    }

}
