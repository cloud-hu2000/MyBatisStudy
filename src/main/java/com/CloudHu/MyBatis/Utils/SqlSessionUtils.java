package com.CloudHu.MyBatis.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtils {
    static public SqlSession getSqlSession() throws IOException {
       InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
       //获取sqlSessionFactoryBuilder
       SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
       //使用配置文件创建的流来获取sqlSessionFactory
       SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
       //获取sqlSession
       SqlSession sqlSession=sqlSessionFactory.openSession(true);
       return sqlSession;
   }
}
