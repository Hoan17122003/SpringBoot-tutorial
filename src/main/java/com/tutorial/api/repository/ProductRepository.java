package com.tutorial.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.api.models.Product;

public interface ProductRepository extends IndexRepository<Product> {

}
