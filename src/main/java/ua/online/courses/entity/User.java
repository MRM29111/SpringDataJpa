package ua.online.courses.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BaseEntity {

	//private String login;
	//private String password;
	

	@Column(name = "first_name", length = 20)
	private String firstName;

	@Column(name = "last_name", length = 20)
	private String lastName;
	
	@Column(name = "age", length = 3)
	private int age;
	
	@Column(name = "email", length = 30)
	private String email;
	
	//@Enumerated(EnumType.STRING)
	//private UserRole role;

	/*@OneToMany(mappedBy = "user")
	private List<Course> courses = new ArrayList<>();

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}*/

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}*/

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/*public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}*/

	@Override
	public String toString() {
		return "User [ email=" + email + ", firstName=" + firstName
				+ ", lastNmae=" + lastName + ", age=" + age + ", getId()=" + getId() + "]";
	}
//login=" + login + " password=" + password + ", , role=" + role + ",
}
