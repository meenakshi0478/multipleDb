package com.demo.multipleDb.controller;


import com.demo.multipleDb.mysql.entity.UserModel;
import com.demo.multipleDb.postgres.entity.ProductModel;
import com.demo.multipleDb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<ProductModel> createProduct(@RequestBody ProductModel productModel) {
        ProductModel createdProduct = productService.createProduct(productModel);
        return new ResponseEntity<>(createdProduct, HttpStatus.OK);
    }

}
