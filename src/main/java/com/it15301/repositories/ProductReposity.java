package com.it15301.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.it15301.entity.Product;

public interface ProductReposity extends JpaRepository<Product, Integer> {
	Product getById(Integer id);
	Page<Product> findByAvaliable(int i, Pageable pageable);
	List<Product> findByName(String name);
}
