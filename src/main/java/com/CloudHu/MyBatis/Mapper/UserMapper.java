package com.CloudHu.MyBatis.Mapper;

import com.CloudHu.MyBatis.POJO.User;

import java.util.List;

public interface UserMapper {
    int insertUser();

    void updateUser();

    void deleteUser();

    User getUserById();

    List<User> getAllUser();
}
