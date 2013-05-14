package com.unimedsci.edc.core.user;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * @author: Sting
 * @created: 13-5-10 下午1:55
 */
public class UserTest {
    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void testValidator() {
        User user = new User();
        user.setEmail("s");
        user.setPassword("12345678");
        Set<ConstraintViolation<User>> errors = validator.validate(user);
        for (ConstraintViolation<User> error : errors) {
            System.out.println(error.getPropertyPath() + error.getMessage());
        }
    }
}
