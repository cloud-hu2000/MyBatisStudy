import com.CloudHu.MyBatis.Mapper.DynamicSQLMapper;
import com.CloudHu.MyBatis.Mapper.UserMapper;
import com.CloudHu.MyBatis.POJO.User;
import com.CloudHu.MyBatis.Utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class DynamicSQLTest {
    @Test
    public void testIf() throws IOException {
        //获取sqlSession
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //获取Mapper接口的实例对象
        DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);
        //测试功能
        List <User> list = dynamicSQLMapper.getUserByCondition(new User(5,"修改后的名字","123"));
        System.out.println(list);
    }

    @Test
    public void testDeleteMore() throws IOException {
        //获取sqlSession
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //获取Mapper接口的实例对象
        DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);
        //测试功能
        Integer [] nums = {6,7};
        int num = dynamicSQLMapper.deleteMoreByArray(nums);
        System.out.println(num);
    }
}
