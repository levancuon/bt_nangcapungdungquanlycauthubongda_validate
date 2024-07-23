

package org.example.bt_nangcapungdungquanlycauthubongda_validate.validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class AgeValidator implements ConstraintValidator<ValidAge, Date> {

    @Override
    public void initialize(ValidAge constraintAnnotation) {
    }

    @Override
    public boolean isValid(Date dateOfBirth, ConstraintValidatorContext context) {
        if (dateOfBirth == null) {
            return false; // hoặc trả về true nếu bạn cho phép giá trị null
        }
        LocalDate dob = new java.sql.Date(dateOfBirth.getTime()).toLocalDate();
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(dob, currentDate).getYears();
        return age >= 16 && age <= 100;
    }
}