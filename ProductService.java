package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;
import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> getAll();
}
