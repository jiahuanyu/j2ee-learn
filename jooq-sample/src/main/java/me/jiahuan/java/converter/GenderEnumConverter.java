package me.jiahuan.java.converter;

import me.jiahuan.java.enums.Gender;

public class GenderEnumConverter extends NumberEnumConverter<Integer, Gender> {

    public GenderEnumConverter() {
        super(Integer.class, Gender.class, "code");
    }
}
