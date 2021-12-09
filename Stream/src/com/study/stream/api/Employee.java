package com.study.stream.api;

import java.util.Objects;

public class Employee {

	private String name;
	private String email;
	private int id;
	private int age;
	
	public Employee(String name, String email, int id, int age) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, email, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", id=" + id + ", age=" + age + "]";
	}
	
	
}
