package cn.edu.njtech.Condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class MyOnPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(cn.edu.njtech.Condition.MyConditionalOnProperty.class.getName());
        String propertyName = (String) annotationAttributes.get("value");
        String value = (String) annotationAttributes.get("havingValue");
        String propertyValue = context.getEnvironment().getProperty(propertyName);


        if (propertyValue.equalsIgnoreCase(value)) {
            return true;
        }
        return false;
    }
}
