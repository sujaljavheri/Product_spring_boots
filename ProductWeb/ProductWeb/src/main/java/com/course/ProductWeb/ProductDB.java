package com.course.ProductWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDB extends JpaRepository <Product , Integer> {
    List<Product> findByNameIgnoreCase(String name);
}
