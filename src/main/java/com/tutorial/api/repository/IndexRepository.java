package com.tutorial.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IndexRepository<T> extends JpaRepository<T, Long> {
    
}
