package me.jiahuan.spring.annotation.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MacSystemCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String system = context.getEnvironment().getProperty("os.name");
        if (system == null) {
            return false;
        }
        return system.contains("Mac OS");
    }
}
