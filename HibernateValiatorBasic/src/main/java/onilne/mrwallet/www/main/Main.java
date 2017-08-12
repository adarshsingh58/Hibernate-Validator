package onilne.mrwallet.www.main;

import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import onilne.mrwallet.www.beans.Student;

public class Main {
	
	public static void main(String[] args) {
		
		Student student=new Student();
		student.setAge(27);
		student.setUsername("Adarsh");
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		
		Set<ConstraintViolation<Student>> set= validator.validate(student);
		
		if(set.size()>0)
		{
			System.out.println(set.iterator().next().getMessage());
		}else
		{
			System.out.println("Nice Job");
		}
	}
}
