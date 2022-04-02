package vallidation;

import model.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {
    @Override
    public void initialize(PhoneNumber constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return (value.length()>11 || value.length()<10);
//                &&(!number.startsWith("0"))&&(!number.matches("(^$|[0-9]*$)"));
    }
}