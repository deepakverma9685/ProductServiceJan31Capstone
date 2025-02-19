package com.scaler.productservicejan31capstone.repositories;

import com.scaler.productservicejan31capstone.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

// JPARepository: 1st Argument: Table name;
// 2nd Argument: Type of primary key of the Table
public interface ProductRepository extends JpaRepository<Product, Long>
{
    Product save(Product product);

    List<Product> findAll();

    Optional<Product> findById(long id);

}
