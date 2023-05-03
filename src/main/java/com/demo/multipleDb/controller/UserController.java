package com.demo.multipleDb.controller;


import com.demo.multipleDb.mysql.entity.UserModel;
import com.demo.multipleDb.mysql.repository.UserRepo;
import com.demo.multipleDb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepo userRepository;

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<UserModel> createUser(@RequestBody UserModel userModel) {
            UserModel createdUser = userService.createUser(userModel);
            return new ResponseEntity<>(createdUser, HttpStatus.OK);
    }
}
