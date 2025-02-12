package com.scaler.productservicejan31capstone.services;

import com.scaler.productservicejan31capstone.dtos.FakeStoreProductDto;
import com.scaler.productservicejan31capstone.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService
{
    RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductById(long id)
    {
        FakeStoreProductDto fakeStoreProductDto =
                restTemplate.getForObject(
                "https://fakestoreapi.com/products/" + id,
                FakeStoreProductDto.class);

        return fakeStoreProductDto.toProduct();
    }
}
