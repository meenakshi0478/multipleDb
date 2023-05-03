package com.demo.multipleDb.service;

import com.demo.multipleDb.mysql.entity.UserModel;
import com.demo.multipleDb.postgres.entity.ProductModel;
import com.demo.multipleDb.postgres.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;
    public ProductModel createProduct(ProductModel productModel) {
        ProductModel product = new ProductModel();
        product.setCode(productModel.getCode());
        product.setName(productModel.getName());
        product.setPrice(productModel.getPrice());
        ProductModel storedProductDetails = productRepo.save(product);
        return storedProductDetails;

    }
}
