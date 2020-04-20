package me.jiahuan.java.mybatis.repository

import me.jiahuan.java.mybatis.utils.MyBatisUtils
import org.junit.Test

class UserMapperTest {
    @Test
    fun test() {
        val sqlSession = MyBatisUtils.getSqlSession()
        val userDaoMapper = sqlSession.getMapper(UserMapper::class.java)
        val users = userDaoMapper.queryAll()
        users.forEach {
            println(it)
        }
        sqlSession.close()
    }
}