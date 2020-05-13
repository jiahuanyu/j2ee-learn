package me.jiahuan.springboot.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "gender", nullable = false)
    private Integer gender;

    @Column(name = "birth", nullable = false)
    private Long birth;
}
