package me.jiahuan.springboot.repository;

import me.jiahuan.springboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
