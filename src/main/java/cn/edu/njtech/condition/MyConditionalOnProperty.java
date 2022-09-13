package cn.edu.njtech.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(MyOnPropertyCondition.class)
@interface MyConditionalOnProperty {
    String value();

    String prefix() default "";

    String havingValue() default "";

    boolean matchIfMissing() default false;

    boolean relaxedNames() default true;
}
