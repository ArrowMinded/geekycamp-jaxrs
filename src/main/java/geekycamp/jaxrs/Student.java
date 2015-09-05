package geekycamp.jaxrs;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Student {

	private String name;
	
	private String phone;
	
	public String getName(){

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		
		return name + ":" + phone;
	}

}
