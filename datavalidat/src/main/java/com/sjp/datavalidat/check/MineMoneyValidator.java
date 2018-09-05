package com.sjp.datavalidat.check;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class MineMoneyValidator implements ConstraintValidator<Money, Double>{

    //表示金额
    private String moneyReg="^\\d+(\\.\\d{1,2})?$";

    private Pattern moneyPattern = Pattern.compile(moneyReg);

    @Override
    public boolean isValid(Double value, ConstraintValidatorContext arg1) {
        if (value == null) {
            return true;
        }
        return moneyPattern.matcher(value.toString()).matches();
    }

    @Override
    public void initialize(Money constraintAnnotation) {

    }
}
