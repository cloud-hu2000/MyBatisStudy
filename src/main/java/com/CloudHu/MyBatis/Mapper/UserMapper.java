package com.CloudHu.MyBatis.Mapper;

import com.CloudHu.MyBatis.POJO.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int insertUser(User user);

    void updateUser();

    void deleteUser();

    User getUserById(int id);

    List<User> getAllUser();

    User checkLogin(String userName,String password);

    User checkLoginByParam(@Param("username") String userName, @Param("password")String password);

    List<User> getUserByLike(@Param("username") String username);

    int deleteMore(@Param("ids") String ids);

    User getUserByDynamicTableName(@Param("tablename")String tablename,@Param("id")int id);
}
