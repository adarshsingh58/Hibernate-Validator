package onilne.mrwallet.www.annotationinterface;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import onilne.mrwallet.www.Validator.MyValidator;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Constraint(validatedBy={MyValidator.class})
public @interface MyCustomValidation {
	
	String message() default "{default message}";
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default {};

}
