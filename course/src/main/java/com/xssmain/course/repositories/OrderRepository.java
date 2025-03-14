package com.xssmain.course.repositories;

import com.xssmain.course.entities.Order;
import com.xssmain.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}