package me.jiahuan.java.mybatis.repository

import me.jiahuan.java.mybatis.pojo.User

interface UserMapper {
    fun queryAll(): List<User>
}