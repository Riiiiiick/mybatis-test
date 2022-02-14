package com.rick.dao;

import com.rick.pojo.Dept;
import com.rick.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
//        获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

//       执行SQL  getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Dept> userList = userMapper.getUserList();

        for (Dept user : userList){
            System.out.println(user);
        }
        sqlSession.close();
    }


}
