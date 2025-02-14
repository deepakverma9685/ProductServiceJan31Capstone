package com.scaler.productservicejan31capstone.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateFakeStoreProductDto
{
    private String name;
    private String description;
    private String category;
    private double price;
    private String imageUrl;
}
