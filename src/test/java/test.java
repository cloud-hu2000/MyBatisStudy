import com.CloudHu.MyBatis.Mapper.UserMapper;
import com.CloudHu.MyBatis.POJO.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    @Test
    public void testInsert(){
        try {
            //加载核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取sqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //使用配置文件创建的流来获取sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //获取sqlSession
            SqlSession sqlSession=sqlSessionFactory.openSession(true);
            //获取Mapper接口的实例对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            //测试功能
            User user = new User();
            user.setUserName("添加的名字");
            user.setPassword("456");
            userMapper.insertUser(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testUpdate(){
        try {
            //加载核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取sqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //使用配置文件创建的流来获取sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //获取sqlSession
            SqlSession sqlSession=sqlSessionFactory.openSession(true);
            //获取Mapper接口的实例对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            //测试功能
            userMapper.updateUser();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testDelete(){
        try {
            //加载核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取sqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //使用配置文件创建的流来获取sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //获取sqlSession
            SqlSession sqlSession=sqlSessionFactory.openSession(true);
            //获取Mapper接口的实例对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            //测试功能
            userMapper.deleteUser();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetUserById(){
        try {
            //加载核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取sqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //使用配置文件创建的流来获取sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //获取sqlSession
            SqlSession sqlSession=sqlSessionFactory.openSession(true);
            //获取Mapper接口的实例对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            //测试功能
            User user = userMapper.getUserById(4);
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAllUser(){
        try {
            //加载核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取sqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //使用配置文件创建的流来获取sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //获取sqlSession
            SqlSession sqlSession=sqlSessionFactory.openSession(true);
            //获取Mapper接口的实例对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            //测试功能
            List <User> list=userMapper.getAllUser();
            System.out.println(list.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCheckLogin(){
        try {
            //加载核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取sqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //使用配置文件创建的流来获取sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //获取sqlSession
            SqlSession sqlSession=sqlSessionFactory.openSession(true);
            //获取Mapper接口的实例对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            //测试功能
            User user = userMapper.checkLogin("修改后的名字", "123");
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCheckLoginByParam(){
        try {
            //加载核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取sqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //使用配置文件创建的流来获取sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //获取sqlSession
            SqlSession sqlSession=sqlSessionFactory.openSession(true);
            //获取Mapper接口的实例对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            //测试功能
            User user = userMapper.checkLogin("修改后的名字", "123");
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
