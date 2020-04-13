package me.jiahuan.java.mybatis.utils

import org.apache.ibatis.io.Resources
import org.apache.ibatis.session.SqlSession
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder
import java.lang.Exception


object MyBatisUtils {

    private lateinit var sqlSessionFactory: SqlSessionFactory

    init {
        val resource = "mybatis-config.xml"
        val inputStream = Resources.getResourceAsStream(resource)
        sqlSessionFactory = SqlSessionFactoryBuilder().build(inputStream)
    }

    fun getSqlSession(): SqlSession {
        if (!::sqlSessionFactory.isInitialized) {
            throw Exception("初始化异常")
        }
        return sqlSessionFactory.openSession()
    }
}