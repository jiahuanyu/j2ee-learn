package me.jiahuan.java.mybatis.dao

import me.jiahuan.java.mybatis.utils.MyBatisUtils
import org.junit.Test

class UserDaoTest {
    @Test
    fun test() {
        val sqlSession = MyBatisUtils.getSqlSession()
        val userDaoMapper = sqlSession.getMapper(UserDao::class.java)
        val users = userDaoMapper.queryAll()
        users.forEach {
            println(it)
        }
        sqlSession.close()
    }
}