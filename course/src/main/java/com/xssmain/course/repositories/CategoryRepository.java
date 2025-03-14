package com.xssmain.course.repositories;

import com.xssmain.course.entities.Category;
import com.xssmain.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}