package onilne.mrwallet.www.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;


public class Student {

	@Size(min=2,max=6)
	private String username;
	@Max(25)
	private int age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
