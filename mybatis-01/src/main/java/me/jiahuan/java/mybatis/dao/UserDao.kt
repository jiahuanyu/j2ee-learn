package me.jiahuan.java.mybatis.dao

import me.jiahuan.java.mybatis.pojo.User

interface UserDao {
    fun queryAll(): List<User>
}