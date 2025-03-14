package com.xssmain.course.repositories;

import com.xssmain.course.entities.Category;
import com.xssmain.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}