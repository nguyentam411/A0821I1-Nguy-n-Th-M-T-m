package com.example.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<EXPDate, EXPDate> {
    @Override
    public void initialize(EXPDate constraintAnnotation) {

    }

    @Override
    public boolean isValid(EXPDate value, ConstraintValidatorContext context) {
        return (java.time.LocalDate.now().isBefore(java.time.LocalDate.now().minusMonths(3)));
//        return value!=null &&value.isA
    }
}
