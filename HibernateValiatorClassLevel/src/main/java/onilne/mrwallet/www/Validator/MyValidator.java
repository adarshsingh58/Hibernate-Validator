package onilne.mrwallet.www.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import onilne.mrwallet.www.annotationinterface.MyCustomValidation;
import onilne.mrwallet.www.beans.Student;

public class MyValidator implements ConstraintValidator<MyCustomValidation, Student> {

	public void initialize(MyCustomValidation arg0) {

		arg0.message();			
	}

	public boolean isValid(Student arg0, ConstraintValidatorContext arg1) {
		if(arg0.getUsername().length()>4){
		return false;
		}
		else
			return true;
	}

}
