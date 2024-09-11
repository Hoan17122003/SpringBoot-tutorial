package com.tutorial.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.api.models.Product;
import com.tutorial.api.repository.ProductRepository;

import java.util.*;

@RestController
@RequestMapping(path = "/api/v1/product")
public class ProductController {

    // DI = Dependency Injection
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("")
    // String
    List<Product> getAllproduct() {
        return productRepository.findAll();
    }

    // add product for flag = 1 => save , and flag = 2 => update
    @PostMapping(path = "/post")
    Product AddProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    Product findProduct()

}
