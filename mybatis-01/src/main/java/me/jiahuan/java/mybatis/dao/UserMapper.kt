package me.jiahuan.java.mybatis.dao

import me.jiahuan.java.mybatis.pojo.User

interface UserMapper {
    fun queryAll(): List<User>
}