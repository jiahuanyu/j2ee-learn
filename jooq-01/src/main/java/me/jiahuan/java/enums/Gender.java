package me.jiahuan.java.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 性别枚举
 */
@Getter
@AllArgsConstructor
public enum Gender {
    FEMALE(10, "女"),
    MALE(100, "男");
    private Integer code;
    private String desc;
}
