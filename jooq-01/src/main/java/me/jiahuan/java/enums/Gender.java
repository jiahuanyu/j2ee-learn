package me.jiahuan.java.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 性别枚举
 */
@Getter
@AllArgsConstructor
public enum Gender {
    FEMALE(0, "女"),
    MALE(1, "男");
    private Integer code;
    private String desc;
}
