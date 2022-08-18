package ua.lviv.lgs.hbm.xml;

import java.util.Objects;

public class Person {

	private Integer id ;
	private String first_name,last_name;
	private Integer age; 
	
	public Person() {
		
	}
	public Person(Integer id, String first_name, String last_name,Integer age) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, first_name, id, last_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(age, other.age) && Objects.equals(first_name, other.first_name)
				&& Objects.equals(id, other.id) && Objects.equals(last_name, other.last_name);
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", age=" + age + "]";
	}
	
	
	
	
}
