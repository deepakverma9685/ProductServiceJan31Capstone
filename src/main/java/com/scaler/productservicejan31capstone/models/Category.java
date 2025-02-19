package com.scaler.productservicejan31capstone.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel
{
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
