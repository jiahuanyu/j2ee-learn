package me.jiahuan.java.converter;

import me.jiahuan.java.enums.Gender;
import org.jooq.impl.EnumConverter;

public class GenderEnumConverter extends EnumConverter<Integer, Gender> {

    public GenderEnumConverter() {
        super(Integer.class, Gender.class);
    }
}
