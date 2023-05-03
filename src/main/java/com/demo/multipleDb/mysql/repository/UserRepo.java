package com.demo.multipleDb.mysql.repository;

import com.demo.multipleDb.mysql.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<UserModel,Integer> {
}
