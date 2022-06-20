package com.example.demo.validation;

import org.springframework.beans.factory.annotation.Configurable;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.util.Date;

//@Configurable
//public class EXPDateValidImpl implements ConstraintValidator<EXPDateValid, Date> {
//    @Override
//    public boolean isValid(Date value, ConstraintValidatorContext context) {
//        if(value == null)
//            return false;
//
////        Date after3months = Date.now().plusMonths(3);
//        return value.compareTo(after3months) > 0;
//    }
//}
