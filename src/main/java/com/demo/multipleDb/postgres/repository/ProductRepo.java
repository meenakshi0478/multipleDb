package com.demo.multipleDb.postgres.repository;

import com.demo.multipleDb.postgres.entity.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductModel,Integer> {
}
