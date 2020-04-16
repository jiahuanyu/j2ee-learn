package me.jiahuan.java.strategy;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

public class JooqGeneratorStrategy extends DefaultGeneratorStrategy {
    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        return super.getJavaClassName(definition, mode);
    }
}
