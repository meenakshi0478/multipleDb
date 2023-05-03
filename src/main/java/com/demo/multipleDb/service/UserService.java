package com.demo.multipleDb.service;


import com.demo.multipleDb.mysql.entity.UserModel;
import com.demo.multipleDb.mysql.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public UserModel createUser(UserModel userModel) {
        UserModel user = new UserModel();
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setEmail(userModel.getEmail());
        UserModel storedUserDetails = userRepo.save(user);
        return storedUserDetails;
    }
}
