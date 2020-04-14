package me.jiahuan.java.mybatis.utils

import org.apache.ibatis.io.Resources
import org.apache.ibatis.session.SqlSession
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder


object MyBatisUtils {

    private var sqlSessionFactory: SqlSessionFactory

    init {
        val resource = "mybatis-config.xml"
        val inputStream = Resources.getResourceAsStream(resource)
        sqlSessionFactory = SqlSessionFactoryBuilder().build(inputStream)
    }

    fun getSqlSession(): SqlSession {
        return sqlSessionFactory.openSession()
    }
}