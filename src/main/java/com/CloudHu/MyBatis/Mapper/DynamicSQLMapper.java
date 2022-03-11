package com.CloudHu.MyBatis.Mapper;

import com.CloudHu.MyBatis.POJO.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    /**
     *多条件查询
     **/
    List<User> getUserByCondition(User user);

    /**
     *通过数组实现批量删除
     **/
    int deleteMoreByArray(@Param("uids") Integer[] uids);
}
