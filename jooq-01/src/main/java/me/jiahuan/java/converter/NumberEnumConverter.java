package me.jiahuan.java.converter;

import org.jooq.impl.AbstractConverter;
import org.jooq.tools.Convert;

import javax.validation.constraints.NotNull;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class NumberEnumConverter<T extends Number, U extends Enum<U>> extends AbstractConverter<T, U> {

    private final String prop;

    private final Map<T, U> lookup;

    public NumberEnumConverter(Class<T> fromType, Class<U> toType, String prop) {
        super(fromType, toType);

        this.prop = prop;

        this.lookup = new LinkedHashMap<>();
        for (U u : toType.getEnumConstants()) {
            this.lookup.put(to(u), u);
        }
    }

    @Override
    public U from(T databaseObject) {
        return lookup.get(databaseObject);
    }

    @Override
    public T to(U userObject) {
        if (userObject == null) {
            return null;
        }
        try {
            Method propGetMethod = toType().getMethod("get" + firstLetterUpper(this.prop));
            return Convert.convert(propGetMethod.invoke(userObject), fromType());
        } catch (Exception e) {
            return null;
        }
    }

    private @NotNull String firstLetterUpper(@NotNull String value) {
        char[] values = value.toCharArray();
        if (values.length == 0) {
            return value;
        }
        values[0] -= 32;
        return String.valueOf(values);
    }
}
