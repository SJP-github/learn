package com.sjp.datavalidat.check;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MineMoneyValidator.class)//用于限制的类，MineMoneyValidator为验证类
public @interface Money {
    String message() default "不是金额形式";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
